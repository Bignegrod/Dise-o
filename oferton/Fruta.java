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
public class Fruta  extends Producto{
    protected boolean esOrganica;

    public Fruta() {
    }

    public Fruta(boolean esOrganica, int codigo, int precioVenta, boolean esPremium, int stock, Proveedor proveedor) {
        super(codigo, precioVenta, esPremium, stock, proveedor);
        setEsOrganica(esOrganica);
    }

    public boolean isEsOrganica() {
        return esOrganica;
    }

    public void setEsOrganica(boolean esOrganica) {
        this.esOrganica = esOrganica;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Fruta{" + "esOrganica=" + esOrganica + '}';
    }
    
    
}
