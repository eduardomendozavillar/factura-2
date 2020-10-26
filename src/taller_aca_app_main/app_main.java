/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_aca_app_main;

import java.util.ArrayList;
import java.util.Scanner;
import talle_aca_class.Facturacion;
import talle_aca_class.Producto;
import talle_aca_class.Listar_elementos;

/**
 *
 * @author Acer
 */
public class app_main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        ArrayList<Facturacion> factura = new ArrayList<Facturacion>();
        
        productos.add(new Producto(123,"zapato",10000,19) );
        productos.add(new Producto(456,"sueter",120000,19) );
        
        
        Listar_elementos listar = new Listar_elementos();
        Scanner sc = new Scanner(System.in);
        Scanner iva =new Scanner (System.in);
        
        int opcion = 0;
        while(opcion!=-1){
            int cod_producto = 0, n_producto = 0;
            float PIva = 0;
            
            listar.listar_productos(productos);
            System.out.println("Ingrese el codigo del producto que desea comprar o -1 si desea salir");
            cod_producto = sc.nextInt();
             
            if(cod_producto!=-1){
                System.out.println("Ingrese la cantidad de unidades");
                n_producto = sc.nextInt();
                System.out.println("Ingrese el % del Iva");
                PIva = iva.nextFloat();
                for (Producto product: productos) {
                    if(product.getCodigo()==cod_producto){
                        product.setPorcentaje_de_iva(PIva);
                        Facturacion faturacion = new Facturacion(product,n_producto);
                        factura.add(faturacion);
                        break;
                        
                    }
                }
            }else{
                opcion = -1;
            }
            
        }
        
        listar.listar_factura(factura);
    }
    
}
