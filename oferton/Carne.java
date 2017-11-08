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
public class Carne extends Producto{
    protected char categoria;
    protected String tipoCorte;

    public Carne() {
        super();
    }

    public Carne(char categoria, String tipoCorte, int codigo, int precioVenta, boolean esPremium, int stock, Proveedor proveedor) {
        super(codigo, precioVenta, esPremium, stock, proveedor);
        setTipoCorte(tipoCorte);
        setCategoria(categoria);
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        if (categoria=='V' || categoria=='A')
            this.categoria = categoria;
        else
            System.out.println("Error en la categoria de la carne");
    }

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCarne{" + "categoria=" + categoria + ", tipoCorte=" + tipoCorte + '}';
    }
    
    
    
    
    
}
