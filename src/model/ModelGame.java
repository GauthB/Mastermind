package model;

import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert 
 * Une classe qui reprÃ©sente le mastermind
 */
public class ModelGame {

	// -------------------------------------
	// Affichage du jeu
	// -------------------------------------

//_______________VARIABLES___________________________________________________________________________________________________________

	private char[] combiIn = new char[4]; // Pour la longueur du tableau qui receptionne la combi qu'on encode
	private int easy; // Mode Easy avec 12 chances
	private int normal; // Mode Normal avec 9 chances
	private int hard; // Mode Hard avec 5 chance
	private String level; // Le niveau qu'on desire pour le jeu
	private int limite; // La difficulte = le nombre de chance / nombre de limite
	private String mode; // Le mode qu'on desire

//________________CONSTRUCTEURS__________________________________________________________________________________________________
	
	/**
	 * Un constructeur qui initialise le nombre d'essais pour chaque niveaux
	 */
	public ModelGame() {
		this.easy = 12;
		this.normal = 9;
		this.hard = 5;
	}
//_________________METHODES____________________________________________________________________________________________________

	// --- Entrez une combi ---
	/**
	 * @return combiIn tableau contenant la combinaison entrÃ©e
	 */
	public char[] enterCombi() {

		String combiStr = "";
		//System.out.println("1");
		Scanner combiInput = new Scanner(System.in);
		//System.out.println("entrez votre num");
		combiStr = combiInput.nextLine();
		//System.out.println("3");
		//char toto = combiStr.charAt(0);
		System.out.println(this.combiIn);
		System.out.println(combiStr);
		for (int i = 0; i < 4; i++) {
			(this.combiIn)[i] = combiStr.charAt(i);
			
		}
		
		return this.combiIn;

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
			
			
			this.level = levelInput.nextLine();
			this.level = this.level.toLowerCase();

			if (this.level.equals("h")) {
				System.out.print("\nYour level is : Hard	\n");
				difficulty = this.hard;
				choiceL = 1;
			} else if (this.level.equals("n")) {
				System.out.print("\nYour level is : normal  \n");
				difficulty = this.normal;
				choiceL = 1;
			} else if (this.level.equals("e")) {
				System.out.print("\nYour level is : Easy \n");
				difficulty = this.easy;
				choiceL = 1;
			} else {
				System.out.println("\nNo correct \n\n");
				difficulty = 0;
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

			this.mode = modeInput.next(); // Enregistrer le mode demande
			this.mode = this.mode.toLowerCase(); // Tout transformer en minuscule

			/**
			 * l'utilisateur sera oblige d'encoder comme valeur S ou M 0 (Re-)commence la
			 * boucle 1 Direction mode solo 2 Direction mode Multi
			 */
			if (this.mode.equals("s")) {
				System.out.print("\nMode: Solo\n");
				choiceM = 1; // 1 = Solo
			} else if (this.mode.equals("p")) {
				System.out.print("\nMode: Pc\n");
				choiceM = 2; // 2 = Pc
			} else if (this.mode.equals("m")) {
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
	
	
	/**
	 * Getters & setters
	 */

	public char[] getCombiIn() {
		return combiIn;
	}

	public void setCombiIn(char[] combiIn) {
		this.combiIn = combiIn;
	}

	public int getEasy() {
		return easy;
	}

	public void setEasy(int easy) {
		this.easy = easy;
	}

	public int getNormal() {
		return normal;
	}

	public void setNormal(int normal) {
		this.normal = normal;
	}

	public int getHard() {
		return hard;
	}

	public void setHard(int hard) {
		this.hard = hard;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
