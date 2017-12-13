/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author duoc
 */
public class Usuario {
    private String rut,nombre,sexo,profesion;
    private int edad;

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String sexo, String profesion, int edad) throws Exception {
        setRut(rut);
        setNombre(nombre);
        setSexo(sexo);
        setProfesion(profesion);
        setEdad(edad);
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
        if(rut!=null){
        this.rut = rut;
        }else{
            throw new Exception("Error rut nulo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rut=" + rut + ", nombre=" + nombre + ", sexo=" + sexo + ", profesion=" + profesion + ", edad=" + edad + '}';
    }
    
    
}
