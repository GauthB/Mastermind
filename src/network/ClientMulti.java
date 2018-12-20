package network;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import view.ViewGameMulti;

import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;


public class ClientMulti {
	
	public String ip="";
	public int port;
	
	public ClientMulti() throws Exception {
		
		ViewGameMulti viewGameMulti = new ViewGameMulti();
		viewGameMulti.setVisible(true);
		
		try {
			Socket s = new Socket(ip,port);
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgin="", msgout="";
			while(!msgin.equals("end")) {
				msgout = br.readLine();
				dout.writeUTF(msgout);
				msgin = din.readUTF();
				System.out.println(msgin);
				
			}
			s.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	


	
/*
	   public static void main(String[] args) {
	      
	      final Socket clientSocket;
	      final BufferedReader in;
	      final PrintWriter out;
	      final Scanner sc = new Scanner(System.in);//pour lire Ã  partir du clavier
	  
	      try {
	         
	         clientSocket = new Socket("127.0.0.1",5000);
	   
	         //flux pour envoyer
	         out = new PrintWriter(clientSocket.getOutputStream());
	         //flux pour recevoir
	         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	   
	         Thread envoyer = new Thread(new Runnable() {
	             String msg;
	              @Override
	              public void run() {
	                while(true){
	                  msg = sc.nextLine();
	                  out.println(msg);
	                  out.flush();
	                }
	             }
	         });
	         envoyer.start();
	   
	        Thread recevoir = new Thread(new Runnable() {
	            String msg;
	            @Override
	            public void run() {
	               try {
	                 msg = in.readLine();
	                 while(msg!=null){
	                    System.out.println("Serveur : "+msg);
	                    msg = in.readLine();
	                 }
	                 System.out.println("Serveur dÃ©conectÃ©");
	                 out.close();
	                 clientSocket.close();
	               } catch (IOException e) {
	                   e.printStackTrace();
	               }
	            }
	        });
	        recevoir.start();
	   
	      } catch (IOException e) {
	           e.printStackTrace();
	      }
	  }*/
	
	
}
