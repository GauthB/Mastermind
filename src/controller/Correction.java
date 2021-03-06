package controller;
/**
 * 
 * @author Bohyn Gauthier
 * @author Hermand Thibaut
 * @author Meyers Humbert
 * Une classe représentant l'outil de correction de la combinaison envoyée
 */
public class Correction {

//_______________VARIABLES___________________________________________________________________________________________________________
	private static char correct = 'V';			// si le chiffre est au bon endroit
	private static char miCorrect = '/';			// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';			// si le chiffre n'existe pas dans la combi
	
	
//_________________METHODES____________________________________________________________________________________________________
	/**
	 * Une méthode qui corrige la combinaison reçue grâce à la combinaison générée
	 * @param combiIn la combinaison reçue
	 * @param combiRand la combinaison générée
	 * @return La correction sous forme de tableau de char
	 */
	
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
}
