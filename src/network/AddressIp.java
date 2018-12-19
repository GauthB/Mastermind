package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressIp {
public String ip;
	
	

	   public  String giveMyIp() throws UnknownHostException {

			ip = InetAddress.getLocalHost().getHostAddress().toString();
			return ip;

				   }



}
