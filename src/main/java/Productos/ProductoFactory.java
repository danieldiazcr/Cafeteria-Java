/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Productos;

import Bebidas.*;

import Combos.Combo;

/**
 *
 * @daniel
 */
public class ProductoFactory {
    public static Producto crearProducto(String tipo) {
        switch (tipo) {
            case "Café":
                return new Cafe();
            case "Té":
                return new Te();
            case "Chocolate":
                return new Chocolate();
            case "Capuccino":
                return new Capuccino();
            case "Frappé":
                return new Frappe();
            case "Gaseosa":
                return new Gaseosa();
            case "Natural":
                return new Natural();
            case "Matcha":
                return new Matcha();
            case "Smoothie":
                return new Smoothie();
            case "Espresso":
                return new Espresso();
            case "Burrito":
                return new Burrito();
            case "Casado":
                return new Casado();
            case "Hamburguesa":
                return new Hamburguesa();
            case "Papas":
                return new Papas();
            case "Pinto":
                return new Pinto();
            case "Pizza":
                return new Pizza();
            case "Pupusa":
                return new Pupusa();
            case "Repostería":
                return new Reposteria();
            case "Sandwich":
                return new Sandwich();
            case "Sopa":
                return new Sopa();
            case "Tacos":
                return new Tacos();
            default:
                throw new IllegalArgumentException("Producto no encontrado");
        }
    }

    public static Combo crearCombo(String tipo) {
        Combo combo = new Combo();
        switch (tipo) {
            case "Combo Desayuno":
                combo.agregarProducto(crearProducto("Café"));
                combo.agregarProducto(crearProducto("Pinto"));
                break;
            case "Combo Almuerzo":
                combo.agregarProducto(crearProducto("Gaseosa"));
                combo.agregarProducto(crearProducto("Casado"));
                break;
            case "Combo Café":
                combo.agregarProducto(crearProducto("Capuccino"));
                combo.agregarProducto(crearProducto("Repostería"));
                break;
            case "Combo Cena":
                combo.agregarProducto(crearProducto("Natural"));
                combo.agregarProducto(crearProducto("Sopa"));
                break;
            case "Combo Smoothie":
                combo.agregarProducto(crearProducto("Smoothie"));
                combo.agregarProducto(crearProducto("Repostería"));
                break;
            case "Combo Sandwich":
                combo.agregarProducto(crearProducto("Sandwich"));
                combo.agregarProducto(crearProducto("Natural"));
                break;
            case "Combo Pizza":
                combo.agregarProducto(crearProducto("Gaseosa"));
                combo.agregarProducto(crearProducto("Pizza"));
                break;
            case "Combo Hamburguesa":
                combo.agregarProducto(crearProducto("Gaseosa"));
                combo.agregarProducto(crearProducto("Hamburguesa"));
                break;
            case "Combo Tacos":
                combo.agregarProducto(crearProducto("Gaseosa"));
                combo.agregarProducto(crearProducto("Tacos"));
                break;
            case "Combo Burrito":
                combo.agregarProducto(crearProducto("Gaseosa"));
                combo.agregarProducto(crearProducto("Burrito"));
                break;
            default:
                throw new IllegalArgumentException("Combo no encontrado");
        }
        return combo;
    }

    public static double obtenerCostoCombo(String tipo) {
        return (crearCombo(tipo).getCosto())*0.90;
    }
}
