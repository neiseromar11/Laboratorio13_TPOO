/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploconexionbd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NEISER
 */
public class DataAccessUsuario {
    
    private Statement st;
    private Usuario user;
    public DataAccessUsuario(Statement st) {
        this.st = st;
    }

    public DataAccessUsuario(Statement st, Usuario user) {
        this.st = st;
        this.user = user;
    }
    
    public  void eliminarUsuario() throws SQLException {
    st.execute("delete from usuario where idusuario="+user.getIdUsuario());
    }

    public  void insertarUsuario() throws SQLException {
        String nuevoUsuario=user.getUser();
        String nuevoPass=user.getPass();
        
        st.execute("Insert into usuario (user,pass) values('"+nuevoUsuario+"','"+nuevoPass+"')");
      }
      
   /*  private static void iterarResultado (ResultSet rs) throws SQLException{
      while(rs.next()){
            Usuario usuario = new Usuario(rs);
            usuario.imprimirDatos();
        }
    
     } */
    public  List <Usuario> getListaUsuarios() throws SQLException {
        ResultSet rs=st.executeQuery("Select * from usuario");
        List<Usuario> usuarios=new ArrayList<>();
        while(rs.next()){
            Usuario usuario = new Usuario(rs);
           usuarios.add(usuario);     
        }
        return usuarios;
    }
}
