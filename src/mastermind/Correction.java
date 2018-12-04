package mastermind;

public class Correction {

	
	
	private static char correct = 'V';			// si le chiffre est au bon endroit
	private static char miCorrect = '/';			// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';			// si le chiffre n'existe pas dans la combi
	private static String result = "";			// variable pour les rÃƒÂ©sultats 
	

	public String correction (char[]combiIn, char[] combiRand) {
		

		for(int i=0; i < 4; i++) {
			
			if(combiIn[i] == combiRand[i]) {
				result += correct;
			}
			else if(combiIn[i] == combiRand[0] || combiIn[i] == combiRand[1] || combiIn[i] == combiRand[2] || combiIn[i] == combiRand[3]  ) {
				result += miCorrect;
			}
			
			else {
				result += noCorrect;
			}
		}
		
		return result;
	}
		
	
}
