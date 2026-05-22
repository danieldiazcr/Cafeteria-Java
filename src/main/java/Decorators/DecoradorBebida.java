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
public abstract class DecoradorBebida implements Producto {
    protected Producto bebida;

    public DecoradorBebida(Producto bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
}