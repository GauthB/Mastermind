package main;

import view.ViewConsole;
import view.ViewMain;
import model.ModelGame;

/**
 * 
 * @author Bohyn Gauthier
 * @author Hermand Thibaut
 * @author Meyers Humbert
 * Une classe controlleur.
 */

public class MainMastermind {
	/**
	 * ue methode qui peut executer la classe ViewMain pour avoit l'interface graphique
	 * mais qui peut aussi lancer le jeu en console
	 * @param args les arguments de la methode
	 */
	public static void main(String[] args) {
		ViewMain viewMain = new ViewMain();
		viewMain.setVisible(true);
		ViewConsole viewCLI = new ViewConsole();
		viewCLI.main(args);
	}	
}
