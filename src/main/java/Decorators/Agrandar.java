/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Decorators;

import Bebidas.Bebida;
import Productos.Producto;

/**
 *
 * @daniel
 */
public class Agrandar extends DecoradorBebida {
    public Agrandar(Producto bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Agrandar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1.0;
    }
}
