package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.ScrollPane;
import java.awt.Font;

public class mainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenu frame = new mainMenu();
					frame.setVisible(true);
					frame.setTitle("Number MasterMind");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Scroll Menu
			JMenu menu = new JMenu("Menu");
			menuBar.add(menu);
			
				JButton btnRelges = new JButton("Relges");
				menu.add(btnRelges);
				
				JButton btnSolo = new JButton("Solo");
				menu.add(btnSolo);
				
				JButton btnMulti = new JButton("Multi");
				menu.add(btnMulti);
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
				gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
					
					JLabel lblBohyn = new JLabel("BOHYN ");
					GridBagConstraints gbc_lblBohyn = new GridBagConstraints();
					gbc_lblBohyn.anchor = GridBagConstraints.WEST;
					gbc_lblBohyn.insets = new Insets(0, 0, 5, 5);
					gbc_lblBohyn.gridx = 1;
					gbc_lblBohyn.gridy = 15;
					contentPane.add(lblBohyn, gbc_lblBohyn);
					
					JLabel lblGauthier = new JLabel("Gauthier");
					GridBagConstraints gbc_lblGauthier = new GridBagConstraints();
					gbc_lblGauthier.anchor = GridBagConstraints.WEST;
					gbc_lblGauthier.insets = new Insets(0, 0, 5, 5);
					gbc_lblGauthier.gridx = 2;
					gbc_lblGauthier.gridy = 15;
					contentPane.add(lblGauthier, gbc_lblGauthier);
				//----------------------------------------------------
				
				//Titre aux colonnes 
					JLabel lblYourGame = new JLabel("HERMANT");
					GridBagConstraints gbc_lblYourGame = new GridBagConstraints();
					gbc_lblYourGame.anchor = GridBagConstraints.WEST;
					gbc_lblYourGame.insets = new Insets(0, 0, 5, 5);
					gbc_lblYourGame.gridx = 1;
					gbc_lblYourGame.gridy = 16;
					contentPane.add(lblYourGame, gbc_lblYourGame);
					
					JLabel lblThibaut = new JLabel("Thibaut");
					GridBagConstraints gbc_lblThibaut = new GridBagConstraints();
					gbc_lblThibaut.anchor = GridBagConstraints.WEST;
					gbc_lblThibaut.insets = new Insets(0, 0, 5, 5);
					gbc_lblThibaut.gridx = 2;
					gbc_lblThibaut.gridy = 16;
					contentPane.add(lblThibaut, gbc_lblThibaut);
					
					JLabel lblMeyers = new JLabel("MEYERS");
					GridBagConstraints gbc_lblMeyers = new GridBagConstraints();
					gbc_lblMeyers.anchor = GridBagConstraints.WEST;
					gbc_lblMeyers.insets = new Insets(0, 0, 5, 5);
					gbc_lblMeyers.gridx = 1;
					gbc_lblMeyers.gridy = 17;
					contentPane.add(lblMeyers, gbc_lblMeyers);
					
					JLabel lblHumbert = new JLabel("Humbert");
					GridBagConstraints gbc_lblHumbert = new GridBagConstraints();
					gbc_lblHumbert.anchor = GridBagConstraints.WEST;
					gbc_lblHumbert.insets = new Insets(0, 0, 5, 5);
					gbc_lblHumbert.gridx = 2;
					gbc_lblHumbert.gridy = 17;
					contentPane.add(lblHumbert, gbc_lblHumbert);
			
		//----------------------------------------------------
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
