/**
 * 
 */
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
/**
 * @author Hermant Thibaut
 * @author Humbert Meyers
 * @author Bohyn Gauhtier
 *
 */
public class ServeurMulti  {
	
	/*public ServeurMulti() {
		try {
			System.out.println("Server is started");
			
			ServerSocket ss = new ServerSocket(9999);
			
			System.out.println("Server is waiting for client request");
			Socket s = ss.accept();
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			System.out.println("Client connected");
			
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			
			String msgin ="", msgout="";
			
			while(!msgin.equals("end")) {
				msgin = din.readUTF();
				System.out.println(msgin);
				msgout = br.readLine();
				dout.writeUTF(msgout);
				dout.flush();
			}
			
			s.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}*/
	

	
	 
	   public static void main(String[] test) {
	  
	     final ServerSocket serveurSocket  ;
	     final Socket clientSocket ;
	     final BufferedReader in;
	     final PrintWriter out;
	     final Scanner sc=new Scanner(System.in);
	  
	     try {
	       serveurSocket = new ServerSocket(5000);
	       clientSocket = serveurSocket.accept();
	       out = new PrintWriter(clientSocket.getOutputStream());
	       in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
	       Thread envoi= new Thread(new Runnable() {
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
	       envoi.start();
	   
	       Thread recevoir= new Thread(new Runnable() {
	          String msg ;
	          @Override
	          public void run() {
	             try {
	                msg = in.readLine();
	                //tant que le client est connecté
	                while(msg!=null){
	                   System.out.println("Client : "+msg);
	                   msg = in.readLine();
	                }
	                //sortir de la boucle si le client a déconecté
	                System.out.println("Client déconecté");
	                //fermer le flux et la session socket
	                out.close();
	                clientSocket.close();
	                serveurSocket.close();
	             } catch (IOException e) {
	                  e.printStackTrace();
	             }
	         }
	      });
	      recevoir.start();
	      }catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
}
