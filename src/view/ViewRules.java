package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ModelGame;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;


public class ViewRules extends JFrame implements ActionListener {

	
	ModelGame GameController = new ModelGame();
	/**
	 * Variable
	 */
	private JPanel contentPane;
	private JLabel title,lblBohyn,lblGauthier,lblHermant,lblThibaut,lblMeryers,lblHumbert;
	private JLabel solo,solo1,solo2,solo3,solo4,solo5,solo6,solo7;
	private JLabel soloPc,soloPc1,soloPc2,soloPc3,soloPc4,soloPc5,soloPc6,soloPc7;
	private JLabel multi,multi1,multi2,multi3,multi4,multi5,multi6,multi7,multi8;
	private JButton btnReturn;
	private JButton btnExit;
	
	/**
	 * Launch the application.
	 * @param args les paramètres du jeu.
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
		gbl_contentPane.rowHeights = new int[]{ 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0,  0, 0, 20, 0,0,0,0};
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
		
		title = new JLabel("Number Mastermind");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 11;
		gbc_title.insets = new Insets(0, 0, 5, 0);
		gbc_title.gridx = 1;
		gbc_title.gridy = 2;
		contentPane.add(title, gbc_title);
		
		solo = new JLabel("Solo");
		GridBagConstraints gbc_solo = new GridBagConstraints();
		gbc_solo.anchor = GridBagConstraints.WEST;
		gbc_solo.insets = new Insets(0, 0, 5, 5);
		gbc_solo.gridx = 1;
		gbc_solo.gridy = 3;
		contentPane.add(solo, gbc_solo);
		
		solo1 = new JLabel("- L’application génère aléatoirement la combinaison de 4 couleurs");
		GridBagConstraints gbc_solo1 = new GridBagConstraints();
		gbc_solo1.anchor = GridBagConstraints.WEST;
		gbc_solo1.gridwidth = 8;
		gbc_solo1.insets = new Insets(0, 0, 5, 5);
		gbc_solo1.gridx = 1;
		gbc_solo1.gridy = 4;
		contentPane.add(solo1, gbc_solo1);
		
		solo2 = new JLabel("- L’ordinateur corrige lui-même le joueur grâce aux résultats qu’il renvoie, il répond par:");
		GridBagConstraints gbc_solo2 = new GridBagConstraints();
		gbc_solo2.anchor = GridBagConstraints.WEST;
		gbc_solo2.gridwidth = 10;
		gbc_solo2.insets = new Insets(0, 0, 5, 5);
		gbc_solo2.gridx = 1;
		gbc_solo2.gridy = 5;
		contentPane.add(solo2, gbc_solo2);
		
		solo3 = new JLabel("  \tV (Chiffre bonne place), / (Chiffre existant mais pas à la bonne place), X(Chiffre n’existant pas) . \n");
		GridBagConstraints gbc_solo3 = new GridBagConstraints();
		gbc_solo3.gridwidth = 10;
		gbc_solo3.anchor = GridBagConstraints.WEST;
		gbc_solo3.insets = new Insets(0, 0, 5, 5);
		gbc_solo3.gridx = 1;
		gbc_solo3.gridy = 6;
		contentPane.add(solo3, gbc_solo3);
		
		solo4 = new JLabel("3 modes");
		GridBagConstraints gbc_solo4 = new GridBagConstraints();
		gbc_solo4.anchor = GridBagConstraints.EAST;
		gbc_solo4.insets = new Insets(0, 0, 5, 5);
		gbc_solo4.gridx = 1;
		gbc_solo4.gridy = 7;
		contentPane.add(solo4, gbc_solo4);
		
		solo5 = new JLabel("- Easy = 12 tentatives");
		GridBagConstraints gbc_solo5 = new GridBagConstraints();
		gbc_solo5.anchor = GridBagConstraints.WEST;
		gbc_solo5.gridwidth = 4;
		gbc_solo5.insets = new Insets(0, 0, 5, 5);
		gbc_solo5.gridx = 2;
		gbc_solo5.gridy = 8;
		contentPane.add(solo5, gbc_solo5);
		
		solo6 = new JLabel("- Normal = 9 tentative");
		GridBagConstraints gbc_solo6 = new GridBagConstraints();
		gbc_solo6.anchor = GridBagConstraints.WEST;
		gbc_solo6.gridwidth = 4;
		gbc_solo6.insets = new Insets(0, 0, 5, 5);
		gbc_solo6.gridx = 2;
		gbc_solo6.gridy = 9;
		contentPane.add(solo6, gbc_solo6);
		
		solo7 = new JLabel("- Hard = 5 tentatives");
		GridBagConstraints gbc_solo7 = new GridBagConstraints();
		gbc_solo7.anchor = GridBagConstraints.WEST;
		gbc_solo7.gridwidth = 4;
		gbc_solo7.insets = new Insets(0, 0, 5, 5);
		gbc_solo7.gridx = 2;
		gbc_solo7.gridy = 10;
		contentPane.add(solo7, gbc_solo7);
		
		soloPc = new JLabel("Solo with Pc");
		GridBagConstraints gbc_soloPc = new GridBagConstraints();
		gbc_soloPc.anchor = GridBagConstraints.WEST;
		gbc_soloPc.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc.gridx = 1;
		gbc_soloPc.gridy = 12;
		contentPane.add(soloPc, gbc_soloPc);
		
		soloPc1 = new JLabel("-\tL’application génère aléatoirement la combinaison de 4 chiffres.\n");
		GridBagConstraints gbc_soloPc1 = new GridBagConstraints();
		gbc_soloPc1.anchor = GridBagConstraints.WEST;
		gbc_soloPc1.gridwidth = 10;
		gbc_soloPc1.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc1.gridx = 1;
		gbc_soloPc1.gridy = 13;
		contentPane.add(soloPc1, gbc_soloPc1);
		
		soloPc2 = new JLabel("- L’ordinateur corrige lui-même le joueur et la combinaison imaginée par l’ordinateur grâce ");
		GridBagConstraints gbc_soloPc2 = new GridBagConstraints();
		gbc_soloPc2.anchor = GridBagConstraints.WEST;
		gbc_soloPc2.gridwidth = 10;
		gbc_soloPc2.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc2.gridx = 1;
		gbc_soloPc2.gridy = 14;
		contentPane.add(soloPc2, gbc_soloPc2);
		
		soloPc3 = new JLabel("   aux résultats qu’il renvoie, il répond par V (Chiffre bonne place), / (Chiffre existant mais pas à ");
		GridBagConstraints gbc_soloPc3 = new GridBagConstraints();
		gbc_soloPc3.anchor = GridBagConstraints.WEST;
		gbc_soloPc3.gridwidth = 10;
		gbc_soloPc3.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc3.gridx = 1;
		gbc_soloPc3.gridy = 15;
		contentPane.add(soloPc3, gbc_soloPc3);
		
		soloPc4 = new JLabel("   la bonne place), X(Chiffre n’existant pas) . ");
		GridBagConstraints gbc_soloPc4 = new GridBagConstraints();
		gbc_soloPc4.anchor = GridBagConstraints.WEST;
		gbc_soloPc4.gridwidth = 10;
		gbc_soloPc4.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc4.gridx = 1;
		gbc_soloPc4.gridy = 16;
		contentPane.add(soloPc4, gbc_soloPc4);
		
		soloPc5 = new JLabel("- Attention, vous voyez les résultats de l’ordinateur, cela veut dire que l’ordinateur peut aussi ");
		GridBagConstraints gbc_soloPc5 = new GridBagConstraints();
		gbc_soloPc5.anchor = GridBagConstraints.WEST;
		gbc_soloPc5.gridwidth = 10;
		gbc_soloPc5.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc5.gridx = 1;
		gbc_soloPc5.gridy = 17;
		contentPane.add(soloPc5, gbc_soloPc5);
		
		soloPc6 = new JLabel("   voir vos résultats !");
		GridBagConstraints gbc_soloPc6 = new GridBagConstraints();
		gbc_soloPc6.anchor = GridBagConstraints.WEST;
		gbc_soloPc6.gridwidth = 10;
		gbc_soloPc6.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc6.gridx = 1;
		gbc_soloPc6.gridy = 18;
		contentPane.add(soloPc6, gbc_soloPc6);
		
		soloPc7 = new JLabel("-\tVous avez 12 chances maximum.\n");
		GridBagConstraints gbc_soloPc7 = new GridBagConstraints();
		gbc_soloPc7.anchor = GridBagConstraints.WEST;
		gbc_soloPc7.gridwidth = 10;
		gbc_soloPc7.insets = new Insets(0, 0, 5, 5);
		gbc_soloPc7.gridx = 1;
		gbc_soloPc7.gridy = 19;
		contentPane.add(soloPc7, gbc_soloPc7);
		
		multi = new JLabel("Multi");
		GridBagConstraints gbc_multi = new GridBagConstraints();
		gbc_multi.anchor = GridBagConstraints.WEST;
		gbc_multi.insets = new Insets(0, 0, 5, 5);
		gbc_multi.gridx = 1;
		gbc_multi.gridy = 21;
		contentPane.add(multi, gbc_multi);
		
		multi1 = new JLabel("-\tLes 2 joueurs sont connectés en réseau sur 2 appareils différents mais sur le même réseau.\n");
		GridBagConstraints gbc_multi1 = new GridBagConstraints();
		gbc_multi1.anchor = GridBagConstraints.WEST;
		gbc_multi1.gridwidth = 8;
		gbc_multi1.insets = new Insets(0, 0, 5, 5);
		gbc_multi1.gridx = 1;
		gbc_multi1.gridy = 22;
		contentPane.add(multi1, gbc_multi1);
		
		multi2 = new JLabel("- L’application génère aléatoirement la combinaison de 4 chiffres (elle est la même pour les 2 ");
		GridBagConstraints gbc_multi2 = new GridBagConstraints();
		gbc_multi2.anchor = GridBagConstraints.WEST;
		gbc_multi2.gridwidth = 7;
		gbc_multi2.insets = new Insets(0, 0, 5, 5);
		gbc_multi2.gridx = 1;
		gbc_multi2.gridy = 23;
		contentPane.add(multi2, gbc_multi2);
		
		multi3 = new JLabel("   joueurs !!) ");
		GridBagConstraints gbc_multi3 = new GridBagConstraints();
		gbc_multi3.anchor = GridBagConstraints.WEST;
		gbc_multi3.insets = new Insets(0, 0, 5, 5);
		gbc_multi3.gridx = 1;
		gbc_multi3.gridy = 24;
		contentPane.add(multi3, gbc_multi3);
		
		multi4 = new JLabel("- Chaque joueur doit trouver la combinaison le plus rapidement possible car le gagnant est le ");
		GridBagConstraints gbc_multi4 = new GridBagConstraints();
		gbc_multi4.anchor = GridBagConstraints.WEST;
		gbc_multi4.gridwidth = 8;
		gbc_multi4.insets = new Insets(0, 0, 5, 5);
		gbc_multi4.gridx = 1;
		gbc_multi4.gridy = 25;
		contentPane.add(multi4, gbc_multi4);
		
		multi5 = new JLabel("   premier à l’avoir trouvé !");
		GridBagConstraints gbc_multi5 = new GridBagConstraints();
		gbc_multi5.anchor = GridBagConstraints.WEST;
		gbc_multi5.gridwidth = 7;
		gbc_multi5.insets = new Insets(0, 0, 5, 5);
		gbc_multi5.gridx = 1;
		gbc_multi5.gridy = 26;
		contentPane.add(multi5, gbc_multi5);
		
		multi6 = new JLabel("- Le nombre de tentatives est fixé à 12. Chaque joueur pourra visualiser le jeu de l’autre en ");
		GridBagConstraints gbc_multi6 = new GridBagConstraints();
		gbc_multi6.anchor = GridBagConstraints.WEST;
		gbc_multi6.gridwidth = 8;
		gbc_multi6.insets = new Insets(0, 0, 5, 5);
		gbc_multi6.gridx = 1;
		gbc_multi6.gridy = 27;
		contentPane.add(multi6, gbc_multi6);
		
		multi7 = new JLabel("   direct (donc une possibilité de tricherie … ).");
		GridBagConstraints gbc_multi7 = new GridBagConstraints();
		gbc_multi7.anchor = GridBagConstraints.WEST;
		gbc_multi7.gridwidth = 7;
		gbc_multi7.insets = new Insets(0, 0, 5, 5);
		gbc_multi7.gridx = 1;
		gbc_multi7.gridy = 28;
		contentPane.add(multi7, gbc_multi7);
		
		multi8 = new JLabel("-\tArrivé à la fin des 12 coups, la partie est finie pour ce joueur.\n");
		GridBagConstraints gbc_multi8 = new GridBagConstraints();
		gbc_multi8.anchor = GridBagConstraints.WEST;
		gbc_multi8.gridwidth = 6;
		gbc_multi8.insets = new Insets(0, 0, 5, 5);
		gbc_multi8.gridx = 1;
		gbc_multi8.gridy = 29;
		contentPane.add(multi8, gbc_multi8);
		
		lblBohyn = new JLabel("BOHYN ");
		GridBagConstraints gbc_lblBohyn = new GridBagConstraints();
		gbc_lblBohyn.anchor = GridBagConstraints.WEST;
		gbc_lblBohyn.insets = new Insets(0, 0, 5, 5);
		gbc_lblBohyn.gridx = 0;
		gbc_lblBohyn.gridy = 31;
		contentPane.add(lblBohyn, gbc_lblBohyn);
		
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
		
		
		btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 34;
		btnExit.addActionListener(this);
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
