package model;

import java.util.Observable;
import java.util.Random;
import java.util.Scanner;

import controller.Correction;
import controller.RandomCombi;

import java.io.*;
import java.lang.*;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert 
 * Une classe qui represente le mastermind
 */
public class ModelGame extends Observable{

	// -------------------------------------
	// Affichage du jeu
	// -------------------------------------

//_______________VARIABLES___________________________________________________________________________________________________________

	private char[] combiIn; // Pour la longueur du tableau qui receptionne la combi qu'on encode
	private int easy; // Mode Easy avec 12 chances
	private int normal; // Mode Normal avec 9 chances
	private int hard; // Mode Hard avec 5 chance
	private String level; // Le niveau qu'on desire pour le jeu
	public int limite; // La difficulte = le nombre de chance / nombre de limite
	private String mode; // Le mode qu'on desire
	private Correction instCorr;
	private RandomCombi instCombiRandom;

//________________CONSTRUCTEURS__________________________________________________________________________________________________
	
	/**
	 * Un constructeur qui initialise le nombre d'essais pour chaque niveaux
	 */
	public ModelGame() {
		this.easy = 12;
		this.normal = 9;
		this.hard = 5;
		this.instCombiRandom = new RandomCombi();
		this.instCorr = new Correction();
		this.combiIn = new char[4];
		this.combiIn[0] = 0; this.combiIn[1] = 0; this.combiIn[2] = 0; this.combiIn[3] = 0;
	}
//_________________METHODES____________________________________________________________________________________________________

