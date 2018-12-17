package network;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class AddressIp {
	
	public  InetAddress LocaleAdresse ;
	public  String adressIp;
	public  String addressIpString;
	public  Object RecupAdressIp() {
		
		
		
		return adressIp;
	}
	
	public  String Transfo(){
		
		addressIpString=LocaleAdresse.toString();
		
		return addressIpString;
	}
	
	
	
	/*public  void main(String[] zero) {
		
		
		try {

			LocaleAdresse = InetAddress.getLocalHost();
			System.out.println("L'adresse locale est : "+LocaleAdresse ); 
			System.out.println("---------");
			System.out.println("l'adresse ip est: "+Transfo());
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}*/

}

