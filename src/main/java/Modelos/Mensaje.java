/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelos;

import java.io.Serializable;

/**
 *
 * @daniel
 */
public class Mensaje implements Serializable {
    private String[] productos;

    public Mensaje(String[] productos) {
        this.productos = productos;
    }

    public String[] getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos:\n");
        for (String producto : productos) {
            sb.append("- ").append(producto).append("\n");
        }
        return sb.toString();
    }
}