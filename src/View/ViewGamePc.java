package View;
import mastermind.GameController;
import mastermind.GameControllerGUI;
import mastermind.RandomCombi;
import mastermind.Correction;

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
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Panel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.ScrollPane;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JInternalFrame;

public class ViewGamePc extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField2;
	private String temp="";
	private String temp2 ="";
	private String temp3="";
	private String temp4 ="";
	


	private JLabel label_1;
	private JLabel label;
	private JLabel lblComputersGame;
	private JLabel label_3;
	private JTextPane combiInTout;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGamePc frame = new ViewGamePc();
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
	public ViewGamePc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{70, 70, 70, 20, 70, 70, 70, 70, 20,70,70};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		btnMenu = new JButton("Menu");
		GridBagConstraints gbc_btnMenu = new GridBagConstraints();
		gbc_btnMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btnMenu.gridx = 0;
		gbc_btnMenu.gridy = 0;
		contentPane.add(btnMenu, gbc_btnMenu);
		btnMenu.addActionListener(this);
		
		label_3 = new JLabel("Number Mastermind");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 11;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		lblGameMultiWith = new JLabel("Game Multiplayer with Computer");
		lblGameMultiWith.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		GridBagConstraints gbc_lblGameMultiWith = new GridBagConstraints();
		gbc_lblGameMultiWith.gridwidth = 11;
		gbc_lblGameMultiWith.insets = new Insets(0, 0, 5, 0);
		gbc_lblGameMultiWith.gridx = 0;
		gbc_lblGameMultiWith.gridy = 2;
		contentPane.add(lblGameMultiWith, gbc_lblGameMultiWith);
		
		label_1 = new JLabel("Your game");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.gridwidth = 2;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		contentPane.add(label_1, gbc_label_1);
		
		label = new JLabel("Result");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 3;
		contentPane.add(label, gbc_label);
		
		lblComputersGame = new JLabel("Computer's game");
		lblComputersGame.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblComputersGame = new GridBagConstraints();
		gbc_lblComputersGame.anchor = GridBagConstraints.WEST;
		gbc_lblComputersGame.gridwidth = 3;
		gbc_lblComputersGame.insets = new Insets(0, 0, 5, 5);
		gbc_lblComputersGame.gridx = 6;
		gbc_lblComputersGame.gridy = 3;
		contentPane.add(lblComputersGame, gbc_lblComputersGame);
		
		label_4 = new JLabel("Result");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 9;
		gbc_label_4.gridy = 3;
		contentPane.add(label_4, gbc_label_4);
		
		combiInTout = new JTextPane();
		combiInTout.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_combiInTout = new GridBagConstraints();
		gbc_combiInTout.gridwidth = 2;
		gbc_combiInTout.gridheight = 11;
		gbc_combiInTout.insets = new Insets(0, 0, 5, 5);
		gbc_combiInTout.fill = GridBagConstraints.BOTH;
		gbc_combiInTout.gridx = 1;
		gbc_combiInTout.gridy = 4;
		contentPane.add(combiInTout, gbc_combiInTout);
		combiInTout.setEditable(false);
		
		combiResult = new JTextPane();
		combiResult.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_combiResult = new GridBagConstraints();
		gbc_combiResult.gridheight = 11;
		gbc_combiResult.insets = new Insets(0, 0, 5, 5);
		gbc_combiResult.fill = GridBagConstraints.BOTH;
		gbc_combiResult.gridx = 4;
		gbc_combiResult.gridy = 4;
		contentPane.add(combiResult, gbc_combiResult);
		combiResult.setEditable(false);
		
		combiCompetitor = new JTextPane();
		combiCompetitor.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_combiCompetitor = new GridBagConstraints();
		gbc_combiCompetitor.gridheight = 11;
		gbc_combiCompetitor.gridwidth = 2;
		gbc_combiCompetitor.insets = new Insets(0, 0, 5, 5);
		gbc_combiCompetitor.fill = GridBagConstraints.BOTH;
		gbc_combiCompetitor.gridx = 6;
		gbc_combiCompetitor.gridy = 4;
		contentPane.add(combiCompetitor, gbc_combiCompetitor);
		combiCompetitor.setEditable(false);
		
		combiResultCompetitor = new JTextPane();
		combiResultCompetitor.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_combiResultCompetitor = new GridBagConstraints();
		gbc_combiResultCompetitor.gridheight = 11;
		gbc_combiResultCompetitor.insets = new Insets(0, 0, 5, 5);
		gbc_combiResultCompetitor.fill = GridBagConstraints.BOTH;
		gbc_combiResultCompetitor.gridx = 9;
		gbc_combiResultCompetitor.gridy = 4;
		contentPane.add(combiResultCompetitor, gbc_combiResultCompetitor);
		combiResultCompetitor.setEditable(false);
		
		
		btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 0;
		gbc_btnEnter.gridy = 15;
		contentPane.add(btnEnter, gbc_btnEnter);
		btnEnter.addActionListener(this);
		
		textField2 = new JTextField();
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.gridwidth = 2;
		gbc_textField2.insets = new Insets(0, 0, 5, 5);
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridx = 1;
		gbc_textField2.gridy = 15;
		contentPane.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		
		lbWin = new JLabel("You have 12 chances");
		lbWin.setHorizontalAlignment(SwingConstants.LEFT);
		lbWin.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		GridBagConstraints gbc_lbWin = new GridBagConstraints();
		gbc_lbWin.gridwidth = 6;
		gbc_lbWin.insets = new Insets(0, 0, 5, 5);
		gbc_lbWin.gridx = 4;
		gbc_lbWin.gridy = 15;
		contentPane.add(lbWin, gbc_lbWin);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 16;
		btnExit.addActionListener(this);
		contentPane.add(btnExit, gbc_btnExit);
		
		JButton btnReplay = new JButton("Replay");
		GridBagConstraints gbc_btnReplay = new GridBagConstraints();
		gbc_btnReplay.gridwidth = 6;
		gbc_btnReplay.insets = new Insets(0, 0, 0, 5);
		gbc_btnReplay.gridx = 4;
		gbc_btnReplay.gridy = 16;
		contentPane.add(btnReplay, gbc_btnReplay);
		btnReplay.addActionListener(this);
		
	}
	
	
	GameControllerGUI gameControllerGui = new GameControllerGUI();
	private JTextPane combiResult;
	private JTextPane combiCompetitor;
	private JTextPane combiResultCompetitor;
	private JLabel label_4;
	private JLabel lblGameMultiWith;
	private JLabel lbWin;
	private JButton btnMenu;
	private JButton btnEnter;
	private String combiInJframe="////";
	private int numeroEssai = 0;
	private char positionCorrect[] = {'f','f','f','f'};
	private char numeroCorrect[] = new char[4] ;
	private int nbrChances = 12;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		switch(e.getActionCommand()){
		case"Enter":
			
			// --- Variables Pour la generation et la correction du Pc ---
			String combiPc = "";
			String combiPcCorrect2 = "";
			char[][] resultCombiPcCorrige =new char[3][4];
			char[] combiPcCorrect = new char[4];
			
			
			numeroEssai++;
			combiInJframe=textField2.getText();//recupere le texte entre
			
			temp2 = temp2 + gameControllerGui.corrige(combiInJframe)+"\n";
			temp = temp+combiInJframe+"\n";
			
			
			// --- Generation de la combi du pc ---
			combiPc = gameControllerGui.newCombiPc(positionCorrect,numeroCorrect);
						
			resultCombiPcCorrige = gameControllerGui.corrigePc(positionCorrect,numeroCorrect,combiPc,combiInJframe);
						
			positionCorrect = resultCombiPcCorrige[0];
			numeroCorrect = resultCombiPcCorrige[1];
			combiPcCorrect = resultCombiPcCorrige[2];
					
						
			for(int i=0;i < 4;i++) {
				combiPcCorrect2 += combiPcCorrect[i];
			}
						
			temp3 = temp3+combiPc+"\n";
			temp4 = temp4 +combiPcCorrect2+"\n";
			
			
			combiInTout.setText(temp);
			combiResult.setText(temp2);
			combiCompetitor.setText(temp3);
			combiResultCompetitor.setText(temp4);
			
			textField2.setText("");
			
			if((gameControllerGui.ifCorrect(combiInJframe) == true) && (gameControllerGui.ifCorrect(combiPc) == true)) {
				lbWin.setText("Equality !");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
			}
			
			else if (gameControllerGui.ifCorrect(combiInJframe) == true) {
				lbWin.setText("You win !");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
			}
			else if (gameControllerGui.ifCorrect(combiPc) == true) {
				lbWin.setText("the computer wins");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
			}
			
			else if(numeroEssai < 12) {
				nbrChances--;
				lbWin.setText("You have " + nbrChances + " chances");
			}
			else if((numeroEssai >= 12)){
				lbWin.setText("You lose !");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
			}
			
			
			break;
		case"Clear":
		
			textField2.setText("");
			break;
		case"Menu":
			ViewMain viewMain = new ViewMain();
			viewMain.setVisible(true);
			this.dispose();
			break;
		case"Exit":
			this.dispose();
		}
	}

}
