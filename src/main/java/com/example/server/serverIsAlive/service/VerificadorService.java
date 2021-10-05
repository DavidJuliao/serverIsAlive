package com.example.server.serverIsAlive.service;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class VerificadorService {

    public static boolean isServerAlive(String address, int port, int timeout) throws IOException {

        try {

            return connect(address,port,timeout) && connect("www.google.com", 80, timeout);

            // Return true if connection successful
        } catch (IOException exception) {
            exception.printStackTrace();

            // Return false if connection fails
            return false;
        }
    }

    private static boolean connect(String address, int port, int timeout) throws IOException {
        Socket crunchifySocket = new Socket();
        crunchifySocket.connect(new InetSocketAddress(address, port), timeout);
        return true;
    }
}
