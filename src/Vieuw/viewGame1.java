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
import java.awt.Color;

public class viewGame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewGame1 frame = new viewGame1();
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
	public viewGame1() {
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
		contentPane.setForeground(Color.RED);
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
				gbl_contentPane.columnWidths = new int[]{35, 80, 80, 80, 80, 35, 80, 80, 80, 35};
				gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				contentPane.setLayout(gbl_contentPane);
		//----------------------------------------------------
		
		//Titre aux colonnes 
			JLabel lblYourGame = new JLabel("Your game");
			GridBagConstraints gbc_lblYourGame = new GridBagConstraints();
			gbc_lblYourGame.insets = new Insets(0, 0, 5, 5);
			gbc_lblYourGame.gridx = 1;
			gbc_lblYourGame.gridy = 1;
			contentPane.add(lblYourGame, gbc_lblYourGame);
			
			JLabel lblResult = new JLabel("Result");
			GridBagConstraints gbc_lblResult = new GridBagConstraints();
			gbc_lblResult.insets = new Insets(0, 0, 5, 5);
			gbc_lblResult.gridx = 4;
			gbc_lblResult.gridy = 1;
			contentPane.add(lblResult, gbc_lblResult);
			
			JLabel lblCompetitorsGame = new JLabel("Competitor's game");
			lblCompetitorsGame.setHorizontalAlignment(SwingConstants.LEFT);
			GridBagConstraints gbc_lblCompetitorsGame = new GridBagConstraints();
			gbc_lblCompetitorsGame.gridwidth = 3;
			gbc_lblCompetitorsGame.insets = new Insets(0, 0, 5, 5);
			gbc_lblCompetitorsGame.gridx = 6;
			gbc_lblCompetitorsGame.gridy = 1;
			contentPane.add(lblCompetitorsGame, gbc_lblCompetitorsGame);
		//----------------------------------------------------
			
		//ScrollPanel ou se trouvera les réponses ou résultats	
			JScrollPane scrollPane1 = new JScrollPane();
			GridBagConstraints gbc_scrollPane1 = new GridBagConstraints();
			gbc_scrollPane1.gridheight = 13;
			gbc_scrollPane1.gridwidth = 3;
			gbc_scrollPane1.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane1.fill = GridBagConstraints.BOTH;
			gbc_scrollPane1.gridx = 1;
			gbc_scrollPane1.gridy = 2;
			contentPane.add(scrollPane1, gbc_scrollPane1);
			
			JScrollPane scrollPaneResult = new JScrollPane();
			GridBagConstraints gbc_scrollPaneResult = new GridBagConstraints();
			gbc_scrollPaneResult.gridheight = 13;
			gbc_scrollPaneResult.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPaneResult.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneResult.gridx = 4;
			gbc_scrollPaneResult.gridy = 2;
			contentPane.add(scrollPaneResult, gbc_scrollPaneResult);
			
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 3;
			gbc_scrollPane.gridheight = 13;
			gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 6;
			gbc_scrollPane.gridy = 2;
			contentPane.add(scrollPane, gbc_scrollPane);
		//----------------------------------------------------
		
		//Les boutons pour encoder les numéros
			JButton btnChiffre1 = new JButton("1");
			GridBagConstraints gbc_btnChiffre1 = new GridBagConstraints();
			gbc_btnChiffre1.insets = new Insets(0, 0, 5, 5);
			gbc_btnChiffre1.gridx = 1;
			gbc_btnChiffre1.gridy = 16;
			contentPane.add(btnChiffre1, gbc_btnChiffre1);
			
			JButton btnChiffre2 = new JButton("2");
			GridBagConstraints gbc_btnChiffre2 = new GridBagConstraints();
			gbc_btnChiffre2.insets = new Insets(0, 0, 5, 5);
			gbc_btnChiffre2.gridx = 2;
			gbc_btnChiffre2.gridy = 16;
			contentPane.add(btnChiffre2, gbc_btnChiffre2);
			
			JButton btnChiffre3 = new JButton("3");
			GridBagConstraints gbc_btnChiffre3 = new GridBagConstraints();
			gbc_btnChiffre3.insets = new Insets(0, 0, 5, 5);
			gbc_btnChiffre3.gridx = 3;
			gbc_btnChiffre3.gridy = 16;
			contentPane.add(btnChiffre3, gbc_btnChiffre3);
			
			JButton btnChiffre4 = new JButton("4");
			GridBagConstraints gbc_btnChiffre4 = new GridBagConstraints();
			gbc_btnChiffre4.insets = new Insets(0, 0, 5, 5);
			gbc_btnChiffre4.gridx = 1;
			gbc_btnChiffre4.gridy = 17;
			contentPane.add(btnChiffre4, gbc_btnChiffre4);
			
			JButton btnChiffre5 = new JButton("5");
			GridBagConstraints gbc_btnChiffre5 = new GridBagConstraints();
			gbc_btnChiffre5.insets = new Insets(0, 0, 5, 5);
			gbc_btnChiffre5.gridx = 2;
			gbc_btnChiffre5.gridy = 17;
			contentPane.add(btnChiffre5, gbc_btnChiffre5);
			
			JButton btnChiffre6 = new JButton("6");
			GridBagConstraints gbc_btnChiffre6 = new GridBagConstraints();
			gbc_btnChiffre6.insets = new Insets(0, 0, 5, 5);
			gbc_btnChiffre6.gridx = 3;
			gbc_btnChiffre6.gridy = 17;
			contentPane.add(btnChiffre6, gbc_btnChiffre6);
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
