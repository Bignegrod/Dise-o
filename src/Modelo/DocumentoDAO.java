/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BD.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duoc
 */
public class DocumentoDAO {
     Conexion conn;

    public DocumentoDAO() {
        conn = new Conexion(); // creando instancia de conexion
                               // conectando con base de datos  
        
    }
     
     
    
    public String eliminarDocumento(Libro lib)
    {
        Connection acceso  = conn.getCnn();
        String mensaje = null;
        try {
             PreparedStatement ps = acceso.prepareStatement(" delete from documento where codigo=? ");
             ps.setInt(1, lib.getCodigo());
             
             int rs = ps.executeUpdate();
             if (rs >0)
             {
                  mensaje = "Eliminacion Exitosa";
             }
             else
             {
                mensaje = "Eliminacion no exitosa";
             }
             
         } catch (SQLException ex) {
               mensaje = "Error en ejecución de eliminar";
         }
         
         
        return mensaje; 
         
         
         
    
    }
     
     
     
}
