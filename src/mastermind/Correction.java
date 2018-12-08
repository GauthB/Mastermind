package mastermind;

public class Correction {

	private static char correct = 'V';			// si le chiffre est au bon endroit
	private static char miCorrect = '/';			// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';			// si le chiffre n'existe pas dans la combi
	
	

	public char[] correction (char[]combiIn, char[] combiRand) {
		
		char[] result = new char[4];	
		for(int i=0; i < 4; i++) {
			
			
			if(combiIn[i] == combiRand[i]) {
				result[i] += correct;
			}
			else if(combiIn[i] == combiRand[0] || combiIn[i] == combiRand[1] || combiIn[i] == combiRand[2] || combiIn[i] == combiRand[3]  ) {
				result[i] += miCorrect;
			}
			
			else {
				result[i] += noCorrect;
			}
		}
		
		return result;
	}
}

