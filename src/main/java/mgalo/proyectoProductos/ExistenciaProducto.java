/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mgalo.proyectoProductos;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marlon Galo
 */
public class ExistenciaProducto extends Producto{
    private double precio;
    private double cantidad;
    private double total;


public ExistenciaProducto(){

}

public ExistenciaProducto(double _precio, double _cantidad){
    this.precio= _precio;
    this.cantidad= _cantidad;
    
}

public ExistenciaProducto(String _codigo, String _nombre, double _precio, double _cantidad){
    this.setNombre(_nombre);
    this.setCodigoProducto(_codigo);
    this.setCantidad(_cantidad);
    this.setPrecio(_precio);
    
}

    public void setTotal(double total) {
        this.total = total;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

}