package mastermind;

public class Correction {

	
	
	private static char correct = 'V';				// si le chiffre est au bon endroit
	private static char miCorrect = '/';			// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';			// si le chiffre n'existe pas dans la combi
	private static char result;	// variable pour les rÃ©sultats 
	

	
public Correction(){
	
}
	public char correction1(char[]combiIn, char[] combiOut){
		
		 if (combiIn[0] == combiOut[0]) {				// premier chiffre
            result = correct;
        } else if (combiIn[0] == combiOut[1]) {		// deuxieme chiffre
            result = miCorrect; 
        } else if (combiIn[0] == combiOut[2]) {		// troisieme chiffre
            result = miCorrect;
        } else if (combiIn[0] == combiOut[3]) {		// quatrieme chiffre
            result = miCorrect;
        } else {
            result = noCorrect;
        }	         
        return result; 
	}
	  public char correction2(char[]combiIn, char[] combiOut) {
			
	         if (combiIn[1] == combiOut[1]) {				// premier chiffre
	             result = correct;
	         } else if (combiIn[1] == combiOut[0]) {		// deuxieme chiffre
	             result = miCorrect;
	         } else if (combiIn[1] == combiOut[2]) {		// troisieme chiffre
	             result = miCorrect;
	         } else if (combiIn[1] == combiOut[3]) {		// quatrieme chiffre
	             result = miCorrect;
	         } else {
	             result = noCorrect;
	         }
	         return result;	         
	    }
	  public char correction3(char[]combiIn, char[] combiOut) {
			
	         if (combiIn[2] == combiOut[2]) {				// premier chiffre
	             result = correct;
	         } else if (combiIn[2] == combiOut[0]) {		// deuxieme chiffre
	             result = miCorrect;
	         } else if (combiIn[2] == combiOut[1]) {		// troisieme chiffre
	             result = miCorrect;
	         } else if (combiIn[2] == combiOut[3]) {		// quatrieme chiffre
	             result = miCorrect;
	         } else {
	             result = noCorrect;
	         }
	         return result;	         
	    }
	  public char correction4(char[]combiIn, char[] combiOut) {
			
	         if (combiIn[3] == combiOut[3]) {				// premier chiffre
	             result = correct;
	         } else if (combiIn[3] == combiOut[0]) {		// deuxieme chiffre
	             result = miCorrect;
	         } else if (combiIn[3] == combiOut[1]) {		// troisieme chiffre
	             result = miCorrect;
	         } else if (combiIn[3] == combiOut[2]) {		// quatrieme chiffre
	             result = miCorrect;
	         } else {
	             result = noCorrect;
	         }
	         return result;	         
	    }

	
}
