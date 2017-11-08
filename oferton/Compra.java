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
public class Compra implements ProductoDescontable{
    
    private Producto unProducto;
    private String fechaCompra;
    private int costoDespacho;

    public Compra() {
    }

    public Compra(Producto unProducto, String fechaCompra, int costoDespacho) {
        this.unProducto = unProducto;
        this.fechaCompra = fechaCompra;
        this.costoDespacho = costoDespacho;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCostoDespacho() {
        return costoDespacho;
    }

    public void setCostoDespacho(int costoDespacho) {
        this.costoDespacho = costoDespacho;
    }

 

    @Override
    public String toString() {
        return "Compra{" + "unProducto=" + unProducto + ", fechaCompra=" + fechaCompra + ", costoDespacho=" + costoDespacho + '}';
    }
    
    
    
    

  

    @Override
    public String consultarStock(int cantidadCompra) {
       if (cantidadCompra> getUnProducto().getStock())
       {
            System.out.println("Error el stock es menor a la cantidad requerida");
            return "Stock insuficiente";
       }
       else
       {
            System.out.println("Stock suficiente para la venta");
            return "Stock suficiente";
       }
    }
    

    @Override
    public int consultarTotal(int cantidadCompra, String dia) {
       
        int total =0;
        float desc = 0;
        // calculamos el  total a pagar afuera
        total = cantidadCompra* getUnProducto().getPrecioVenta() + getCostoDespacho();
                
        if (getUnProducto() instanceof Carne && dia.equalsIgnoreCase("MIERCOLES"))
        {
             desc = total*PORCENTAJE_DESCUENTO_CARNE; // obtengo el descuenta a la carne  
        
        }
        else
        {
              if (getUnProducto() instanceof Fruta && dia.equalsIgnoreCase("LUNES"))
              {
              
                 desc = total*PORCENTAJE_DESCUENTO_FRUTA; // obtengo el descuenta a la carne  
              
              }
              else
              {
                    if (dia.equalsIgnoreCase("JUEVES"))
                    {
                          desc = total*PORCENTAJE_ADICIONAL; 
                    }
                  
              }
        }
        
        
        total = total - (int) desc;
        
        return total;
        
        
    }
    
    
    
    
    
    
    
}
