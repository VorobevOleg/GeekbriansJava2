package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private ServerSocket server;
    private Socket socket;
    private DataInputStream inServer;
    private DataOutputStream outServer;
    private Scanner scanner;
    private final int PORT = 8189;

    public Server () {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");

                socket = server.accept();
                System.out.println("Client '" + socket.getRemoteSocketAddress() + "' connected");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Server stoped");
        }
        try {
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            inServer = new DataInputStream(socket.getInputStream());
            outServer = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    while (true) {
                        String str = inServer.readUTF();
                        if (str.equals("/end")) {
                            break;
                        }
                        System.out.println(str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Client disconnect!");
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


            new Thread(() -> {
                try {
                    scanner =  new Scanner(System.in);
                    while (true) {
                        outServer.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Client disconnect!");
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
