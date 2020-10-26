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
public class Facturacion {
    private Producto producto;
    private int n_productos;
    private float subtotal_con_iva;
    private float precio_del_iva;
    private float total_sin_iva_incliudo;
    private float producto_multi_iva;
    private float producto_mas_iva;

    public Facturacion(Producto producto, int n_productos) {
        this.producto = producto;
        this.n_productos = n_productos;
        
        this.subtotal_con_iva = subtotal_con_iva = n_productos*(producto.getPrecioUnitario_iva()+(producto.getPrecioUnitario_iva()*(producto.getPorcentaje_de_iva()/100)));
        this.precio_del_iva = n_productos*(producto.getPrecioUnitario_iva()*(producto.getPorcentaje_de_iva()/100));
        this.total_sin_iva_incliudo = n_productos*producto.getPrecioUnitario_iva();
        this.producto_multi_iva=this.producto.getPrecioUnitario_iva()*(producto.getPorcentaje_de_iva()/100);
        this.producto_mas_iva=this.producto_multi_iva+this.producto.getPrecioUnitario_iva();
    }
    
    public void imprimir_facturacion(){
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("  "+this.producto.getCodigo()+"  | "+this.producto.getArticulo()+"     |   "+this.producto_mas_iva+"   |  "+this.producto.getPorcentaje_de_iva()+"  |      "+this.n_productos+"     |    "+this.total_sin_iva_incliudo+"     | "+this.precio_del_iva+"  |   "+this.subtotal_con_iva+"  | ");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    
}
