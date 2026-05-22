/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Productos;

import Bebidas.Bebida;

/**
 *
 * @daniel
 */
public abstract class Comida implements Producto {
    @Override
    public abstract String getDescripcion();
    @Override
    public abstract double getCosto();
}
