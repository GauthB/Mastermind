package mastermind;

import java.util.Random;
import java.util.Scanner;

/**
* @author BOHYN Gauthier
* @author HERMANT Thibaut
* @author MEYERS Humbert
*/
public class GameController  {
	
	
	
	//-------------------------------------
		//Affichage du jeu
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

		RandomCombi game = new RandomCombi();			
		GameController gameCtrl = new GameController();			
		Correction corr = new Correction();
		RandomCombiSoloPc solo = new RandomCombiSoloPc();

		Scanner combiInput = new Scanner(System.in);	//Scanner la combinaison qu'on entre
		Scanner levelInput = new Scanner(System.in);	//Scanner le level souhait
		Scanner modeInput = new Scanner(System.in);	// Scanner le mode souhaite

		// pour afficher la solution si on le desire
			/*
			System.out.print("solution:    "); 
			System.out.print(game.combi[0]+" ");
			System.out.print(game.combi[1]+" ");
			System.out.print(game.combi[2]+" ");
			System.out.println(game.combi[3]+"\n \n");
			*/


		while(choiceM==0) {
			System.out.println("Choisir votre mode");
			System.out.println("Solo = 'S'");
			System.out.println("Muli = 'M'");
			
			mode= modeInput.next();			// Enregistrer le mode demande
			mode = mode.toLowerCase();		// Tout transformer en minuscule
	
			/**
			* l'utilisateur sera obligé d'encoder comme valeur S ou M
			* 	0 (Re-)commence la boucle
			*	1 Direction mode solo
			*	2 Direction mode Multi
			*/
				if( mode.equals("s")) {
					System.out.print("\nMode: Solo\n");
					choiceM = 1;				//1 = Solo
				}
				else if(mode.equals("m")) {
					System.out.print("\nMode: Multi \n");
					choiceM = 2;				//2 = Multi
				}
				else{
					System.out.println("\nNo correct \n\n");
					choiceM = 0;				// Recommence la boucle
				}
		}



			if(choiceM==1) { //--------------------------------------------------------------------------------------------------------------------------
				
			// pour afficher la solution si on le desire
				/*
				System.out.print("solution:    "); 
				System.out.print(game.combi[0]+" ");
				System.out.print(game.combi[1]+" ");
				System.out.print(game.combi[2]+" ");
				System.out.println(game.combi[3]+"\n \n");
				*/

		      limite = 5;
			 int j=1;
			 while(j<= limite) {
				System.out.println("----------------------------------------------------------");
				System.out.println("Please enter your numbers:");
				combiStr= combiInput.nextLine();
				for(int i =0; i < 4;i++) {			//---------
					combiIn[i] = combiStr.charAt(i);	//Boucle pour récupérer les 4 chiffres
				}						//---------
					
				// --- Random des 4 chiffres pour le PC ---
				Random r = new Random();
				int SIZE = game.combiRandom.length();
				char combiSolo[] = new char [4];
				for(int i = 0; i<4; i++) {
					combiSolo[i]= game.combiRandom.charAt(r.nextInt(SIZE));
				}

				// --- Afficher la combi du PC ---
				System.out.print("Combi du pc:"); 
				System.out.print(combiSolo[0]+" ");
				System.out.print(combiSolo[1]+" ");
				System.out.print(combiSolo[2]+" ");
				System.out.println(combiSolo[3]);

				// --- Afficher la combi de l'utilisateur ---
				System.out.print("\nvotre combi:"); 
				System.out.print(combiIn[0]+" ");
				System.out.print(combiIn[1]+" ");
				System.out.print(combiIn[2]+" ");
				System.out.println(combiIn[3]);
				System.out.println("----------------------");
					 
				// --- Afficher la correction X / V --- 	
				System.out.print("             ");
				System.out.print(corr.correction1(combiIn,game.combi)+" ");
				System.out.print(corr.correction2(combiIn,game.combi)+" ");
				System.out.print(corr.correction3(combiIn,game.combi)+" ");
				System.out.println(corr.correction4(combiIn,game.combi)+" \n");
				 
				// --- Ajouter +1 au nombre d'essai --
				j++; 
				 
				//Gagner si les 4 V
				if ((corr.correction1(combiIn,game.combi)=='V')&& (corr.correction2(combiIn,game.combi)=='V') && (corr.correction3(combiIn,game.combi)=='V') && (corr.correction4(combiIn,game.combi)=='V')) {
					System.out.print("BRAVO \nVous avez gagne!!");
					j=limite + 1;
				}
				// Perdu si limite depassee
				else if (j==limite +1) {
					System.out.println("Vous avez perdu");
					System.out.print("Vous avez deja utilise vos "+limite+" chances...");
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
				 	// Perdu si limite depassee
					      else if (j==limite +1) {
						  System.out.println("Vous avez perdu");
						  System.out.print("Vous avez deja utiliser vos "+limite+" chances...");
					      }
			 }
		}
 	   }
				    
}
