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
public class Revista extends Documento{
     protected double volumen;
     protected int numero;
     protected char idioma;
     protected String mes;

    public Revista() {
        super();
    }

    public Revista(double volumen, int numero, String mes, int codigo, int anioPublicacion, String titulo, String autor, String editorial, char idioma) throws Exception {
        super(codigo, anioPublicacion, titulo, autor, editorial);
        setMes(mes);
        setNumero(numero);
        setVolumen(volumen);
        setIdioma(idioma);
    }

    public double getVolumen() {
        return volumen;
    }

    public int getNumero() {
        return numero;
    }

    public String getMes() {
        return mes;
    }

    public void setVolumen(double volumen) throws Exception {
        if(volumen>=1.0)
        {
        this.volumen = volumen;
        }
        
        else
        {
            throw new Exception("Error volumen revista minimo 1.0");
        }
        
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMes(String mes) throws Exception {
        if(mes!=null)
        {
          this.mes = mes;
        }
        else
        {
           throw new  Exception("Error mes no puede ser nulo");
        }
    }

    public char getIdioma() {
        return idioma;
    }

    public void setIdioma(char idioma) throws Exception {
        if(idioma =='E' || idioma=='I'){
        this.idioma = idioma;}
        else
        {
            throw new Exception("Error idioma debe ser I o E");
        }
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"Revista{" + "volumen=" + volumen + ", numero=" + numero + ", mes=" + mes + '}';
    }
     
     
    
    
}
