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
/**
 *
 * @author NEISER
 */
public class Usuario {
private int idUsuario;
private String user;
private String pass;

    public Usuario(int idUsuario, String user, String pass) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.pass = pass;
    }

    public Usuario (ResultSet rs){
    try{
    this.idUsuario= rs.getInt(1);
    this.user=rs.getString(2);
    this.pass= rs.getString(3);
    }catch (Exception s){
    }
        
    
    
    }

    public String getUsuarioText(){
     return("ID: "+ idUsuario +" USER: "+ user + " PASSWORD: "+ pass);
     
     }
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    

    public Usuario(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    public void imprimirDatos(){
      System.out.println("IDUSUARIO: "+ idUsuario +" USER: "+ user + " PASSWORD: "+ pass);
       
    }
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

    
}
