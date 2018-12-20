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
	
	public static void main(String[] args) {
	
	//ça ne fonctionne pas
		
		ViewMain viewMain = new ViewMain();
		viewMain.setVisible(true);
		ViewConsole viewCLI = new ViewConsole();
		viewCLI.main(args);;
		
	}	
	
}

