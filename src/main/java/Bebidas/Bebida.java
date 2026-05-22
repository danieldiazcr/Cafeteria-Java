/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bebidas;

import Productos.Producto;

/**
 *
 * @daniel
 */
public abstract class Bebida implements Producto {
    @Override
    public abstract String getDescripcion();
    @Override
    public abstract double getCosto();
}