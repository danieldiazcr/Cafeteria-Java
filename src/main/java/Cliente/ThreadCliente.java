/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cliente;

import Modelos.Mensaje;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @daniel
 */
class ThreadCliente extends Thread {
    private Socket socket;
    private Cliente cliente;
    private ObjectInputStream entrada;

    public ThreadCliente(Socket socket, Cliente cliente) {
        this.socket = socket;
        this.cliente = cliente;
        try {
            entrada = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void run() {
        Mensaje mensaje;
        while (true) {
            try {
                mensaje = (Mensaje) entrada.readObject();
                cliente.pantalla.write(mensaje.toString());
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}
