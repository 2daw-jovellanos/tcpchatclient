/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpchatclient;
import java.io.*;
import java.net.*;
import java.util.*;


/**
 *
 * @author victor
 */
public class TcpChatClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Socket conn = new Socket("localhost", 6789);
        Scanner desdeServidor = new Scanner(conn.getInputStream());
        PrintWriter haciaServidor = new PrintWriter(conn.getOutputStream());
        
        haciaServidor.println("LOGIN");
        haciaServidor.println("yomizmo");
        String resp = desdeServidor.nextLine();
        int numMsg = 0;
        if (resp.equals("ok")) {
            numMsg = Integer.parseInt(desdeServidor.nextLine());
        }
        System.out.println(resp);
        System.out.println(numMsg);
        
        
    }
    
}
