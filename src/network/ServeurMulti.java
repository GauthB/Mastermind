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

/**
 * @author Hermant Thibaut
 * @author Humbert Meyers
 * @author Bohyn Gauhtier
 *
 */
public class ServeurMulti  {
	
	public static void main(String[] args) throws Exception {
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
			//TODO
		}
		

	}

}
