/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oferton;

/**
 *
 * @author solea
 */
public class Proveedor {
    private int numeroUnico;
    private String nombre;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int numeroUnico, String nombre, String telefono) {
        setNombre(nombre);
        setNumeroUnico(numeroUnico);
        setTelefono(telefono);
    }

    public int getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(int numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            System.out.println("Error nombre incorrecto");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "numeroUnico=" + numeroUnico + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
}
