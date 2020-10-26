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
public class Producto {
    private int codigo;
    private String articulo;
    private float precioUnitario_iva;
    private float porcentaje_de_iva;

    public Producto(int codigo, String articulo, float precioUnitario_iva, float porcentaje_de_iva) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.precioUnitario_iva = precioUnitario_iva;
        this.porcentaje_de_iva = porcentaje_de_iva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public float getPrecioUnitario_iva() {
        return precioUnitario_iva;
    }

    public void setPrecioUnitario_iva(float precioUnitario_iva) {
        this.precioUnitario_iva = precioUnitario_iva;
    }

    public float getPorcentaje_de_iva() {
        return porcentaje_de_iva;
    }

    public void setPorcentaje_de_iva(float porcentaje_de_iva) {
        this.porcentaje_de_iva = porcentaje_de_iva;
    }
    
    public void imporimir_producto(){
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println(this.codigo+" | "+this.articulo);
            System.out.println("-----------------------------------------------------------------------------------------");
    }
}
