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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proveedor pp1= new Proveedor(1, "CarnesProd","333333333");
        Proveedor pp2= new Proveedor(2, "FrutasProd","333333333");
        Carne cc1 = new Carne('V', "lomo", 1, 2000, true, 30, pp1);
        Carne cc2 = new Carne('A', "filete", 2, 3000, true, 40, pp1);
        
        Fruta fru1 = new Fruta(true, 3, 589, true, 10, pp2);
         Fruta fru2 = new Fruta(false, 4, 800, false, 10, pp2);
        
        Compra com = new Compra(cc1, "20-10-2017", 2000);
        
        com.consultarStock(7);
        System.out.println("///////////////////////");
        
        System.out.println(com.consultarTotal(10, "LUNES"));
         
        Registro llamar = new Registro();
        
        llamar.guardar(cc1);
        llamar.guardar(cc2);
        llamar.guardar(fru1);
        llamar.guardar(fru2);
         
        llamar.listar();
         llamar.eliminar(1);
         System.out.println(")))))))))))))))))))))))))))))");
         llamar.listar();
         
         
    }
    
}
