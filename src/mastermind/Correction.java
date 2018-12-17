package controller;
/**
 * 
 * @author Bohyn Gauthier
 * @author Hermand Thibaut
 * @author Meyers Humbert
 * Une classe reprÃ©sentant l'outil de correction de la combinaison envoyÃ©e
 */
public class Correction {

	private static char correct = 'V';			// si le chiffre est au bon endroit
	private static char miCorrect = '/';			// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';			// si le chiffre n'existe pas dans la combi
	//private char[] resultat = new char[4];
	

	public char[] correction (char[]combiIn, char[] combiRand) {
		
		char[] result = new char[4];	
		for(int i=0; i < 4; i++) {
			
			
			if(combiIn[i] == combiRand[i]) {
				//resultat[i] += correct;
				result[i] += correct;
			}
			else if(combiIn[i] == combiRand[0] || combiIn[i] == combiRand[1] || combiIn[i] == combiRand[2] || combiIn[i] == combiRand[3]  ) {
				//resultat[i] += miCorrect;
				result[i] += miCorrect;
			}
			
			else {
				//resultat[i] += noCorrect;
				result[i] += noCorrect;
			}
		}
		return result;
	}
	
	/*public String toString() {
		String a = String.valueOf(this.resultat[0]);
		String b = String.valueOf(this.resultat[1]);
		String c = String.valueOf(this.resultat[2]);
		String d = String.valueOf(this.resultat[3]);
		return a+b+c+d;
	}*/
	
	
	
}
