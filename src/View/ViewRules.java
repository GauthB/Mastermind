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
	private JLabel label_2;
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
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel lblIlNyA;
	private JButton btnReturn;
	

	
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
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{50, 100, 80, 80, 80, 35, 80, 80, 80, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 50, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
		gbc_btnExit.gridy = 26;
		btnExit.addActionListener(this);
		
		label_2 = new JLabel("L’application génère aléatoirement la combinaison de 4 couleurs");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.gridwidth = 8;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 4;
		contentPane.add(label_2, gbc_label_2);
		
		lblElleCorrigeEllemme = new JLabel("Elle corrige elle-même le joueur grâce aux pions de couleurs.");
		GridBagConstraints gbc_lblElleCorrigeEllemme = new GridBagConstraints();
		gbc_lblElleCorrigeEllemme.anchor = GridBagConstraints.WEST;
		gbc_lblElleCorrigeEllemme.gridwidth = 7;
		gbc_lblElleCorrigeEllemme.insets = new Insets(0, 0, 5, 5);
		gbc_lblElleCorrigeEllemme.gridx = 1;
		gbc_lblElleCorrigeEllemme.gridy = 5;
		contentPane.add(lblElleCorrigeEllemme, gbc_lblElleCorrigeEllemme);
		
		lblIlNyA = new JLabel("Il n'y a pas de limite");
		GridBagConstraints gbc_lblIlNyA = new GridBagConstraints();
		gbc_lblIlNyA.anchor = GridBagConstraints.WEST;
		gbc_lblIlNyA.insets = new Insets(0, 0, 5, 5);
		gbc_lblIlNyA.gridx = 1;
		gbc_lblIlNyA.gridy = 6;
		contentPane.add(lblIlNyA, gbc_lblIlNyA);
		
		lblMulti = new JLabel("Multi");
		GridBagConstraints gbc_lblMulti = new GridBagConstraints();
		gbc_lblMulti.anchor = GridBagConstraints.WEST;
		gbc_lblMulti.insets = new Insets(0, 0, 5, 5);
		gbc_lblMulti.gridx = 1;
		gbc_lblMulti.gridy = 10;
		contentPane.add(lblMulti, gbc_lblMulti);
		
		lblLesJoueurs = new JLabel("Les 2 joueurs sont connectés en réseau sur 2 appareils différents ");
		GridBagConstraints gbc_lblLesJoueurs = new GridBagConstraints();
		gbc_lblLesJoueurs.anchor = GridBagConstraints.WEST;
		gbc_lblLesJoueurs.gridwidth = 8;
		gbc_lblLesJoueurs.insets = new Insets(0, 0, 5, 5);
		gbc_lblLesJoueurs.gridx = 1;
		gbc_lblLesJoueurs.gridy = 11;
		contentPane.add(lblLesJoueurs, gbc_lblLesJoueurs);
		
		lblLapplicationGnreAlatoirement = new JLabel("L’application génère aléatoirement la combinaison de 4 couleurs");
		GridBagConstraints gbc_lblLapplicationGnreAlatoirement = new GridBagConstraints();
		gbc_lblLapplicationGnreAlatoirement.anchor = GridBagConstraints.WEST;
		gbc_lblLapplicationGnreAlatoirement.gridwidth = 7;
		gbc_lblLapplicationGnreAlatoirement.insets = new Insets(0, 0, 5, 5);
		gbc_lblLapplicationGnreAlatoirement.gridx = 1;
		gbc_lblLapplicationGnreAlatoirement.gridy = 12;
		contentPane.add(lblLapplicationGnreAlatoirement, gbc_lblLapplicationGnreAlatoirement);
		
		lblChaqueJoueurDoit = new JLabel("Chaque joueur doit trouver la combinaison le plus rapidement possible");
		GridBagConstraints gbc_lblChaqueJoueurDoit = new GridBagConstraints();
		gbc_lblChaqueJoueurDoit.anchor = GridBagConstraints.WEST;
		gbc_lblChaqueJoueurDoit.gridwidth = 8;
		gbc_lblChaqueJoueurDoit.insets = new Insets(0, 0, 5, 5);
		gbc_lblChaqueJoueurDoit.gridx = 1;
		gbc_lblChaqueJoueurDoit.gridy = 13;
		contentPane.add(lblChaqueJoueurDoit, gbc_lblChaqueJoueurDoit);
		
		lblCarLeGagnant = new JLabel("car le gagnant est le premier à l’avoir trouvé");
		GridBagConstraints gbc_lblCarLeGagnant = new GridBagConstraints();
		gbc_lblCarLeGagnant.anchor = GridBagConstraints.WEST;
		gbc_lblCarLeGagnant.gridwidth = 7;
		gbc_lblCarLeGagnant.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarLeGagnant.gridx = 2;
		gbc_lblCarLeGagnant.gridy = 14;
		contentPane.add(lblCarLeGagnant, gbc_lblCarLeGagnant);
		
		lblMaisSiAucun = new JLabel(" mais si aucun ne trouve :");
		GridBagConstraints gbc_lblMaisSiAucun = new GridBagConstraints();
		gbc_lblMaisSiAucun.anchor = GridBagConstraints.WEST;
		gbc_lblMaisSiAucun.gridwidth = 8;
		gbc_lblMaisSiAucun.insets = new Insets(0, 0, 5, 5);
		gbc_lblMaisSiAucun.gridx = 2;
		gbc_lblMaisSiAucun.gridy = 15;
		contentPane.add(lblMaisSiAucun, gbc_lblMaisSiAucun);
		
		lblCestCeluiQui = new JLabel("c’est celui qui a finit toutes ces tentatives en premier qui gagne.");
		GridBagConstraints gbc_lblCestCeluiQui = new GridBagConstraints();
		gbc_lblCestCeluiQui.gridwidth = 7;
		gbc_lblCestCeluiQui.insets = new Insets(0, 0, 5, 5);
		gbc_lblCestCeluiQui.gridx = 3;
		gbc_lblCestCeluiQui.gridy = 16;
		contentPane.add(lblCestCeluiQui, gbc_lblCestCeluiQui);
		
		label_5 = new JLabel("3 modes");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.gridwidth = 2;
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 2;
		gbc_label_5.gridy = 17;
		contentPane.add(label_5, gbc_label_5);
		
		label_6 = new JLabel("--> Easy = 12 tentatives");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.gridwidth = 4;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 3;
		gbc_label_6.gridy = 18;
		contentPane.add(label_6, gbc_label_6);
		
		label_7 = new JLabel("--> Normal = 9 tentative");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.WEST;
		gbc_label_7.gridwidth = 4;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 3;
		gbc_label_7.gridy = 19;
		contentPane.add(label_7, gbc_label_7);
		
		label_8 = new JLabel("--> Hard = 5 tentatives");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.gridwidth = 4;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 3;
		gbc_label_8.gridy = 20;
		contentPane.add(label_8, gbc_label_8);
		
		lblChaqueJoueurPourra = new JLabel("Chaque joueur pourra visualiser le jeu de l’autre en direct ");
		GridBagConstraints gbc_lblChaqueJoueurPourra = new GridBagConstraints();
		gbc_lblChaqueJoueurPourra.anchor = GridBagConstraints.WEST;
		gbc_lblChaqueJoueurPourra.gridwidth = 6;
		gbc_lblChaqueJoueurPourra.insets = new Insets(0, 0, 5, 5);
		gbc_lblChaqueJoueurPourra.gridx = 1;
		gbc_lblChaqueJoueurPourra.gridy = 21;
		contentPane.add(lblChaqueJoueurPourra, gbc_lblChaqueJoueurPourra);
		
		label = new JLabel("BOHYN ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 23;
		contentPane.add(label, gbc_label);
		
		lblGauthier = new JLabel("Gauthier");
		GridBagConstraints gbc_lblGauthier = new GridBagConstraints();
		gbc_lblGauthier.anchor = GridBagConstraints.WEST;
		gbc_lblGauthier.insets = new Insets(0, 0, 5, 5);
		gbc_lblGauthier.gridx = 1;
		gbc_lblGauthier.gridy = 23;
		contentPane.add(lblGauthier, gbc_lblGauthier);
		
		lblHermant = new JLabel("HERMANT");
		GridBagConstraints gbc_lblHermant = new GridBagConstraints();
		gbc_lblHermant.anchor = GridBagConstraints.WEST;
		gbc_lblHermant.insets = new Insets(0, 0, 5, 5);
		gbc_lblHermant.gridx = 0;
		gbc_lblHermant.gridy = 24;
		contentPane.add(lblHermant, gbc_lblHermant);
		
		lblThibaut = new JLabel("Thibaut");
		GridBagConstraints gbc_lblThibaut = new GridBagConstraints();
		gbc_lblThibaut.anchor = GridBagConstraints.WEST;
		gbc_lblThibaut.insets = new Insets(0, 0, 5, 5);
		gbc_lblThibaut.gridx = 1;
		gbc_lblThibaut.gridy = 24;
		contentPane.add(lblThibaut, gbc_lblThibaut);
		
		lblMeryers = new JLabel("MEYERS");
		GridBagConstraints gbc_lblMeryers = new GridBagConstraints();
		gbc_lblMeryers.anchor = GridBagConstraints.WEST;
		gbc_lblMeryers.insets = new Insets(0, 0, 5, 5);
		gbc_lblMeryers.gridx = 0;
		gbc_lblMeryers.gridy = 25;
		contentPane.add(lblMeryers, gbc_lblMeryers);
		
		lblHumbert = new JLabel("Humbert");
		GridBagConstraints gbc_lblHumbert = new GridBagConstraints();
		gbc_lblHumbert.anchor = GridBagConstraints.WEST;
		gbc_lblHumbert.insets = new Insets(0, 0, 5, 5);
		gbc_lblHumbert.gridx = 1;
		gbc_lblHumbert.gridy = 25;
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
