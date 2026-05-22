/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Servidor;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @daniel
 */
public class ServerConnectionsThread extends Thread {
    private Servidor server;

    public ServerConnectionsThread(Servidor server) {
        this.server = server;
    }

    public void run() {
        while (true) {
            if (server.serverSocket == null) {
                break;
            }

            try {
                Socket nuevoSocket = server.serverSocket.accept();
                ThreadServidor ts = new ThreadServidor(nuevoSocket, server);
                ts.start();
                server.clientesConectados.add(ts);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
