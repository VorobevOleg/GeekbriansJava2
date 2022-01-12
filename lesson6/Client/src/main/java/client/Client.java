package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private final String ADRESS = "localhost";
    private final int PORT = 8189;

    private Socket socket;
    private DataInputStream inClient;
    private DataOutputStream outClient;
    Scanner scanner;

    public Client () {
        try {
            socket = new Socket(ADRESS,PORT);
            System.out.println("Client started");

            inClient = new DataInputStream(socket.getInputStream());
            outClient = new DataOutputStream(socket.getOutputStream());


            new Thread(() -> {
                try {
                    while (true) {
                        String str = inClient.readUTF();
                        if (str.equals("/end")) {
                            break;
                        }
                        System.out.println(str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


            new Thread(() -> {
                try {
                    while (true) {
                        scanner =  new Scanner(System.in);
                        outClient.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
