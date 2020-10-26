/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talle_aca_class;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Listar_elementos {
    
     public void listar_productos(ArrayList<Producto> lista_de_productos){
        System.out.println("Lista de Productos");
        for(Producto product:lista_de_productos){
            product.imporimir_producto();
        }
    }
     
      public void listar_factura(ArrayList<Facturacion> lista_de_facturas){
        System.out.println("\n\n\n\n\n\n");
          System.out.println("                                          FACTURA");
          System.out.println("\n");
          System.out.println("codigo"+" | "+"articulo"+" | "+"unitario(IVA)"+" | "+"%(IVA)"+" | "+"n.productos  | "+"  Sub Total"+" | "+"  (IVA) "+"  | "+"Total"+"     | ");
        for(Facturacion fact:lista_de_facturas){
            fact.imprimir_facturacion();
            System.out.println("\n\n\n\n\n");
        }
    }
}
