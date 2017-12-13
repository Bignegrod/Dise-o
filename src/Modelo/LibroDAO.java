/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BD.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duoc
 */
public class LibroDAO {
     Conexion conn;

    public LibroDAO() {
        conn = new Conexion(); // creando instancia de conexion
                               // conectando con base de datos  
        
        
        
    }
     
    
    public String ingresarLibro(Libro lib)
    {
         String mensaje = null;
         Connection acceso = conn.getCnn();
        
        try {
            PreparedStatement ps = acceso.prepareStatement("insert into documento (codigo, anio, titulo, autor, editorial) values (?,?,?,?,?)");
            ps.setInt(1, lib.getCodigo());
            ps.setInt(2, lib.getAnioPublicacion());
            ps.setString(3, lib.getTitulo());
            ps.setString(4, lib.getAutor());
            ps.setString(5, lib.getEditorial());
            
            int rs=ps.executeUpdate();
            if (rs>0)
            {
                 String prestado = "N";
                 if ( lib.isPrestado())
                 {
                     prestado = "S";
                 }    
                
                PreparedStatement psL = acceso.prepareStatement("insert into libro (codigo, prestado) values (?,?)");
                psL.setInt(1,lib.getCodigo() );
                psL.setString(2, prestado);
                
                int rsL = psL.executeUpdate();
                if (rsL>0)
                {
                   mensaje = " Ingreso exitoso";  
                }
                
                else{
                   mensaje = "ingreso no exitoso";
                }
             }
            else
            {
               mensaje ="Ingreso no exitoso";
            }
            
         } catch (SQLException ex) {
             mensaje = "error al ingresar un documento"+ ex.getMessage();
         }
         
         
        return mensaje;
    
    }
     public String eliminarLibro(int codigo)
    {
         String mensaje = null;
         Connection acceso = conn.getCnn();
        
        try {
            PreparedStatement ps = acceso.prepareStatement("delete from documento where codigo=?"); 
            ps.setInt(1,codigo);
            
            int rs=ps.executeUpdate();
            if (rs>0)
            {
                 mensaje="Elimiacion exitosa";
             }
            else
            {
               mensaje ="Eliminacion no exitosa";
            }
            
         } catch (SQLException ex) {
             mensaje = "error al eliminar un documento"+ ex.getMessage();
         }
         
         
        return mensaje;
    
    }
    
    public String modificarLibro(Libro lib)
    {
         String mensaje = null;
         Connection acceso = conn.getCnn();
        
        try {
            PreparedStatement ps = acceso.prepareStatement("update documento set anio=?,titulo=?,autor=?,editorial=? where codigo=?");
            
            ps.setInt(1, lib.getAnioPublicacion());
            ps.setString(2, lib.getTitulo());
            ps.setString(3, lib.getAutor());
            ps.setString(4, lib.getEditorial());
            ps.setInt(5, lib.getCodigo());
            
            int rs=ps.executeUpdate();
            if (rs>0)
            {
                 String prestado = "N";
                 if ( lib.isPrestado())
                 {
                     prestado = "S";
                 }    
                
                PreparedStatement psL = acceso.prepareStatement("update libro set prestado=? where codigo=?");
                psL.setString(1, prestado);
                 psL.setInt(2,lib.getCodigo() );
                
                int rsL = psL.executeUpdate();
                if (rsL>0)
                {
                   mensaje = " Modificar exitoso";  
                }
                
                else{
                   mensaje = "Moidificar no exitoso";
                }
             }
            else
            {
               mensaje ="Modificar no exitoso";
            }
            
         } catch (SQLException ex) {
             mensaje = "error al modificar un documento"+ ex.getMessage();
         }
         
         
        return mensaje;
    
    }
    
    
    public ArrayList<Libro> buscarTodosLibro() throws Exception
    {
    
        ArrayList<Libro> lista = new ArrayList();

        Connection acceso = conn.getCnn();
         
        
        PreparedStatement ps = acceso.prepareStatement("select a.codigo, a.anio, a.titulo, a.autor, a.editorial, b.prestado  from documento a, libro b where a.codigo = b.codigo ");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next())
        {
              Libro lib = new Libro();
              lib.setCodigo(rs.getInt(1));
              lib.setAnioPublicacion(rs.getInt(2));
              lib.setTitulo(rs.getString(3));
              lib.setAutor(rs.getString(4));
              lib.setEditorial(rs.getString(5));
              if (rs.getString(6).equals("S")){
                 lib.setPrestado(true);
              }
              else
              {
                 lib.setPrestado(false);
              }
        
              lista.add(lib);
        }
        
        
        return lista;
    
    }
    
    
    
    public Libro buscarLibro(int codigo) throws Exception
    {
    
        Libro lib= new Libro();

        Connection acceso = conn.getCnn();
         
        
        PreparedStatement ps = acceso.prepareStatement("select a.codigo, a.anio, a.titulo, a.autor, a.editorial, b.prestado  from documento a, libro b where a.codigo = b.codigo and a.codigo=? ");
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next())
        {
              
              lib.setCodigo(rs.getInt(1));
              lib.setAnioPublicacion(rs.getInt(2));
              lib.setTitulo(rs.getString(3));
              lib.setAutor(rs.getString(4));
              lib.setEditorial(rs.getString(5));
              if (rs.getString(6).equals("S")){
                 lib.setPrestado(true);
              }
              else
              {
                 lib.setPrestado(false);
              }
        
              
        }
        else{
            throw new Exception("Sin datos");
        }
        
        
        return lib;
    
    }
    
    
}
