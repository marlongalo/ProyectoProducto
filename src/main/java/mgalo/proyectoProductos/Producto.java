/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mgalo.proyectoProductos;

/**
 *
 * @author Marlon Galo
 */
public class Producto {
    private String codigoProducto;
    private String nombre; 


public Producto(){

}

public Producto(String _codigoProducto, String _nombre){
        this.setCodigoProducto(_codigoProducto);
        this.setNombre(_nombre);
}

    public void setCodigoProducto(String _codigoProducto) {
        this.codigoProducto = _codigoProducto;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getCodigoProducto() {
        return this.codigoProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

}

