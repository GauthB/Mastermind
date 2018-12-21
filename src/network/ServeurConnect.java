package network;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServeurConnect {

		
	public int port;
	static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
	    
	    public ServeurConnect() {
	    	
	    }
	   
	    public ServeurConnect(int port){
	    	this.port = port;
	    }
		
	    public void msg_send(String textField2)throws Exception {
	    	 try{
	         	String msgout;
	             msgout = textField2;
	             dout.writeUTF(msgout);
	         }
	         catch(Exception e){
	         	e.printStackTrace();
	         }
	    }
	    
	    public String msg_Receive() throws Exception {
	    	String msgin="";
	    	try {
				msgin = din.readUTF();
				return msgin;
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	return ("Message no receive");
	    }
	     
		public void connect() throws Exception {
			 try {
				 
				 	System.out.println("Wait for connection");
		        	ss = new ServerSocket(port);
		        	System.out.println("Wait for Client");
		            s = ss.accept();
		        	System.out.println("Connected !");
		            JOptionPane.showMessageDialog(null, "Connected !");

		            din = new DataInputStream(s.getInputStream());
		            dout = new DataOutputStream(s.getOutputStream());
		           
		           
		           
					}
					catch (Exception e) {
						e.printStackTrace();
					}
		}
		
		public void disconnected()throws Exception{
			 try {
				ss.close();
		        JOptionPane.showMessageDialog(null, "Disonnected !");
		        System.out.println("Disonnected !");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	         
		}
	}
