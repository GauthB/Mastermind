package controller;

import java.util.Random;

public class RandomCombi {

	
	public char combi[];
	public String combiRandom = "0123456789";
	
	public RandomCombi(){	// nombre de chiffre qu'il faut deviner
		int n = 4;
	    combi=genererCombi(n);
	}
	
	
	public char[] genererCombi(int n)
    {
     
		
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
