/**
 * 
 */
package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Bohyn Gauthier
 * @author Hermant Thibaut
 * @author Meyers Humbert
 * Une classe représentant un chat avec un socket de connexion
 */
public class Chat {
	BufferedReader in;
	PrintWriter out;
	Socket socket;
	ServerSocket s;
	
	/**
	 * Constructeur permettant d'initialiser le chat en établissant
	 * la connection avec un interlocuteur situé sur une autre machine
	 * @param isServer si true, l'instance est un serveur et se met en attente d'un client
	 * @param port le numéro de port sur lequel établir la connexion
	 * @param addr l'addresse du serveur sur lequel se connecter
	 * @throws IOException si il y a un promblème pendant l'établissement de la connexion
	 */
	public Chat(boolean isServer, int port, String addr) throws IOException {
		connect(isServer, port, addr);
	}
	
	/**
	 * envoie le message a l'interlocuteur
	 * @param msg un message
	 */
	public void sendMessage(String msg) {
		out.println(msg);
	}
	
	/**
	 * Attend le message suivant
	 * @return le message reçu de l'interlocuteur
	 * @throws IOException envoie une erreur si aucun message n'est rentré
	 */
	public String waitForMessage() throws IOException{
		String str = null;
		str = in.readLine();
		return str;
	}
	
	/**
	 * 
	 * @param isServer si true, l'instance est un serveur et se met en attente d'un client
	 * @param port le numéro de port sur lequel établir la connexion
	 * @param addr is isServer est false, addr contient l'adresse du serveur a contacter
	 * @throws IOException si il y a un promblème pendant l'établissement de la connexion
	 */
	public void connect(boolean isServer, int port, String addr) throws IOException {
		if(isServer) {
			s= new ServerSocket(port);
			socket = s.accept();
		}else {
			socket = new Socket(addr, port);			
		}
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
	}
	
	/**
	 * Ferme les différents flux d'une connexion active 
	 * @throws IOException en cas d'erreur dans la fermeture de connexion
	 */
	public void closeConnexion() throws IOException {
		in.close();
		out.close();
		socket.close();
		s.close();	
	}
}