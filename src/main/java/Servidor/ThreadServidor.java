/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Servidor;

import Modelos.Mensaje;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @daniel
 */
public class ThreadServidor extends Thread {
    private Socket socket;
    private Servidor server;
    private ObjectInputStream entrada;
    private DataInputStream entradaDatos;
    ObjectOutputStream salida;
    String nombre;
    private boolean isRunning = true;

    public ThreadServidor(Socket socket, Servidor server) {
        this.socket = socket;
        this.server = server;
        try {
            entrada = new ObjectInputStream(socket.getInputStream());
            salida = new ObjectOutputStream(socket.getOutputStream());
            entradaDatos = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        Mensaje mensaje;
        while (isRunning) {
            try {
                mensaje = (Mensaje) entrada.readObject();
                server.agregarPedido(mensaje.toString());
                server.broadcast(mensaje);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}
