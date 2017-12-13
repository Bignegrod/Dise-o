/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;


public class UsuarioControlador {

    private UsuarioDAO usuDao;
    
    public UsuarioControlador(){
        usuDao= new UsuarioDAO();
    }

    public String agregarUsuario(String rut,String nombre,
                                String sexo,String profesion,int edad) throws Exception{
       Usuario usu = new Usuario(rut,nombre,sexo,profesion,edad);
       String mensaje=usuDao.ingresarUsuario(usu);
       return mensaje;
    }
}
