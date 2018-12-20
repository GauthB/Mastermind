package network;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;


public class ClientMulti {
/*	
	public ClientMulti(String ip, int port) throws Exception {
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

*/
	

	   public static void main(String[] args) {
	      
	      final Socket clientSocket;
	      final BufferedReader in;
	      final PrintWriter out;
	      final Scanner sc = new Scanner(System.in);//pour lire à partir du clavier
	  
	      try {
	         /*
	         * les informations du serveur ( port et adresse IP ou nom d'hote
	         * 127.0.0.1 est l'adresse local de la machine
	         */
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
	                 System.out.println("Serveur déconecté");
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
	  }
	
	
}
