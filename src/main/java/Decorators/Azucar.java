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
public class Azucar extends DecoradorBebida {
    public Azucar(Producto bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Azúcar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.1;
    }
}
