/**
 * 
 */
package mastermind;

import java.util.Scanner;

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
			txt += correct[i]+" ";
		}
		
		return txt;	
	}
	
	
}
