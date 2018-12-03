package mastermind;

import java.util.Scanner;

public class GameController  {
	
	//-------------------------------------
		//Correction de la CombiIn
	//-------------------------------------
	
	
	
	private static char correct = 'V';				// si le chiffre est au bon endroit
	private static char miCorrect = '/';			// si le chiffre existe mais n'est pas au bon endroit
	private static char noCorrect = 'X';			// si le chiffre n'existe pas dans la combi
	private static char result;	
	public static char[] combiIn = new char[4];	// pour la longueur du tableau qui réceptionne la combi qu'on encode
	private static String combiStr;					
	private static int easy = 12;
	private static int normal = 9 ;
	private static int hard = 5;
	private static String level;
	private static int difficulty;
	private static int choice = 0;
	
	
	
	public GameController(){
		
	}
	
	
		public static void main(String[] args){  

				RandomCombi game = new RandomCombi();							// gamePC --> générer la combi
				GameController gameCtrl = new GameController();		// gameController --> pour la correction 	IDEAL, CHANGER CELA DE CLASSE
				Scanner combiInput = new Scanner(System.in);
				Scanner levelInput = new Scanner(System.in);
								// pour afficher la solution
										/*	System.out.print("solution:    "); 
											System.out.print(game.combi[0]+" ");
											System.out.print(game.combi[1]+" ");
											System.out.print(game.combi[2]+" ");
											System.out.println(game.combi[3]+"\n \n");
										*/	//System.out.println("-------------\n");
				
				
				
				while(choice==0) {
					System.out.println("Hard = 'H'   5 chances");
					System.out.println("Normal = 'N'      9 chances");
					System.out.println("Easy = 'E'        12 chances");
					System.out.println("Please enter your difficulty:");
					
			        level= levelInput.next();
			        level = level.toLowerCase();
			        
			        if( level.equals("h")) {
			        	System.out.print("\nYour level is : Hard	\n");
			        	difficulty = hard;
			        	choice = 1;
			        }
			        else if(level.equals("n")) {
			        	System.out.print("\nYour level is : normal  \n");
			        	difficulty = normal;
			        	choice = 1;
			        }
			        else if(level.equals("e")) {
			        	System.out.print("\nYour level is : Easy \n");
			        	difficulty = easy;
			        	choice = 1;
			        }
			        else{
			        	System.out.println("\nNo correct \n\n");
			        	choice = 0;
			        	System.out.println(level+" \n\n");
			        }
				}
		        
		        
			         
		      //-------------------
			      int limite;
			      limite = difficulty;
			         int j=1;
			         while(j<= limite) {
			        	 System.out.println("----------------------------------------------------------");
			        	 System.out.println("Please enter your numbers:");
				         combiStr= combiInput.nextLine();
			
					         for(int i =0; i < 4;i++) {
					        	 combiIn[i] = combiStr.charAt(i);
					         }
					         //_______ écrire la combi______
					          System.out.print("\nvotre combi: "); 
						      System.out.print(combiIn[0]+" ");
						      System.out.print(combiIn[1]+" ");
						      System.out.print(combiIn[2]+" ");
						      System.out.println(combiIn[3]);
						      System.out.println("----------------------");
						      //_____________________________
						      System.out.print("             ");
							  System.out.print(gameCtrl.correction1(game)+" ");
							  System.out.print(gameCtrl.correction2(game)+" ");
							  System.out.print(gameCtrl.correction3(game)+" ");
							  System.out.println(gameCtrl.correction4(game)+" \n");
						      j++;
						      if ((gameCtrl.correction1(game)=='V')&& (gameCtrl.correction2(game)=='V') && (gameCtrl.correction3(game)=='V') && (gameCtrl.correction4(game)=='V')) {
						    	  System.out.print("BRAVO \nVous avez gagné!!");
						    	  j=limite + 1;
						      }
						      else if (j==limite +1) {
						    	  System.out.println("Vous avez perdu");
						    	  System.out.print("Vous avez deja utiliser vos "+limite+" chances...");
						      }
			         }
		
	    }
		/*public static int convertir() {
			
			int[] intArray = new int[s.length()];

			for (int i = 0; i < str.length(); i++) {
				intArray[i] = Character.digit(str.charAt(i), 4);
				
				combi = intArray[0];
				return combi
				
			}
			
			
		}*/
	    
			// correction du CombiIn 1
		/*public char correction69(RandomCombi game) {
			
			
			for(int i = 0; i > 4;i++) {
				
				if (combiIn[0] == game.combi[0]) {				// premier chiffre
		             result = correct;
		         } else if (combiIn[0] == (char)game.combi[1]) {		// deuxieme chiffre
		             result = miCorrect; 
		         } else if (combiIn[0] == (char)game.combi[2]) {		// troisieme chiffre
		             result = miCorrect;
		         } else if (combiIn[0] == (char)game.combi[3]) {		// quatrieme chiffre
		             result = miCorrect;
		         } else {
		             result = noCorrect;
		         }	      
				
	         return resultTb[i]=result; 
			}
			return resultTb[];
		}*/
		
		
		
		
		
		
		
		public char correction1(RandomCombi game){
			
			 if (combiIn[0] == game.combi[0]) {				// premier chiffre
	             result = correct;
	         } else if (combiIn[0] == (char)game.combi[1]) {		// deuxieme chiffre
	             result = miCorrect; 
	         } else if (combiIn[0] == (char)game.combi[2]) {		// troisieme chiffre
	             result = miCorrect;
	         } else if (combiIn[0] == (char)game.combi[3]) {		// quatrieme chiffre
	             result = miCorrect;
	         } else {
	             result = noCorrect;
	         }	         
	         return result; 
		}
		  public char correction2(RandomCombi game) {
				
		         if (combiIn[1] == game.combi[1]) {				// premier chiffre
		             result = correct;
		         } else if (combiIn[1] == game.combi[0]) {		// deuxieme chiffre
		             result = miCorrect;
		         } else if (combiIn[1] == game.combi[2]) {		// troisieme chiffre
		             result = miCorrect;
		         } else if (combiIn[1] == game.combi[3]) {		// quatrieme chiffre
		             result = miCorrect;
		         } else {
		             result = noCorrect;
		         }
		         return result;	         
		    }
		  public char correction3(RandomCombi game) {
				
		         if (combiIn[2] == game.combi[2]) {				// premier chiffre
		             result = correct;
		         } else if (combiIn[2] == game.combi[0]) {		// deuxieme chiffre
		             result = miCorrect;
		         } else if (combiIn[2] == game.combi[1]) {		// troisieme chiffre
		             result = miCorrect;
		         } else if (combiIn[2] == game.combi[3]) {		// quatrieme chiffre
		             result = miCorrect;
		         } else {
		             result = noCorrect;
		         }
		         return result;	         
		    }
		  public char correction4(RandomCombi game) {
				
		         if (combiIn[3] == game.combi[3]) {				// premier chiffre
		             result = correct;
		         } else if (combiIn[3] == game.combi[0]) {		// deuxieme chiffre
		             result = miCorrect;
		         } else if (combiIn[3] == game.combi[1]) {		// troisieme chiffre
		             result = miCorrect;
		         } else if (combiIn[3] == game.combi[2]) {		// quatrieme chiffre
		             result = miCorrect;
		         } else {
		             result = noCorrect;
		         }
		         return result;	         
		    }
					    
	    
}
