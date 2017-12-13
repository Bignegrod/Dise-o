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
public abstract class Documento {
  protected int codigo,anioPublicacion;
  protected String titulo, autor, editorial;

    public Documento() {
    }

    public Documento(int codigo, int anioPublicacion, String titulo, 
            String autor, String editorial) throws Exception  {
        setAnioPublicacion(anioPublicacion);
        setAutor(autor);
        setCodigo(codigo);
        setEditorial(editorial);
        setTitulo(titulo);
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setCodigo(int codigo) throws Exception {
//       try{ 
            if(codigo>0)
            {
                this.codigo = codigo;
            }
            else
            {
                
                throw new Exception("Error codigo mayor 0");
            }

    
    }
    public void setAnioPublicacion(int anioPublicacion) throws Exception {
        if(anioPublicacion>1900)
        {
           this.anioPublicacion = anioPublicacion;
        }
        else
        {
            throw new Exception("error año debe ser mayor a 1900");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) throws Exception {
        if (autor!=null){
        this.autor = autor;}
        else
        {
        
            throw  new Exception("Error autor no puede ser nulo");
        }
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Documento{" + "codigo=" + codigo + ", anioPublicacion=" + anioPublicacion + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
  
  
  
    
}
