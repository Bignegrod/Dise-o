/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author duoc
 */
public class LibroControlador {
    
    private LibroDAO libroDao;

    public LibroControlador() {
        libroDao = new LibroDAO();
    }
    
    public String agregarLibro(boolean prestado, int codigo, 
                                int anioPublicacion, String titulo, 
                                String autor, String editorial) throws Exception
    {
           
        Libro lib = new Libro(prestado,codigo, anioPublicacion, titulo,
                               autor, editorial);
        String mensaje = libroDao.ingresarLibro(lib);
        return mensaje;
    }      
    public String modificarLibro(boolean prestado, int codigo, 
                                int anioPublicacion, String titulo, 
                                String autor, String editorial) throws Exception
    {
           
        Libro lib = new Libro(prestado,codigo, anioPublicacion, titulo,
                               autor, editorial);
        String mensaje = libroDao.modificarLibro(lib);
        return mensaje;
    } 
    public String eliminar(int codigo)
    {
        String mensaje= libroDao.eliminarLibro(codigo);
        return mensaje;
    }
    
    public ArrayList<Libro> buscarTodoLibro() throws Exception
    {
          ArrayList<Libro> list = libroDao.buscarTodosLibro();
          
          return list; 
    }
    public Libro buscarLibro(int codigo) throws Exception{
        Libro lib= libroDao.buscarLibro(codigo);
        return lib;
    }
    
}
