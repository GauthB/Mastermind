package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ViewReglage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewReglage frame = new ViewReglage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewReglage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 589);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//----------------------------------------------------
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			//Boutton pour forcer à fermer la page	
				
				
				JPopupMenu popup = new JPopupMenu();
				addPopup(contentPane, popup);
				
				JLabel lblForcerQuitter = new JLabel("Forcer à quitter");
				popup.add(lblForcerQuitter);
				
				JButton btnExit = new JButton("EXIT");
				popup.add(btnExit);
				
				GridBagLayout gbl_contentPane = new GridBagLayout();
				gbl_contentPane.columnWidths = new int[]{12, 80, 80, 80, 80, 80, 80, 80, 80, 12};
				gbl_contentPane.rowHeights = new int[]{31, 0, 62, 31, 0, 0, 31, 31, 0, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31};
				gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				contentPane.setLayout(gbl_contentPane);
				
					
					JLabel lblCompetitorsGame = new JLabel("Number Mastermind");
					lblCompetitorsGame.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
					lblCompetitorsGame.setHorizontalAlignment(SwingConstants.LEFT);
					GridBagConstraints gbc_lblCompetitorsGame = new GridBagConstraints();
					gbc_lblCompetitorsGame.gridwidth = 6;
					gbc_lblCompetitorsGame.insets = new Insets(0, 0, 5, 5);
					gbc_lblCompetitorsGame.gridx = 2;
					gbc_lblCompetitorsGame.gridy = 2;
					//gbc_lblCompetitorsGame.setFont("Arial",Font.BOLD,12);
					contentPane.add(lblCompetitorsGame, gbc_lblCompetitorsGame);
					
					JLabel lblSolo = new JLabel("Solo");
					GridBagConstraints gbc_lblSolo = new GridBagConstraints();
					gbc_lblSolo.anchor = GridBagConstraints.WEST;
					gbc_lblSolo.insets = new Insets(0, 0, 5, 5);
					gbc_lblSolo.gridx = 1;
					gbc_lblSolo.gridy = 4;
					contentPane.add(lblSolo, gbc_lblSolo);
					
					JLabel lblLapplicationGnreAlatoirement = new JLabel("L’application génère aléatoirement la combinaison de 4 couleurs");
					GridBagConstraints gbc_lblLapplicationGnreAlatoirement = new GridBagConstraints();
					gbc_lblLapplicationGnreAlatoirement.anchor = GridBagConstraints.WEST;
					gbc_lblLapplicationGnreAlatoirement.gridwidth = 8;
					gbc_lblLapplicationGnreAlatoirement.insets = new Insets(0, 0, 5, 5);
					gbc_lblLapplicationGnreAlatoirement.gridx = 1;
					gbc_lblLapplicationGnreAlatoirement.gridy = 5;
					contentPane.add(lblLapplicationGnreAlatoirement, gbc_lblLapplicationGnreAlatoirement);
					
					JLabel label = new JLabel("L’application génère aléatoirement la combinaison de 4 couleurs");
					GridBagConstraints gbc_label = new GridBagConstraints();
					gbc_label.anchor = GridBagConstraints.WEST;
					gbc_label.gridwidth = 8;
					gbc_label.insets = new Insets(0, 0, 5, 5);
					gbc_label.gridx = 1;
					gbc_label.gridy = 8;
					contentPane.add(label, gbc_label);
					
					JLabel label_1 = new JLabel("L’application génère aléatoirement la combinaison de 4 couleurs");
					GridBagConstraints gbc_label_1 = new GridBagConstraints();
					gbc_label_1.anchor = GridBagConstraints.WEST;
					gbc_label_1.gridwidth = 8;
					gbc_label_1.insets = new Insets(0, 0, 5, 5);
					gbc_label_1.gridx = 1;
					gbc_label_1.gridy = 9;
					contentPane.add(label_1, gbc_label_1);
					
					JLabel lblMulti = new JLabel("Multi");
					GridBagConstraints gbc_lblMulti = new GridBagConstraints();
					gbc_lblMulti.anchor = GridBagConstraints.WEST;
					gbc_lblMulti.insets = new Insets(0, 0, 5, 5);
					gbc_lblMulti.gridx = 1;
					gbc_lblMulti.gridy = 12;
					contentPane.add(lblMulti, gbc_lblMulti);
					
					JLabel lblLesJoueurs = new JLabel("Les 2 joueurs sont connectés en réseau sur 2 appareils différents ");
					GridBagConstraints gbc_lblLesJoueurs = new GridBagConstraints();
					gbc_lblLesJoueurs.anchor = GridBagConstraints.WEST;
					gbc_lblLesJoueurs.gridwidth = 8;
					gbc_lblLesJoueurs.insets = new Insets(0, 0, 5, 5);
					gbc_lblLesJoueurs.gridx = 1;
					gbc_lblLesJoueurs.gridy = 13;
					contentPane.add(lblLesJoueurs, gbc_lblLesJoueurs);
					
					JLabel lblLapplicationGnreAlatoirement_1 = new JLabel("L’application génère aléatoirement la combinaison de 4 couleurs (elle est la même pour les 2 joueurs) ");
					GridBagConstraints gbc_lblLapplicationGnreAlatoirement_1 = new GridBagConstraints();
					gbc_lblLapplicationGnreAlatoirement_1.gridwidth = 8;
					gbc_lblLapplicationGnreAlatoirement_1.insets = new Insets(0, 0, 5, 5);
					gbc_lblLapplicationGnreAlatoirement_1.gridx = 1;
					gbc_lblLapplicationGnreAlatoirement_1.gridy = 14;
					contentPane.add(lblLapplicationGnreAlatoirement_1, gbc_lblLapplicationGnreAlatoirement_1);
					
					JLabel lblChaqueJoueurDoit = new JLabel("Chaque joueur doit trouver la combinaison le plus rapidement possible car le gagnant est le premier à l’avoir trouvé mais si aucun ne trouve c’est celui qui a finit toutes ces tentatives en premier qui gagne.");
					GridBagConstraints gbc_lblChaqueJoueurDoit = new GridBagConstraints();
					gbc_lblChaqueJoueurDoit.gridwidth = 8;
					gbc_lblChaqueJoueurDoit.insets = new Insets(0, 0, 5, 5);
					gbc_lblChaqueJoueurDoit.gridx = 1;
					gbc_lblChaqueJoueurDoit.gridy = 15;
					contentPane.add(lblChaqueJoueurDoit, gbc_lblChaqueJoueurDoit);
					
					JLabel lblLeNombreDe = new JLabel("Le nombre de tentatives est fixé à 12. Chaque joueur pourra visualiser le jeu de l’autre en direct (donc une possibilité de tricherie 😊)");
					GridBagConstraints gbc_lblLeNombreDe = new GridBagConstraints();
					gbc_lblLeNombreDe.gridwidth = 8;
					gbc_lblLeNombreDe.insets = new Insets(0, 0, 5, 5);
					gbc_lblLeNombreDe.gridx = 1;
					gbc_lblLeNombreDe.gridy = 16;
					contentPane.add(lblLeNombreDe, gbc_lblLeNombreDe);
					
					JLabel lblBohyn = new JLabel("BOHYN ");
					GridBagConstraints gbc_lblBohyn = new GridBagConstraints();
					gbc_lblBohyn.anchor = GridBagConstraints.WEST;
					gbc_lblBohyn.insets = new Insets(0, 0, 5, 5);
					gbc_lblBohyn.gridx = 1;
					gbc_lblBohyn.gridy = 19;
					contentPane.add(lblBohyn, gbc_lblBohyn);
						
						JLabel lblGauthier = new JLabel("Gauthier");
						GridBagConstraints gbc_lblGauthier = new GridBagConstraints();
						gbc_lblGauthier.anchor = GridBagConstraints.WEST;
						gbc_lblGauthier.insets = new Insets(0, 0, 5, 5);
						gbc_lblGauthier.gridx = 2;
						gbc_lblGauthier.gridy = 19;
						contentPane.add(lblGauthier, gbc_lblGauthier);
					//----------------------------------------------------
					
					//Titre aux colonnes 
						JLabel lblYourGame = new JLabel("HERMANT");
						GridBagConstraints gbc_lblYourGame = new GridBagConstraints();
						gbc_lblYourGame.anchor = GridBagConstraints.WEST;
						gbc_lblYourGame.insets = new Insets(0, 0, 5, 5);
						gbc_lblYourGame.gridx = 1;
						gbc_lblYourGame.gridy = 20;
						contentPane.add(lblYourGame, gbc_lblYourGame);
					
					JLabel lblThibaut = new JLabel("Thibaut");
					GridBagConstraints gbc_lblThibaut = new GridBagConstraints();
					gbc_lblThibaut.anchor = GridBagConstraints.WEST;
					gbc_lblThibaut.insets = new Insets(0, 0, 5, 5);
					gbc_lblThibaut.gridx = 2;
					gbc_lblThibaut.gridy = 20;
					contentPane.add(lblThibaut, gbc_lblThibaut);
					
					JLabel lblMeyers = new JLabel("MEYERS");
					GridBagConstraints gbc_lblMeyers = new GridBagConstraints();
					gbc_lblMeyers.anchor = GridBagConstraints.WEST;
					gbc_lblMeyers.insets = new Insets(0, 0, 0, 5);
					gbc_lblMeyers.gridx = 1;
					gbc_lblMeyers.gridy = 21;
					contentPane.add(lblMeyers, gbc_lblMeyers);
					
					JLabel lblHumbert = new JLabel("Humbert");
					GridBagConstraints gbc_lblHumbert = new GridBagConstraints();
					gbc_lblHumbert.anchor = GridBagConstraints.WEST;
					gbc_lblHumbert.insets = new Insets(0, 0, 0, 5);
					gbc_lblHumbert.gridx = 2;
					gbc_lblHumbert.gridy = 21;
					contentPane.add(lblHumbert, gbc_lblHumbert);
			
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case"EXIT":
			this.dispose();
		}
	}


}
