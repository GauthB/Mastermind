package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientConnect {
	
	static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public String ip="";
    public int port;
    
    public ClientConnect() {
    	
    }
   
    public ClientConnect(String ip,int port){
    	this.ip = ip;
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
			 	System.out.println("Start");
	            s = new Socket(ip,port);
	            System.out.println("SocketCreate");
	            din = new DataInputStream(s.getInputStream());
	            dout = new DataOutputStream(s.getOutputStream());
	            System.out.println("Connected !");
	            JOptionPane.showMessageDialog(null, "Connected ! ");
	           
	           
	           
				}
				catch (Exception e) {
					e.printStackTrace();
				}
	}
	
	public void disconnected()throws Exception{
		 try {
			s.close();
			System.out.println("Disconnected ! ");
	        JOptionPane.showMessageDialog(null, "Disconnected ! ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}
}
