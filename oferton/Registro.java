/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oferton;

import java.util.ArrayList;



/**
 *
 * @author solea
 */
public class Registro {
    private static final ArrayList<Producto> lista = new ArrayList();

    public Registro() {
    }
    
    public boolean guardar(Producto prod)
    {
        for (Producto guardar: lista)
        {
             if(guardar.getCodigo()== prod.getCodigo())
             {
                 System.out.println("Error el codigo ya esta registrado");
                   return false;
             }
        
        }
       
        lista.add(prod);
        System.out.println("Producto agregado");
        return true;
        
        
    }
    
    
    public int cantidadPremium()
    {
        int cant =0;
    
           for(Producto pp: lista)
           {
               //solo consideramos la carne porque queremos contar los que son categoria V y la Fruta no tiene ese atributo
               if(pp instanceof Carne)
               {
                   Carne cc = (Carne) pp; // creamos una variable de paso en la cual asegueramos que se carne con el instanceof de arriba
                    if (pp.isEsPremium() && cc.getCategoria()=='V')
                    {
                          cant++;
                    }
               }
           
           }
         
        return cant;   
           
           
    }
    
    public boolean eliminar ( int codigo){
    
      for (Producto pp: lista)
        {
             if(pp.getCodigo()== codigo)
             {
                 System.out.println("codigo eliminado");
                 lista.remove(pp);
                   return true;
             }
        
        }
        System.out.println("Producto no eliminado pq no se encuntra registrado");
        return false;
    
    }
    
    
    public void listar()
    {
        for (Producto pp: lista)
        {
            System.out.println(pp);
        }
    
    
    
    }
    
}
