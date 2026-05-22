/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Mainpackage;

import Cliente.PantallaCliente;
import Servidor.PantallaServidor;

/**
 *
 * @Daniel Díaz
 */
public class main {

    public static void main(String[] args) {
        new PantallaServidor().setVisible(true);
        new PantallaCliente().setVisible(true);
    }
}
