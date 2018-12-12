/**
 * 
 */
package mastermind;


/**
 * @author USER1
 *
 */
public class GameControllerGUI {
	
	public char[] combiIn = new char[4]; 
	
	
	Correction instCorr = new Correction();
	RandomCombi instCombiRandom = new RandomCombi();

	public GameControllerGUI() {
			
	}
	
	
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
	
	public String convertWithoutSpaces(String txt) {
		String txt2 = "";
		int i = 0;
		while (i <= 6) {
			txt2+= txt.charAt(i);
			i=i+2;
		}
		return txt2;
		
		
	}
	
}
