/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Combos;

import Productos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @daniel
 */
public class Combo implements Producto {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public String getDescripcion() {
        StringBuilder descripcion = new StringBuilder("Combo:\n");
        for (Producto producto : productos) {
            descripcion.append(producto.getDescripcion()).append("\n");
        }
        return descripcion.toString();
    }

    @Override
    public double getCosto() {
        double costo = 0.0;
        for (Producto producto : productos) {
            costo += producto.getCosto();
        }
        return costo;
    }
}