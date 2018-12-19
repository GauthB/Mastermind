/**
 * 
 */
package model;

import java.util.Random;

import controller.Correction;
import controller.RandomCombi;

/**
 * 
 * @author Bohyn Gauthier
 * @author Hermand Thibaut
 * @author Meyers Humbert
 * Une classe qui représente Le modele du jeu en vue GUI
 */
public class ModelGameGUI_OLD {
	
	public char[] combiIn = new char[4]; 
	
	
	Correction instCorr = new Correction();
	RandomCombi instCombiRandom = new RandomCombi();

	public ModelGameGUI_OLD() {
			
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
	 * Methode qui adaptes la combinaison du pc en fonctions des combinaison corrigées
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
}