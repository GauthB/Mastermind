package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


import view.ViewGameMulti;

import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;


public class ServeurMulti {
	
	public int port;
	
	public ServeurMulti() throws Exception {
		
	}
	
	public void connect() throws Exception {
		
		System.out.println(port);
		
		try {
			System.out.println("Server is started");
			
			ServerSocket ss = new ServerSocket(port);
			
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
		
	}
}
