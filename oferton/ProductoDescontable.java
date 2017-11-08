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
public interface ProductoDescontable {
    public static final float PORCENTAJE_DESCUENTO_CARNE = 0.11f;
    public static final float PORCENTAJE_DESCUENTO_FRUTA= 0.08f;
    public static final float PORCENTAJE_ADICIONAL= 0.03f;
    
    
    public String consultarStock(int cantidadCompra);
    public int  consultarTotal ( int cantidadCompra, String dia);
    
}
