package network;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class ClientMulti {
		public static void main(String[] args) throws Exception {
			try {
				String ip ="192.168.1.30";
				int port = 9999;
				
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
			catch(Exception e) {
				//TODO
			}	
			
		}
}
