package de.chat;

import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    Socket s;
    DataOutputStream os;
    public Client(String ip) throws IOException {
        s = new Socket(ip, 25500);
        os =  new DataOutputStream(s.getOutputStream());
  start();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){

            if(sc.hasNextLine()){

                String msg = sc.nextLine();

                try {

                    os.writeUTF(msg + "\n");
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
