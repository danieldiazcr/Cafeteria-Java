/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cliente;

import Modelos.Mensaje;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @daniel
 */
public class Cliente {
    private final String IP = "localhost";
    private final int PORT = 8084;
    Socket socket;
    ObjectOutputStream salida;
    private DataOutputStream salidaDatos;
    PantallaCliente pantalla;
    String nombre;
    ThreadCliente threadCliente;

    public Cliente(PantallaCliente pantalla) {
        this.pantalla = pantalla;
        if (!conectar()) {
            JOptionPane.showMessageDialog(pantalla, "No se pudo conectar al servidor. Por favor, inténtelo de nuevo más tarde.");
            System.exit(0);
        }
    }

    public boolean conectar() {
        try {
            socket = new Socket(IP, PORT);
            salida = new ObjectOutputStream(socket.getOutputStream());
            salidaDatos = new DataOutputStream(socket.getOutputStream());
            threadCliente = new ThreadCliente(socket, this);
            threadCliente.start();
            return true; // Conexión exitosa
        } catch (IOException ex) {
            ex.printStackTrace();
            return false; // Conexión fallida
        }
    }

    public void enviarPedido(Mensaje mensaje) {
        try {
            salida.writeObject(mensaje);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(pantalla, "Error al enviar el pedido: " + ex.getMessage());
        }
    }
}
