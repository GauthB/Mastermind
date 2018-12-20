package controller;

import java.util.Random;

public class RandomCombi {

	//_______________VARIABLES___________________________________________________________________________________________________________
	public char combi[];
	public String combiRandom = "0123456789";
	
	
	//_________________METHODES____________________________________________________________________________________________________	
	/**
	 * Definit le nombre qu'il faut de chiffre dans la combi
	 */
	public RandomCombi(){	// nombre de chiffre qu'il faut deviner
		int n = 4;
	    combi=genererCombi(n);
	}
	
	/**
	 * 
	 * @param le nombre de chiffre qu'il faut dans la combinaison
	 * @return un combinaison aléatoire
	 */
	public char[] genererCombi(int n){
		Random r = new Random();
		int SIZE = combiRandom.length();
		char combi[] = new char [n];
		for(int i = 0; i<n; i++) {
			combi[i]= combiRandom.charAt(r.nextInt(SIZE));	
		}
    	return combi;
    	}
	
	public char[] getCombi(){
		return this.combi;
	}
	
}
