/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconexionbd;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NEISER
 */
public class DatabaseConnection {
    
    private static final String URL="jdbc:mysql://localhost:3306/test";
    private static final String USER="root";
    private static final String PASSWORD="admin";
    
    
    public static Connection getConnection(){
    Connection connection=null;
    
    try{
        connection= DriverManager.getConnection(URL,USER,PASSWORD);
        System.out.println("Connection established successfully.");
        
    }catch (SQLException e){
        e.printStackTrace();
    
    }
    return connection;
    }
    
      public static void main(String[] args) {
       Connection conexion= getConnection();
      try{
          Statement st=conexion.createStatement();
          DataAccessUsuario dao =new DataAccessUsuario(st);
          
          //ResultSet rs=st.executeQuery("Select * from usuario");
          List<Usuario> usuarios = dao.getListaUsuarios();
          //iterarResultado(st);
             /*********************************/
          Usuario user =new Usuario("Marcos","holamundo");
          DataAccessUsuario dao2=new DataAccessUsuario(st,user);
            dao2.insertarUsuario();
             /*************************************************/
          Usuario userEliminar = new Usuario (6);
          DataAccessUsuario dao3=new DataAccessUsuario(st,user);
            dao3.eliminarUsuario();
      
      }catch(Exception s){
      }
      }

    
    
    
    
}
