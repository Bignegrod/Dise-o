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
public class Producto  {
    protected int codigo;
    protected int precioVenta;
    protected boolean esPremium;
    protected int stock;
    protected Proveedor proveedor;

    public Producto() {
    }

    public Producto(int codigo, int precioVenta, boolean esPremium, int stock, Proveedor proveedor) {
         setCodigo(codigo);
        setEsPremium(esPremium);
        setPrecioVenta(precioVenta);
        setStock(stock);
        setProveedor(proveedor);
        
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

  

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        if (precioVenta>=100)
            this.precioVenta = precioVenta;
        else
            System.out.println("Error en precio de Venta");
    }

    public boolean isEsPremium() {
        return esPremium;
    }

    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precioVenta=" + precioVenta + ", esPremium=" + esPremium + ", stock=" + stock + ", proveedor=" + proveedor + '}';
    }
    
    
    
    
    
    

    
    
    
    
}
