package mastermind;

import java.util.Random;
import java.util.Scanner;


public class GameController  {
	
	//-------------------------------------
		//Correction de la CombiIn
	//-------------------------------------
	
	
	
			
	
	public 	static char[] combiIn = new char[4];	// Pour la longueur du tableau qui rÃ©ceptionne la combi qu'on encode
	private static String combiStr;			//			
	private static int easy = 12;			// Mode Easy avec 12 chances
	private static int normal = 9 ;			// Mode Normal avec 9 chances
	private static int hard = 5;			// Mode Hard avec 5 chance
	private static String level;			// Le niveau qu'on desire pour le jeu
	private static int difficulty;			// La difficulté = le nombre de chance
	private static int choiceL = 0;			// Choix du niveau
	private static int limite;			// Nombre de limite
	private static String mode;			// Le mode qu'on desire
	private static int choiceM = 0;			// le nombre du mode 1=solo  2=multi
			
	
	
	public GameController(){
		
	}
	
	
		public static void main(String[] args){  

				RandomCombi game = new RandomCombi();							// gamePC --> gÃ©nÃ©rer la combi
				GameController gameCtrl = new GameController();// gameController --> pour la correction 	IDEAL, CHANGER CELA DE CLASSE
				Correction corr = new Correction();
				RandomCombiSoloPc solo = new RandomCombiSoloPc();
				
				Scanner combiInput = new Scanner(System.in);	//Scanner la combinaison qu'on entre
				Scanner levelInput = new Scanner(System.in);	//Scanner le level souhaité
				Scanner modeInput = new Scanner(System.in);
				
								// pour afficher la solution
											/*System.out.print("solution:    "); 
											System.out.print(game.combi[0]+" ");
											System.out.print(game.combi[1]+" ");
											System.out.print(game.combi[2]+" ");
											System.out.println(game.combi[3]+"\n \n");
											*/
											//System.out.println("-------------\n");
				
				
				
				while(choiceM==0) {
					System.out.println("Choisir votre mode");
					System.out.println("Solo = 'S'");
					System.out.println("Muli = 'M'");
			
					
			        mode= modeInput.next();
			        mode = mode.toLowerCase();
			        
			        if( mode.equals("s")) {
			        	System.out.print("\nMode: Solo\n");
			        	choiceM = 1;
			        }
			        else if(mode.equals("m")) {
			        	System.out.print("\nMode: Multi \n");
			        	choiceM = 2;
			        }
			        else{
			        	System.out.println("\nNo correct \n\n");
			        	choiceM = 0;
			        }
				}
				
				
				
				if(choiceM==1) { //--------------------------------------------------------------------------------------------------------------------------
					System.out.println("\nIndisponible \n\n");
					
														System.out.print("solution:    "); 
														System.out.print(game.combi[0]+" ");
														System.out.print(game.combi[1]+" ");
														System.out.print(game.combi[2]+" ");
														System.out.println(game.combi[3]+"\n \n");
			
			      limite = 5;
			         int j=1;
			         while(j<= limite) {
			        	 System.out.println("----------------------------------------------------------");
			        	 System.out.println("Please enter your numbers:");
				         combiStr= combiInput.nextLine();
			
				         
					         for(int i =0; i < 4;i++) {
					        	 combiIn[i] = combiStr.charAt(i);
					         }
					         
					         	//String combiRandomSolo = "0123456789";
					         	Random r = new Random();
					         	int SIZE = game.combiRandom.length();
					         	char combiSolo[] = new char [4];
					    		for(int i = 0; i<4; i++) {
					    			combiSolo[i]= game.combiRandom.charAt(r.nextInt(SIZE));
					    			
					    			
					    		}
					         
					         
					         
					         
					         	System.out.print("Combi du pc:"); 
								System.out.print(combiSolo[0]+" ");
								System.out.print(combiSolo[1]+" ");
								System.out.print(combiSolo[2]+" ");
								System.out.println(combiSolo[3]);
								
								
								
					         //_______ Ã©crire la combi______
					          System.out.print("\nvotre combi:"); 
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
				
														
											
													
					
					
				
					
					
					
					
					
					
					
					
					
					
					
					
					
				}//--------------------------------------------------------------------------------------------------------------------------
				else {
					
			
				
				while(choiceL==0) {
					System.out.println("Hard = 'H'        5 chances");
					System.out.println("Normal = 'N'      9 chances");
					System.out.println("Easy = 'E'        12 chances");
					System.out.println("Please enter your difficulty:");
					
			        level= levelInput.next();
			        level = level.toLowerCase();
			        
			        if( level.equals("h")) {
			        	System.out.print("\nYour level is : Hard	\n");
			        	difficulty = hard;
			        	choiceL = 1;
			        }
			        else if(level.equals("n")) {
			        	System.out.print("\nYour level is : normal  \n");
			        	difficulty = normal;
			        	choiceL = 1;
			        }
			        else if(level.equals("e")) {
			        	System.out.print("\nYour level is : Easy \n");
			        	difficulty = easy;
			        	choiceL = 1;
			        }
			        else{
			        	System.out.println("\nNo correct \n\n");
			        	choiceL = 0;
			        }
				}
		        
		        
			         
		      //-------------------
			      
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
				    
}
