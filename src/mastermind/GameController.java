package mastermind;

import java.util.Random;
import java.util.Scanner;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert
 */
public class GameController {

	// -------------------------------------
	// Affichage du jeu
	// -------------------------------------
	
	
//_______________VARIABLES___________________________________________________________________________________________________________
	
	public static char[] combiIn = new char[4]; // Pour la longueur du tableau qui receptionne la combi qu'on encode
	private static int easy = 12; // Mode Easy avec 12 chances
	private static int normal = 9; // Mode Normal avec 9 chances
	private static int hard = 5; // Mode Hard avec 5 chance
	private static String level; // Le niveau qu'on desire pour le jeu
	private static int limite; // La difficulte = le nombre de chance / nombre de limite
	private static String mode; // Le mode qu'on desire
	
//________________CONSTRUCTEURS__________________________________________________________________________________________________
	public GameController() {

	}
//_________________METHODES____________________________________________________________________________________________________

	
	
	// --- Entrez une combi ---
	/**  
	 * @return combiIn tableau contenant la combinaison entree
	 */
	public static char[] enterCombi() {

		String combiStr = "";
		
		Scanner combiInput = new Scanner(System.in);

		combiStr = combiInput.nextLine();

		for (int i = 0; i < 4; i++) {
			combiIn[i] = combiStr.charAt(i);
		}

		return combiIn;

	}

	
	// --- Choisir son level ---
	/**
	 * @return difficulty (int) niveau de difficulte (5 ou 9 ou 12)
	 */
	public static int chooseLevel() {

		Scanner levelInput = new Scanner(System.in);
		int choiceL = 0;
		int difficulty = 0;

		while (choiceL == 0) {
			System.out.println("Hard = 'H'        5 chances");
			System.out.println("Normal = 'N'      9 chances");
			System.out.println("Easy = 'E'        12 chances");
			System.out.println("Please enter your difficulty:");

			level = levelInput.next();
			level = level.toLowerCase();

			if (level.equals("h")) {
				System.out.print("\nYour level is : Hard	\n");
				difficulty = hard;
				choiceL = 1;
			} else if (level.equals("n")) {
				System.out.print("\nYour level is : normal  \n");
				difficulty = normal;
				choiceL = 1;
			} else if (level.equals("e")) {
				System.out.print("\nYour level is : Easy \n");
				difficulty = easy;
				choiceL = 1;
			} else {
				System.out.println("\nNo correct \n\n");
				choiceL = 0;
			}
		}
		return difficulty;
	}

	
	// --- Choisir un mode ---
	/**
	 * @return choiceM (int) mode de jeu (0 ou 1 ou 2 ou 3)
	 */
	public static int chooseMode() {

		Scanner modeInput = new Scanner(System.in);
		int choiceM = 0;

		while (choiceM == 0) {
			System.out.println("Choisir votre mode");
			System.out.println("Solo = 'S'");
			System.out.println("Pc = 'P'");
			System.out.println("Muli = 'M'");

			mode = modeInput.next(); // Enregistrer le mode demande
			mode = mode.toLowerCase(); // Tout transformer en minuscule

			/**
			 * l'utilisateur sera oblige d'encoder comme valeur S ou M 0 (Re-)commence la
			 * boucle 1 Direction mode solo 2 Direction mode Multi
			 */
			if (mode.equals("s")) {
				System.out.print("\nMode: Solo\n");
				choiceM = 1; // 1 = Solo
			}
			else if (mode.equals("p")) {
				System.out.print("\nMode: Pc\n");
				choiceM = 2; // 2 = Pc
			} else if (mode.equals("m")) {
				System.out.print("\nMode: Multi \n");
				choiceM = 3; // 3 = Multi
			} else {
				System.out.println("\nNo correct \n\n");
				choiceM = 0; // Recommence la boucle
			}
		}

		return choiceM;
	}

	
	// --- Affiche une combi ---
	/**
	 * @param combi combinaison a affiche
	 */
	public static void afficheCombi(char[] combi) {

		for (int i = 0; i < combi.length; i++) {
			System.out.print(combi[i] + " ");
		}
		System.out.print("\n");
	}

//__________________MAIN__________________________________________________________________________________________________________

