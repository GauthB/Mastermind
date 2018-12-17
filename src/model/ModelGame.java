package model;

import java.util.Random;
import java.util.Scanner;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert
 */
public class ModelGame {

	// -------------------------------------
	// Affichage du jeu
	// -------------------------------------
	
	
//_______________VARIABLES___________________________________________________________________________________________________________
	
	public char[] combiIn = new char[4]; // Pour la longueur du tableau qui receptionne la combi qu'on encode
	public int easy = 12; // Mode Easy avec 12 chances
	public int normal = 9; // Mode Normal avec 9 chances
	public int hard = 5; // Mode Hard avec 5 chance
	public String level; // Le niveau qu'on desire pour le jeu
	public int limite; // La difficulte = le nombre de chance / nombre de limite
	public String mode; // Le mode qu'on desire
	
//________________CONSTRUCTEURS__________________________________________________________________________________________________
	public ModelGame() {

	}
//_________________METHODES____________________________________________________________________________________________________

	
	
	// --- Entrez une combi ---
	/**  
	 * @return combiIn tableau contenant la combinaison entree
	 */
	public char[] enterCombi() {

		String combiStr = "";
		
		Scanner combiInput = new Scanner(System.in);

		combiStr = combiInput.nextLine();

		for (int i = 0; i < 4; i++) {
			combiIn[i] = combiStr.charAt(i);
		}

		return combiIn;

	}

	
	// --- Choisir son level ---
	/**
	 * @return difficulty (int) niveau de difficulte (5 ou 9 ou 12)
	 */
	public int chooseLevel() {

		Scanner levelInput = new Scanner(System.in);
		int choiceL = 0;
		int difficulty = 0;

		while (choiceL == 0) {
			System.out.println("Hard = 'H'        5 chances");
			System.out.println("Normal = 'N'      9 chances");
			System.out.println("Easy = 'E'        12 chances");
			System.out.println("Please enter your difficulty:");

			level = levelInput.next();
			level = level.toLowerCase();

			if (level.equals("h")) {
				System.out.print("\nYour level is : Hard	\n");
				difficulty = hard;
				choiceL = 1;
			} else if (level.equals("n")) {
				System.out.print("\nYour level is : normal  \n");
				difficulty = normal;
				choiceL = 1;
			} else if (level.equals("e")) {
				System.out.print("\nYour level is : Easy \n");
				difficulty = easy;
				choiceL = 1;
			} else {
				System.out.println("\nNo correct \n\n");
				choiceL = 0;
			}
		}
		return difficulty;
	}

	
	// --- Choisir un mode ---
	/**
	 * @return choiceM (int) mode de jeu (0 ou 1 ou 2 ou 3)
	 */
	public int chooseMode() {

		Scanner modeInput = new Scanner(System.in);
		int choiceM = 0;

		while (choiceM == 0) {
			System.out.println("Choisir votre mode");
			System.out.println("Solo = 'S'");
			System.out.println("Pc = 'P'");
			System.out.println("Muli = 'M'");

			mode = modeInput.next(); // Enregistrer le mode demande
			mode = mode.toLowerCase(); // Tout transformer en minuscule

			/**
			 * l'utilisateur sera oblige d'encoder comme valeur S ou M 0 (Re-)commence la
			 * boucle 1 Direction mode solo 2 Direction mode Multi
			 */
			if (mode.equals("s")) {
				System.out.print("\nMode: Solo\n");
				choiceM = 1; // 1 = Solo
			}
			else if (mode.equals("p")) {
				System.out.print("\nMode: Pc\n");
				choiceM = 2; // 2 = Pc
			} else if (mode.equals("m")) {
				System.out.print("\nMode: Multi \n");
				choiceM = 3; // 3 = Multi
			} else {
				System.out.println("\nNo correct \n\n");
				choiceM = 0; // Recommence la boucle
			}
		}

		return choiceM;
	}

	
	// --- Affiche une combi ---
	/**
	 * @param combi combinaison a affiche
	 */
	public void afficheCombi(char[] combi) {

		for (int i = 0; i < combi.length; i++) {
			System.out.print(combi[i] + " ");
		}
		System.out.print("\n");
	}
	
}