	// --- Entrez une combi ---
	/**
	 * @return combiIn tableau contenant la combinaison entrÃ©e
	 */
	public char[] enterCombi() {

		String combiStr = "";
		boolean breaker = true;
		Scanner combiInput = new Scanner(System.in);
		while(breaker) {
			combiStr = combiInput.nextLine();
			if(combiStr.length() == 4) 
				{breaker=false;}
			else {
				System.out.println("Veuillez resaisir une combinaison:\n");
			}
		}
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
			System.out.println("Easy = 'E'        12 chances\n");
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
			System.out.println("Choisir votre mode\n");
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
				System.out.print("\nMode: Solo\n\n");
				choiceM = 1; // 1 = Solo
			} else if (this.mode.equals("p")) {
				System.out.print("\nMode: Pc\n\n");
				choiceM = 2; // 2 = Pc
			} else if (this.mode.equals("m")) {
				System.out.print("\nMode: Multi \n\n");
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
	 * Methode renvoyant la combinaison générée.
	 * @return la combinaison générée
	 */
	public char[] getCombiRandom() {
		return instCombiRandom.combi;
	}
	
	/**
	 * Retourne un tableau de char en String
	 * @param tab Un tableau quelqconque
	 * @return Une String.
	 */
	public String convertTab2String(char tab []) {
		String txt ="";
		for(int i = 0; i< tab.length;i++) {
			txt += tab[i];
		}
		return txt;
	}
	
	/**
	 * Transforme une String en tableau de char
	 * @param txt une String quelconque
	 * @return un tableau de char
	 */
	public char[] convertString2Tab(String txt) {
		char tab[] =new char[txt.length()];
		for(int i = 0; i< txt.length();i++) {
			tab[i] = txt.charAt(i);
		}
		return tab;
	}
	
	/**
	 * Corrige une String
	 * @param txt une String quelconque
	 * @return Une String
	 */
	public String corrige(String txt) {
		
		char tab[] = new char[4];
		
		for(int i=0;i < 4;i++) {
			tab[i] = txt.charAt(i);
		}
		char correct[] = new char[4];
		correct = instCorr.correction(tab,instCombiRandom.combi);
		txt ="";
		for(int i=0;i < 4;i++) {
			txt += correct[i];
		}
		return txt;	
	}
	
	/**
	 * Une methode qui renvoie un boolean en fonction de la combinaison.
	 * @param combi La combinaison reçue par l'utilisateur
	 * @return un boolean
	 */
	public boolean ifCorrect(String combi) {
		
		String test = "";
		for(int i = 0; i<4;i++) {
			test+=instCombiRandom.combi[i];
		}
		
		if(combi.equals(test)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Une methode qui retourne le niveau choisi
	 * @param txt la lettre entrée par l'utilisateur
	 * @return retourne le niveau choisi
	 */
	public int levelSolo(String txt) {
		
		char lettre = txt.charAt(0);
		int lvl = 0;
		
		if(lettre == 'H' || lettre == 'h') {
			lvl= 5;
		}
		else if(lettre == 'N' || lettre == 'n') {
			lvl= 9; 
		}
		else if(lettre == 'E' || lettre == 'e') {
			lvl= 12; 
		}
		else {
			System.out.print("Level incorrect");
		}
		return lvl;
		
	}
	
	/**
	 * Vérifie si le niveau est correct
	 * @param txt le texte rentré pas l'utilisateur
	 * @return un boolean
	 */
	public boolean isLevelCorrect(String txt) {
		
		if(txt.equals("")) {//Si l'utilisateur ne rentre rien
			return false;
		}
		if(txt.length() >= 2) {//Si l'utilisateur rentre plus que 1 caractere
			return false;
		}
		else if((txt.charAt(0) == 'H') || (txt.charAt(0) == 'h') || (txt.charAt(0) == 'N') || (txt.charAt(0) == 'n') || (txt.charAt(0) == 'E') || (txt.charAt(0) == 'e')) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Une methode qui converti une string contenant des espace en une string sans espaces
	 * @param txt une chaine de caracterè quelconque
	 * @return une chaine de caractères sans espaces
	 */
	public String convertWithoutSpaces(String txt) {
		/*String txt2 = "";
		int i = 0;
		while (i <= 6) {
			txt2+= txt.charAt(i);
			i=i+2;
		}*/
		String txt2 = txt.split(" ").toString();
		return txt2;
	}
	
	
	/**
	 * Une methode générant la combinaison de l'ordinateur
	 * @param positionCorrect une partie de combinaison correcte
	 * @param numeroCorrect un numéro correct mais pas à la bonne place
	 * @return la combinaison de l'ordinateur
	 */
	public String newCombiPc(char positionCorrect[],char numeroCorrect[]){
		
		char[] combiPc = new char[4];
		String retour = "";				
		
		Random r = new Random();
		int size = instCombiRandom.combiRandom.length();
		
		for (int i = 0; i < 4; i++) {
			combiPc[i] = instCombiRandom.combiRandom.charAt(r.nextInt(size)); // transformer le String en tableau
			
			if(positionCorrect[i] == 't') {
				combiPc[i] = numeroCorrect[i];
			}
		}
		for(int i=0;i < 4;i++) {
			retour += combiPc[i];
		}
		return retour;
	}
	
	
	/**
	 * Methode qui adapte la combinaison du pc en fonction des combinaisons corrigées
	 * @param positionCorrect Un element correct dans la combinaison
	 * @param numeroCorrect Un numéro correct mais pas à la bonne place
	 * @param combiPc la précédente combinaison de l'ordinateur
	 * @param combiUti la précédente combinaison du joueur
	 * @return la combinaison de l'ordinateur
	 */
	public char[][] corrigePc(char positionCorrect[],char numeroCorrect[],String combiPc,String combiUti) {
		
		char correctPc[] = new char[4];
		char correctUti[] = new char[4];

		char combiUti2[] = new char[4];
		char combiPc2[] = new char[4];
		char retour[][]= new char[3][4];
		
		
		for(int i=0;i < 4;i++) {
			combiUti2[i] = combiUti.charAt(i);
			combiPc2[i] = combiPc.charAt(i);
		}
		
		correctPc = instCorr.correction(combiPc2,instCombiRandom.combi);
		correctUti = instCorr.correction(combiUti2,instCombiRandom.combi);
		
		for(int i = 0; i < 4; i++) {
			if(correctPc[i] == 'V'){
				positionCorrect[i] = 't';
				numeroCorrect[i] = combiPc2[i];
			}
			if(correctUti[i] == 'V'){
				positionCorrect[i] = 't';
				numeroCorrect[i] = combiUti2[i];
			}
		}
		retour[0] = positionCorrect;
		retour[1] = numeroCorrect;
		retour[2] = correctPc;
		
		return retour;		
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
	
	public Correction getInstCorr() {
		return instCorr;
	}

	public void setInstCorr(Correction instCorr) {
		this.instCorr = instCorr;
	}

	public RandomCombi getInstCombiRandom() {
		return instCombiRandom;
	}

	public void setInstCombiRandom(RandomCombi instCombiRandom) {
		this.instCombiRandom = instCombiRandom;
	}

}