	public static void main(String[] args) {

		// Instances
		RandomCombi instGame = new RandomCombi();
		Correction instCorrection = new Correction();
		Correction instCorrectionPc = new Correction();

		
		// Pour afficher la solution si on le desire
		/* 
		  System.out.print("solution:    "); 
		  afficheCombi(instGame.combi);
		 */ 
		 

		int choiceM = chooseMode();
		if(choiceM == 1) {
			limite = chooseLevel();

			int j = 1;
			while (j <= limite) {

				char resultCombi[] = new char[4];

				System.out.println("----------------------------------------------------------");
				System.out.println("Please enter your numbers:");

				combiIn = enterCombi();

				System.out.print("\nvotre combi: ");

				afficheCombi(combiIn);

				System.out.println("----------------------");

				resultCombi = instCorrection.correction(combiIn, instGame.combi);

				// --- Afficher la combi de l'utilisateur ---
				System.out.print("Resultat:    ");
				afficheCombi(resultCombi);

				j++;

				if (resultCombi[0] == 'V' && resultCombi[1] == 'V' && resultCombi[2] == 'V' && resultCombi[3] == 'V') {
					System.out.print("BRAVO \nVous avez gagnÃƒÂ©!!");
					j = limite + 1;
				}
				// --- Perdu si limite depassee ---
				else if (j == limite + 1) {
					System.out.println("Vous avez perdu");
					System.out.print("Vous avez deja utiliser vos " + limite + " chances...");
					System.out.print("La combinaison etait : ");
					afficheCombi(instGame.combi);
				}
			}
		}
		else if (choiceM == 2) { // --------------------------------------------------------------------------------------------------------------------------

		
			limite = 100;
			
			boolean positionCorrect[] = {false,false,false,false};
			char numeroCorrect[] = new char[4] ;
			
			
			

			int j = 1;
			while (j <= limite) {

				char resultCombiPc[] = new char[4]; //Resultat de la combi du PC
				char resultCombi[] = new char[4];   //Resultat de la combi de l utilisateur
				char combiPc[] = new char[4];     //Combi du PC
				
				
				System.out.println("----------------------------------------------------------");
				System.out.println("Please enter your numbers:");

				combiIn = enterCombi(); // l'utilisateur entre sa combi

				// --- Random des 4 chiffres pour le PC ---
				Random r = new Random();
				int size = instGame.combiRandom.length();// nombre de chiffre possible (ici de 0-9)
				
				for (int i = 0; i < 4; i++) {
					combiPc[i] = instGame.combiRandom.charAt(r.nextInt(size)); // transformer le String en tableau
					
					if(positionCorrect[i] == true) {
						combiPc[i] = numeroCorrect[i];
					}
					
				}
				
				
				// --- Tranforme les String des correction en char ---
				resultCombi = instCorrection.correction(combiIn, instGame.combi);
				resultCombiPc = instCorrectionPc.correction(combiPc, instGame.combi);
				
				// --- Verifie si le pc a trouver des bonnes reponses ---
				for(int i = 0; i < 4; i++) {
					if(resultCombiPc[i] == 'V'){
						positionCorrect[i] = true;
						numeroCorrect[i] = combiPc[i];
					}
					if(resultCombi[i] == 'V'){
						positionCorrect[i] = true;
						numeroCorrect[i] = combiIn[i];
					}
					
						
				}
			
				// --- Afficher la combi du PC ---
				System.out.print("Combi du pc: ");
				afficheCombi(combiPc);
				System.out.println("----------------------");

				// --- Afficher la correction du PC ---
				System.out.print("Resultat:    ");

				afficheCombi(resultCombiPc);

				// --- Afficher la combi de l'utilisateur ---
				System.out.print("\nvotre combi: ");
				afficheCombi(combiIn);
				System.out.println("----------------------");

				// --- Afficher la correction de l'utilisateur ---
				System.out.print("Resultat:    ");
				afficheCombi(resultCombi);

				j++;
				
				// --- GAGNER ---
				if (resultCombi[0] == 'V' && resultCombi[1] == 'V' && resultCombi[2] == 'V' && resultCombi[3] == 'V') {
					System.out.print("BRAVO \nVous avez gagne!!");
					j = limite + 1;
				}
				
				// --- PERDU ---
				else if(resultCombiPc[0] == 'V' && resultCombiPc[1] == 'V' && resultCombiPc[2] == 'V' && resultCombiPc[3] == 'V') {
					System.out.print("Le pc a gagne...");
					j = limite + 1;
				}
				else if (j == limite + 1) {
					System.out.println("Vous avez perdu");
					System.out.print("Vous avez deja utilise vos " + limite + " chances...");
					System.out.print("La combinaison etait : ");
					afficheCombi(instGame.combi);
				}
			}

		}
//--------------------------------------------------------------------------------------------------------------------------
		else if (choiceM == 3) {

			System.out.println("Coming soon ...");
			
		}

	}
	
}
