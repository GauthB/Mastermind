package View;
import mastermind.GameController;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;

public class ViewRules extends JFrame implements ActionListener {

	private JPanel contentPane;
	String temp="";
	private JLabel label_3;
	GameController GameController = new GameController();
	private JLabel label;
	private JLabel lblHermant;
	private JLabel lblMeryers;
	private JLabel lblGauthier;
	private JLabel lblThibaut;
	private JLabel lblHumbert;


	
	ViewHote viewHote = new ViewHote();
	
	private JLabel label_1;
	private JLabel lblLapplicationGnre_1;
	private JLabel lblElleCorrigeEllemme;
	private JLabel lblMulti;
	private JLabel lblLesJoueurs;
	private JLabel lblLapplicationGnreAlatoirement;
	private JLabel lblChaqueJoueurDoit;
	private JLabel lblCarLeGagnant;
	private JLabel lblMaisSiAucun;
	private JLabel lblCestCeluiQui;
	private JLabel lblChaqueJoueurPourra;
	private JLabel label_5;
	private JLabel lblEasy;
	private JLabel lblNormal;
	private JLabel lblHard;
	private JLabel lblIlNyA;
	private JButton btnReturn;
	private JLabel lblSoloWithPc;
	private JLabel lblLapplicationGnre;
	private JLabel lblLordinateurCorrigeLuimme;
	private JLabel lblAuxRsultatsQuil;
	private JLabel lblLaBonnePlace;
	private JLabel lblAttentionVousVoyez;
	private JLabel lblVoirVosRsultats;
	private JLabel lblVousAvez;
	private JLabel lblJoueurs;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRules frame = new ViewRules();
					frame.setVisible(true);
					frame.setTitle("Number Mastermind");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewRules() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{50, 100, 80, 80, 80, 35, 80, 80, 80, 0};
		gbl_contentPane.rowHeights = new int[]{ 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0,  20, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		btnReturn = new JButton("Return");
		GridBagConstraints gbc_btnReturn = new GridBagConstraints();
		gbc_btnReturn.insets = new Insets(0, 0, 5, 5);
		gbc_btnReturn.gridx = 0;
		gbc_btnReturn.gridy = 1;
		contentPane.add(btnReturn, gbc_btnReturn);
		btnReturn.addActionListener(this);
		
		label_3 = new JLabel("Number Mastermind");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 11;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 2;
		contentPane.add(label_3, gbc_label_3);
		
		label_1 = new JLabel("Solo");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		contentPane.add(label_1, gbc_label_1);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 34;
		btnExit.addActionListener(this);
		
		lblLapplicationGnre_1 = new JLabel("- L’application génère aléatoirement la combinaison de 4 couleurs");
		GridBagConstraints gbc_lblLapplicationGnre_1 = new GridBagConstraints();
		gbc_lblLapplicationGnre_1.anchor = GridBagConstraints.WEST;
		gbc_lblLapplicationGnre_1.gridwidth = 8;
		gbc_lblLapplicationGnre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLapplicationGnre_1.gridx = 1;
		gbc_lblLapplicationGnre_1.gridy = 4;
		contentPane.add(lblLapplicationGnre_1, gbc_lblLapplicationGnre_1);
		
		lblElleCorrigeEllemme = new JLabel("- L’ordinateur corrige lui-même le joueur grâce aux résultats qu’il renvoi, il répond par:");
		GridBagConstraints gbc_lblElleCorrigeEllemme = new GridBagConstraints();
		gbc_lblElleCorrigeEllemme.anchor = GridBagConstraints.WEST;
		gbc_lblElleCorrigeEllemme.gridwidth = 10;
		gbc_lblElleCorrigeEllemme.insets = new Insets(0, 0, 5, 5);
		gbc_lblElleCorrigeEllemme.gridx = 1;
		gbc_lblElleCorrigeEllemme.gridy = 5;
		contentPane.add(lblElleCorrigeEllemme, gbc_lblElleCorrigeEllemme);
		
		lblIlNyA = new JLabel("  \tV (Chiffre bonne place), / (Chiffre existant mais pas à la bonne place), X(Chiffre n’existant pas) . \n");
		GridBagConstraints gbc_lblIlNyA = new GridBagConstraints();
		gbc_lblIlNyA.gridwidth = 10;
		gbc_lblIlNyA.anchor = GridBagConstraints.WEST;
		gbc_lblIlNyA.insets = new Insets(0, 0, 5, 5);
		gbc_lblIlNyA.gridx = 1;
		gbc_lblIlNyA.gridy = 6;
		contentPane.add(lblIlNyA, gbc_lblIlNyA);
		
		label_5 = new JLabel("3 modes");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 7;
		contentPane.add(label_5, gbc_label_5);
		
		lblEasy = new JLabel("- Easy = 12 tentatives");
		GridBagConstraints gbc_lblEasy = new GridBagConstraints();
		gbc_lblEasy.anchor = GridBagConstraints.WEST;
		gbc_lblEasy.gridwidth = 4;
		gbc_lblEasy.insets = new Insets(0, 0, 5, 5);
		gbc_lblEasy.gridx = 2;
		gbc_lblEasy.gridy = 8;
		contentPane.add(lblEasy, gbc_lblEasy);
		
		lblNormal = new JLabel("- Normal = 9 tentative");
		GridBagConstraints gbc_lblNormal = new GridBagConstraints();
		gbc_lblNormal.anchor = GridBagConstraints.WEST;
		gbc_lblNormal.gridwidth = 4;
		gbc_lblNormal.insets = new Insets(0, 0, 5, 5);
		gbc_lblNormal.gridx = 2;
		gbc_lblNormal.gridy = 9;
		contentPane.add(lblNormal, gbc_lblNormal);
		
		lblHard = new JLabel("- Hard = 5 tentatives");
		GridBagConstraints gbc_lblHard = new GridBagConstraints();
		gbc_lblHard.anchor = GridBagConstraints.WEST;
		gbc_lblHard.gridwidth = 4;
		gbc_lblHard.insets = new Insets(0, 0, 5, 5);
		gbc_lblHard.gridx = 2;
		gbc_lblHard.gridy = 10;
		contentPane.add(lblHard, gbc_lblHard);
		
		lblSoloWithPc = new JLabel("Solo with Pc");
		GridBagConstraints gbc_lblSoloWithPc = new GridBagConstraints();
		gbc_lblSoloWithPc.anchor = GridBagConstraints.WEST;
		gbc_lblSoloWithPc.insets = new Insets(0, 0, 5, 5);
		gbc_lblSoloWithPc.gridx = 1;
		gbc_lblSoloWithPc.gridy = 12;
		contentPane.add(lblSoloWithPc, gbc_lblSoloWithPc);
		
		lblLapplicationGnre = new JLabel("-\tL’application génère aléatoirement la combinaison de 4 chiffres.\n");
		GridBagConstraints gbc_lblLapplicationGnre = new GridBagConstraints();
		gbc_lblLapplicationGnre.anchor = GridBagConstraints.WEST;
		gbc_lblLapplicationGnre.gridwidth = 10;
		gbc_lblLapplicationGnre.insets = new Insets(0, 0, 5, 5);
		gbc_lblLapplicationGnre.gridx = 1;
		gbc_lblLapplicationGnre.gridy = 13;
		contentPane.add(lblLapplicationGnre, gbc_lblLapplicationGnre);
		
		lblLordinateurCorrigeLuimme = new JLabel("- L’ordinateur corrige lui-même le joueur et la combinaison imaginée par l’ordinateur grâce ");
		GridBagConstraints gbc_lblLordinateurCorrigeLuimme = new GridBagConstraints();
		gbc_lblLordinateurCorrigeLuimme.anchor = GridBagConstraints.WEST;
		gbc_lblLordinateurCorrigeLuimme.gridwidth = 10;
		gbc_lblLordinateurCorrigeLuimme.insets = new Insets(0, 0, 5, 5);
		gbc_lblLordinateurCorrigeLuimme.gridx = 1;
		gbc_lblLordinateurCorrigeLuimme.gridy = 14;
		contentPane.add(lblLordinateurCorrigeLuimme, gbc_lblLordinateurCorrigeLuimme);
		
		lblAuxRsultatsQuil = new JLabel("   aux résultats qu’il renvoi, il répond par V (Chiffre bonne place), / (Chiffre existant mais pas à ");
		GridBagConstraints gbc_lblAuxRsultatsQuil = new GridBagConstraints();
		gbc_lblAuxRsultatsQuil.anchor = GridBagConstraints.WEST;
		gbc_lblAuxRsultatsQuil.gridwidth = 10;
		gbc_lblAuxRsultatsQuil.insets = new Insets(0, 0, 5, 5);
		gbc_lblAuxRsultatsQuil.gridx = 1;
		gbc_lblAuxRsultatsQuil.gridy = 15;
		contentPane.add(lblAuxRsultatsQuil, gbc_lblAuxRsultatsQuil);
		
		lblLaBonnePlace = new JLabel("   la bonne place), X(Chiffre n’existant pas) . ");
		GridBagConstraints gbc_lblLaBonnePlace = new GridBagConstraints();
		gbc_lblLaBonnePlace.anchor = GridBagConstraints.WEST;
		gbc_lblLaBonnePlace.gridwidth = 10;
		gbc_lblLaBonnePlace.insets = new Insets(0, 0, 5, 5);
		gbc_lblLaBonnePlace.gridx = 1;
		gbc_lblLaBonnePlace.gridy = 16;
		contentPane.add(lblLaBonnePlace, gbc_lblLaBonnePlace);
		
		lblAttentionVousVoyez = new JLabel("- Attention, vous voyez les résultats de l’ordinateur, cela veut dire que l’ordinateur peut aussi ");
		GridBagConstraints gbc_lblAttentionVousVoyez = new GridBagConstraints();
		gbc_lblAttentionVousVoyez.anchor = GridBagConstraints.WEST;
		gbc_lblAttentionVousVoyez.gridwidth = 10;
		gbc_lblAttentionVousVoyez.insets = new Insets(0, 0, 5, 5);
		gbc_lblAttentionVousVoyez.gridx = 1;
		gbc_lblAttentionVousVoyez.gridy = 17;
		contentPane.add(lblAttentionVousVoyez, gbc_lblAttentionVousVoyez);
		
		lblVoirVosRsultats = new JLabel("   voir vos résultats !");
		GridBagConstraints gbc_lblVoirVosRsultats = new GridBagConstraints();
		gbc_lblVoirVosRsultats.anchor = GridBagConstraints.WEST;
		gbc_lblVoirVosRsultats.gridwidth = 10;
		gbc_lblVoirVosRsultats.insets = new Insets(0, 0, 5, 5);
		gbc_lblVoirVosRsultats.gridx = 1;
		gbc_lblVoirVosRsultats.gridy = 18;
		contentPane.add(lblVoirVosRsultats, gbc_lblVoirVosRsultats);
		
		lblVousAvez = new JLabel("-\tVous avez 12 chances maximum.\n");
		GridBagConstraints gbc_lblVousAvez = new GridBagConstraints();
		gbc_lblVousAvez.anchor = GridBagConstraints.WEST;
		gbc_lblVousAvez.gridwidth = 10;
		gbc_lblVousAvez.insets = new Insets(0, 0, 5, 5);
		gbc_lblVousAvez.gridx = 1;
		gbc_lblVousAvez.gridy = 19;
		contentPane.add(lblVousAvez, gbc_lblVousAvez);
		
		lblMulti = new JLabel("Multi");
		GridBagConstraints gbc_lblMulti = new GridBagConstraints();
		gbc_lblMulti.anchor = GridBagConstraints.WEST;
		gbc_lblMulti.insets = new Insets(0, 0, 5, 5);
		gbc_lblMulti.gridx = 1;
		gbc_lblMulti.gridy = 21;
		contentPane.add(lblMulti, gbc_lblMulti);
		
		lblLesJoueurs = new JLabel("-\tLes 2 joueurs sont connectés en réseau sur 2 appareils différents mais sur le même réseau.\n");
		GridBagConstraints gbc_lblLesJoueurs = new GridBagConstraints();
		gbc_lblLesJoueurs.anchor = GridBagConstraints.WEST;
		gbc_lblLesJoueurs.gridwidth = 8;
		gbc_lblLesJoueurs.insets = new Insets(0, 0, 5, 5);
		gbc_lblLesJoueurs.gridx = 1;
		gbc_lblLesJoueurs.gridy = 22;
		contentPane.add(lblLesJoueurs, gbc_lblLesJoueurs);
		
		lblLapplicationGnreAlatoirement = new JLabel("- L’application génère aléatoirement la combinaison de 4 chiffres (elle est la même pour les 2 ");
		GridBagConstraints gbc_lblLapplicationGnreAlatoirement = new GridBagConstraints();
		gbc_lblLapplicationGnreAlatoirement.anchor = GridBagConstraints.WEST;
		gbc_lblLapplicationGnreAlatoirement.gridwidth = 7;
		gbc_lblLapplicationGnreAlatoirement.insets = new Insets(0, 0, 5, 5);
		gbc_lblLapplicationGnreAlatoirement.gridx = 1;
		gbc_lblLapplicationGnreAlatoirement.gridy = 23;
		contentPane.add(lblLapplicationGnreAlatoirement, gbc_lblLapplicationGnreAlatoirement);
		
		lblJoueurs = new JLabel("   joueurs !!) ");
		GridBagConstraints gbc_lblJoueurs = new GridBagConstraints();
		gbc_lblJoueurs.anchor = GridBagConstraints.WEST;
		gbc_lblJoueurs.insets = new Insets(0, 0, 5, 5);
		gbc_lblJoueurs.gridx = 1;
		gbc_lblJoueurs.gridy = 24;
		contentPane.add(lblJoueurs, gbc_lblJoueurs);
		
		lblChaqueJoueurDoit = new JLabel("- Chaque joueur doit trouver la combinaison le plus rapidement possible car le gagnant est le ");
		GridBagConstraints gbc_lblChaqueJoueurDoit = new GridBagConstraints();
		gbc_lblChaqueJoueurDoit.anchor = GridBagConstraints.WEST;
		gbc_lblChaqueJoueurDoit.gridwidth = 8;
		gbc_lblChaqueJoueurDoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblChaqueJoueurDoit.gridx = 1;
		gbc_lblChaqueJoueurDoit.gridy = 25;
		contentPane.add(lblChaqueJoueurDoit, gbc_lblChaqueJoueurDoit);
		
		lblCarLeGagnant = new JLabel("   premier à l’avoir trouvé !");
		GridBagConstraints gbc_lblCarLeGagnant = new GridBagConstraints();
		gbc_lblCarLeGagnant.anchor = GridBagConstraints.WEST;
		gbc_lblCarLeGagnant.gridwidth = 7;
		gbc_lblCarLeGagnant.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarLeGagnant.gridx = 1;
		gbc_lblCarLeGagnant.gridy = 26;
		contentPane.add(lblCarLeGagnant, gbc_lblCarLeGagnant);
		
		lblMaisSiAucun = new JLabel("- Le nombre de tentatives est fixé à 12. Chaque joueur pourra visualiser le jeu de l’autre en ");
		GridBagConstraints gbc_lblMaisSiAucun = new GridBagConstraints();
		gbc_lblMaisSiAucun.anchor = GridBagConstraints.WEST;
		gbc_lblMaisSiAucun.gridwidth = 8;
		gbc_lblMaisSiAucun.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaisSiAucun.gridx = 1;
		gbc_lblMaisSiAucun.gridy = 27;
		contentPane.add(lblMaisSiAucun, gbc_lblMaisSiAucun);
		
		lblCestCeluiQui = new JLabel("   direct (donc une possibilité de tricherie … ).");
		GridBagConstraints gbc_lblCestCeluiQui = new GridBagConstraints();
		gbc_lblCestCeluiQui.anchor = GridBagConstraints.WEST;
		gbc_lblCestCeluiQui.gridwidth = 7;
		gbc_lblCestCeluiQui.insets = new Insets(0, 0, 5, 5);
		gbc_lblCestCeluiQui.gridx = 1;
		gbc_lblCestCeluiQui.gridy = 28;
		contentPane.add(lblCestCeluiQui, gbc_lblCestCeluiQui);
		
		lblChaqueJoueurPourra = new JLabel("-\tArrivé à la fin des 12 coups, la partie est finie pour ce joueur.\n");
		GridBagConstraints gbc_lblChaqueJoueurPourra = new GridBagConstraints();
		gbc_lblChaqueJoueurPourra.anchor = GridBagConstraints.WEST;
		gbc_lblChaqueJoueurPourra.gridwidth = 6;
		gbc_lblChaqueJoueurPourra.insets = new Insets(0, 0, 5, 5);
		gbc_lblChaqueJoueurPourra.gridx = 1;
		gbc_lblChaqueJoueurPourra.gridy = 29;
		contentPane.add(lblChaqueJoueurPourra, gbc_lblChaqueJoueurPourra);
		
		label = new JLabel("BOHYN ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 31;
		contentPane.add(label, gbc_label);
		
		lblGauthier = new JLabel("Gauthier");
		GridBagConstraints gbc_lblGauthier = new GridBagConstraints();
		gbc_lblGauthier.anchor = GridBagConstraints.WEST;
		gbc_lblGauthier.insets = new Insets(0, 0, 5, 5);
		gbc_lblGauthier.gridx = 1;
		gbc_lblGauthier.gridy = 31;
		contentPane.add(lblGauthier, gbc_lblGauthier);
		
		lblHermant = new JLabel("HERMANT");
		GridBagConstraints gbc_lblHermant = new GridBagConstraints();
		gbc_lblHermant.anchor = GridBagConstraints.WEST;
		gbc_lblHermant.insets = new Insets(0, 0, 5, 5);
		gbc_lblHermant.gridx = 0;
		gbc_lblHermant.gridy = 32;
		contentPane.add(lblHermant, gbc_lblHermant);
		
		lblThibaut = new JLabel("Thibaut");
		GridBagConstraints gbc_lblThibaut = new GridBagConstraints();
		gbc_lblThibaut.anchor = GridBagConstraints.WEST;
		gbc_lblThibaut.insets = new Insets(0, 0, 5, 5);
		gbc_lblThibaut.gridx = 1;
		gbc_lblThibaut.gridy = 32;
		contentPane.add(lblThibaut, gbc_lblThibaut);
		
		lblMeryers = new JLabel("MEYERS");
		GridBagConstraints gbc_lblMeryers = new GridBagConstraints();
		gbc_lblMeryers.anchor = GridBagConstraints.WEST;
		gbc_lblMeryers.insets = new Insets(0, 0, 5, 5);
		gbc_lblMeryers.gridx = 0;
		gbc_lblMeryers.gridy = 33;
		contentPane.add(lblMeryers, gbc_lblMeryers);
		
		lblHumbert = new JLabel("Humbert");
		GridBagConstraints gbc_lblHumbert = new GridBagConstraints();
		gbc_lblHumbert.anchor = GridBagConstraints.WEST;
		gbc_lblHumbert.insets = new Insets(0, 0, 5, 5);
		gbc_lblHumbert.gridx = 1;
		gbc_lblHumbert.gridy = 33;
		contentPane.add(lblHumbert, gbc_lblHumbert);
		contentPane.add(btnExit, gbc_btnExit);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		switch(e.getActionCommand()){
		case"Return":
			ViewMain viewMain = new ViewMain();
			viewMain.setVisible(true);
			this.dispose();
			break;
		case"Exit":
			
			this.dispose();
		}
	}

}
