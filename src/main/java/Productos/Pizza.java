/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Productos;

/**
 *
 * @daniel
 */
public class Pizza extends Comida {
    @Override
    public String getDescripcion() {
        return "Pizza";
    }

    @Override
    public double getCosto() {
        return 10.0;
    }
}