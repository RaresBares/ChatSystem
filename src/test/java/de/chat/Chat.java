package de.chat;

import java.net.InetAddress;

import java.net.UnknownHostException;
import java.util.Scanner;

public class Chat {

    public static void main(String[] args) throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("Your IP-Adress: " + inetAddress.getLocalHost());
        System.out.println("Please Enter the IP-Adress of your parntner");
        Scanner sc = new Scanner(System.in);
       String ipadress = sc.nextLine();
        System.out.println("Target: " + ipadress);
        Server s = new Server();
        Client c =new Client(ipadress);

    }

}
