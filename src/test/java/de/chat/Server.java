package de.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
    ServerSocket serverSocket;
    Socket client;
    public Server() throws IOException {

        serverSocket = new ServerSocket(25500);
        start();



    }


    @Override
    public void run() {
        try {
            client = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner scanner = new Scanner(new DataInputStream(client.getInputStream()));
            DataInputStream dt = new DataInputStream(client.getInputStream());
        while (true){
            if(scanner.hasNextLine()) {

                String msg = dt.readUTF().trim();
                System.out.println(msg);
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

