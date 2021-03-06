package view;

import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;
import network.AddressIp;

import controller.Correction;
import controller.RandomCombi;
import model.ModelGame;

/**
 * 
 * @author Bohyn Gauthier
 * @author Hermand Thibaut
 * @author Meyers Humbert
 * Affiche le mastermind en console
 */

public class ViewConsole {

	public static void main(String[] args) {

		// Instances
		RandomCombi instGame = new RandomCombi();
		Correction instCorrection = new Correction();
		Correction instCorrectionPc = new Correction();
		ModelGame gameController = new ModelGame();
		AddressIp addressIp = new AddressIp();

		
		// Pour afficher la solution si on le desire
		/* 
		  System.out.print("solution:    "); 
		  afficheCombi(instGame.combi);
		 */ 
		 

		int choiceM = gameController.chooseMode();
		
		// ----- Mode 1 = Mode Solo ---------------------------------------------------------------------------------------------------------------------	
		if(choiceM == 1) {
		
			gameController.limite = gameController.chooseLevel();
			
			int j = 1;

			while (j <= gameController.getLimite()) {

				char resultCombi[] = new char[4];
				System.out.println("Il vous reste " + (gameController.getLimite() - (j+1) +2) + " chances");
				System.out.println("----------------------------------------------------------");
				System.out.println("Please enter your numbers:");
				
				gameController.setCombiIn(gameController.enterCombi());

				System.out.print("\nvotre combi: ");

				gameController.afficheCombi(gameController.getCombiIn());

				System.out.println("----------------------");

				resultCombi = instCorrection.correction(gameController.getCombiIn(), instGame.combi);

				// --- Afficher la combi de l'utilisateur ---
				System.out.print("Resultat:    ");
				gameController.afficheCombi(resultCombi);

				j++;

				if (resultCombi[0] == 'V' && resultCombi[1] == 'V' && resultCombi[2] == 'V' && resultCombi[3] == 'V') {
					System.out.print("BRAVO \nVous avez gagne en " + (j-1) + " essais");
					j = gameController.getLimite() + 1;
				}
				// --- Perdu si limite depassee ---
				else if (j == gameController.getLimite() + 1) {
					System.out.println("Vous avez perdu");
					System.out.print("Vous avez deja utiliser vos " + gameController.getLimite() + " chances...");
					System.out.print("La combinaison etait : ");
					gameController.afficheCombi(instGame.combi);
				}
			}
		}
		
		// ----- Mode 2 = Mode Solo with Pc ---------------------------------------------------------------------------------------------------------------------	

		else if (choiceM == 2) { 

		
			gameController.setLimite(100);
			
			boolean positionCorrect[] = {false,false,false,false};
			char numeroCorrect[] = new char[4] ;
			
			int j = 1;
			while (j <= gameController.getLimite()) {

				char resultCombiPc[] = new char[4]; //Resultat de la combi du PC
				char resultCombi[] = new char[4];   //Resultat de la combi de l utilisateur
				char combiPc[] = new char[4];     //Combi du PC
				
				
				System.out.println("----------------------------------------------------------");
				System.out.println("Please enter your numbers:");

				gameController.setCombiIn(gameController.enterCombi()); // l'utilisateur entre sa combi

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
				resultCombi = instCorrection.correction(gameController.getCombiIn(), instGame.combi);
				resultCombiPc = instCorrectionPc.correction(combiPc, instGame.combi);
				
				// --- Verifie si le pc a trouver des bonnes reponses ---
				for(int i = 0; i < 4; i++) {
					if(resultCombiPc[i] == 'V'){
						positionCorrect[i] = true;
						numeroCorrect[i] = combiPc[i];
					}
					if(resultCombi[i] == 'V'){
						positionCorrect[i] = true;
						numeroCorrect[i] = gameController.getCombiIn()[i];
					}	
				}
			
				// --- Afficher la combi du PC ---
				System.out.print("Combi du pc: ");
				gameController.afficheCombi(combiPc);
				System.out.println("----------------------");

				// --- Afficher la correction du PC ---
				System.out.print("Resultat:    ");

				gameController.afficheCombi(resultCombiPc);

				// --- Afficher la combi de l'utilisateur ---
				System.out.print("\nvotre combi: ");
				gameController.afficheCombi(gameController.getCombiIn());
				System.out.println("----------------------");

				// --- Afficher la correction de l'utilisateur ---
				System.out.print("Resultat:    ");
				gameController.afficheCombi(resultCombi);

				j++;
				
				if((resultCombi[0] == 'V' && resultCombi[1] == 'V' && resultCombi[2] == 'V' && resultCombi[3] == 'V') && (resultCombiPc[0] == 'V' && resultCombiPc[1] == 'V' && resultCombiPc[2] == 'V' && resultCombiPc[3] == 'V')) {
					System.out.print("Egalite");
				}
				
				// --- GAGNER ---
				if (resultCombi[0] == 'V' && resultCombi[1] == 'V' && resultCombi[2] == 'V' && resultCombi[3] == 'V') {
					System.out.print("BRAVO \nVous avez gagne en " + (j-1) + " essais");
					j = gameController.getLimite() + 1;
				}
				
				// --- PERDU ---
				else if(resultCombiPc[0] == 'V' && resultCombiPc[1] == 'V' && resultCombiPc[2] == 'V' && resultCombiPc[3] == 'V') {
					System.out.print("Le pc a gagne...");
					j = gameController.getLimite() + 1;
				}
				else if (j == gameController.getLimite() + 1) {
					System.out.println("Vous avez perdu");
					System.out.print("Vous avez deja utilise vos " + gameController.getLimite() + " chances...");
					System.out.print("La combinaison etait : ");
					gameController.afficheCombi(instGame.combi);
				}
			}
		}
		
		// ----- Mode 3 = Mode Multiplayer ---------------------------------------------------------------------------------------------------------------------
		
		else if (choiceM == 3) {
			// --- Choix host/guest ---
			int choiceH = gameController.chooseHost();
			
			/**
			 * MODE MULTIPLAYER
			 */
			
			
				System.out.print("\nMode Multi arrive bientot");
			
			
		}
	}
}
