
package Modelo;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author duoc
 */
public class UsuarioDAO {
    Conexion conn;
    
    public UsuarioDAO(){
    conn = new Conexion(); 
}
    public String ingresarUsuario(Usuario usu)
    {
            String mensaje = null;
         Connection acceso = conn.getCnn();
        
        try {
            PreparedStatement ps = acceso.prepareStatement("insert into usuario (rut,nombre,sexo,profesion,edad) values (?,?,?,?,?)");
            ps.setString(1, usu.getRut());
            ps.setString(2, usu.getNombre());
            ps.setString(3, usu.getSexo());
            ps.setString(4, usu.getProfesion());
            ps.setInt(5, usu.getEdad());
            int rs=ps.executeUpdate();
            if(rs>0){
                mensaje="Usuario ingresado correctamente";
            }
        }catch(Exception ex)
        {
            mensaje="Error en el insertar usuario"+ex.getMessage();
        }
        return mensaje;
    }
}
