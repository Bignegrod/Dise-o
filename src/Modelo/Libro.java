package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author duoc
 */
public class Libro extends Documento{
    protected boolean prestado;

    public Libro() {
        super();
    }

    public Libro(boolean prestado, int codigo, int anioPublicacion, String titulo, String autor, String editorial) throws Exception {
        super(codigo, anioPublicacion, titulo, autor, editorial);
        setPrestado(prestado);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "prestado=" + prestado + '}';
    }
    
    
    
    
}
