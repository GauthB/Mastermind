package mastermind;

import java.util.Scanner;

public class GameController  {
	
	//-------------------------------------
		//Correction de la CombiIn
	//-------------------------------------
	
	
	
			
	private static char result;	
	public 	static char[] combiIn = new char[4];	// pour la longueur du tableau qui rÃ©ceptionne la combi qu'on encode
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

				RandomCombi game = new RandomCombi();							// gamePC --> gÃ©nÃ©rer la combi
				GameController gameCtrl = new GameController();// gameController --> pour la correction 	IDEAL, CHANGER CELA DE CLASSE
				Correction corr = new Correction();
				
				Scanner combiInput = new Scanner(System.in);
				Scanner levelInput = new Scanner(System.in);
								// pour afficher la solution
											System.out.print("solution:    "); 
											System.out.print(game.combi[0]+" ");
											System.out.print(game.combi[1]+" ");
											System.out.print(game.combi[2]+" ");
											System.out.println(game.combi[3]+"\n \n");
											//System.out.println("-------------\n");
				
				
				
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
					         //_______ Ã©crire la combi______
					          System.out.print("\nvotre combi: "); 
						      System.out.print(combiIn[0]+" ");
						      System.out.print(combiIn[1]+" ");
						      System.out.print(combiIn[2]+" ");
						      System.out.println(combiIn[3]);
						      System.out.println("----------------------");
						      //_____________________________
						      System.out.print("             ");
							  System.out.print(corr.correction1(combiIn,game.combi)+" ");
							  System.out.print(corr.correction2(combiIn,game.combi)+" ");
							  System.out.print(corr.correction3(combiIn,game.combi)+" ");
							  System.out.println(corr.correction4(combiIn,game.combi)+" \n");
						      j++;
						     if ((corr.correction1(combiIn,game.combi)=='V')&& (corr.correction2(combiIn,game.combi)=='V') && (corr.correction3(combiIn,game.combi)=='V') && (corr.correction4(combiIn,game.combi)=='V')) {
						    	  System.out.print("BRAVO \nVous avez gagnÃ©!!");
						    	  j=limite + 1;
						      }
						      else if (j==limite +1) {
						    	  System.out.println("Vous avez perdu");
						    	  System.out.print("Vous avez deja utiliser vos "+limite+" chances...");
						      }
			         }
		
	    }
				    
}
