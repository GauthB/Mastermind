package view;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

import model.ModelGameGUI;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Font;
import javax.swing.JTextPane;

public class ViewGamePc extends JFrame implements ActionListener {

	ModelGameGUI gameControllerGui = new ModelGameGUI();
	
	private JPanel contentPane;
	private JTextField textField2;
	private String temp="";
	private String temp2 ="";
	private String temp3="";
	private String temp4 ="";
	private String combiInJframe="////";
	private JLabel title,label_1,label_2,label_3,label_4;
	private JTextPane combiResultCompetitor,combiCompetitor,combiResult,combiInTout;
	private JLabel lbWin,lblMode,lbResult,lblResult;
	private JButton btnReplay,btnEnter,btnMenu;
	private int numeroEssai = 0;
	private int nbrChances = 12;
	private char positionCorrect[] = {'f','f','f','f'};
	private char numeroCorrect[] = new char[4] ;
	private JRootPane rootPane;
	
	


	
	/**
	 * Launch the application.
	 * @param args les paramètres du jeu.
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
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		btnMenu = new JButton("Menu");
		GridBagConstraints gbc_btnMenu = new GridBagConstraints();
		gbc_btnMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btnMenu.gridx = 0;
		gbc_btnMenu.gridy = 0;
		contentPane.add(btnMenu, gbc_btnMenu);
		btnMenu.addActionListener(this);
		
		title = new JLabel("Number Mastermind");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 11;
		gbc_title.insets = new Insets(0, 0, 5, 0);
		gbc_title.gridx = 0;
		gbc_title.gridy = 1;
		contentPane.add(title, gbc_title);
		
		lblMode = new JLabel("Game Multiplayer with Computer");
		lblMode.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		GridBagConstraints gbc_lblMode = new GridBagConstraints();
		gbc_lblMode.gridwidth = 11;
		gbc_lblMode.insets = new Insets(0, 0, 5, 0);
		gbc_lblMode.gridx = 0;
		gbc_lblMode.gridy = 2;
		contentPane.add(lblMode, gbc_lblMode);
		
		label_1 = new JLabel("Your game");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.gridwidth = 2;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		contentPane.add(label_1, gbc_label_1);
		
		label_2 = new JLabel("Result");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 3;
		contentPane.add(label_2, gbc_label_2);
		
		label_3 = new JLabel("Computer's game");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.gridwidth = 3;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 6;
		gbc_label_3.gridy = 3;
		contentPane.add(label_3, gbc_label_3);
		
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
		
		rootPane = SwingUtilities.getRootPane(btnEnter);
		rootPane.setDefaultButton(btnEnter);
		rootPane.setVisible(true);
		
		textField2 = new JTextField();
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.gridwidth = 2;
		gbc_textField2.insets = new Insets(0, 0, 5, 5);
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridx = 1;
		gbc_textField2.gridy = 15;
		contentPane.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		setVisible(true);
		textField2.requestFocus();
		
		lbWin = new JLabel("you have 12 chances");
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
		gbc_btnExit.gridy = 17;
		btnExit.addActionListener(this);
		
		lblResult = new JLabel("Result:");
		GridBagConstraints gbc_lblResult = new GridBagConstraints();
		gbc_lblResult.insets = new Insets(0, 0, 5, 5);
		gbc_lblResult.gridx = 0;
		gbc_lblResult.gridy = 16;
		contentPane.add(lblResult, gbc_lblResult);
		lblResult.setVisible(false);
		
		lbResult = new JLabel("");
		GridBagConstraints gbc_lbResult = new GridBagConstraints();
		gbc_lbResult.anchor = GridBagConstraints.WEST;
		gbc_lbResult.insets = new Insets(0, 0, 5, 5);
		gbc_lbResult.gridx = 1;
		gbc_lbResult.gridy = 16;
		contentPane.add(lbResult, gbc_lbResult);
		contentPane.add(btnExit, gbc_btnExit);
		
		btnReplay = new JButton("Replay");
		GridBagConstraints gbc_btnReplay = new GridBagConstraints();
		gbc_btnReplay.gridwidth = 6;
		gbc_btnReplay.insets = new Insets(0, 0, 0, 5);
		gbc_btnReplay.gridx = 4;
		gbc_btnReplay.gridy = 17;
		contentPane.add(btnReplay, gbc_btnReplay);
		btnReplay.addActionListener(this);
		btnReplay.setVisible(false);
		
		
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		switch(e.getActionCommand()){
		case"Enter":
			/**
			 * Variables Pour la generation et la correction du Pc
			 */
			String combiPc = "";
			String combiPcCorrect2 = "";
			char[][] resultCombiPcCorrige =new char[3][4];
			char[] combiPcCorrect = new char[4];
			//------------------
			
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
				btnReplay.setVisible(true);
			}
			
			else if (gameControllerGui.ifCorrect(combiInJframe) == true) {
				lbWin.setText("You win !");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
				btnReplay.setVisible(true);
				btnReplay.requestFocus();
			}
			else if (gameControllerGui.ifCorrect(combiPc) == true) {
				lbWin.setText("the computer wins");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
				btnReplay.setVisible(true);
				btnReplay.requestFocus();
			}
			
			else if(numeroEssai < 12) {
				nbrChances--;
				lbWin.setText("You have " + nbrChances + " chances");
			}
			else if((numeroEssai >= 12)){
				lbWin.setText("You lose !");
				textField2.setEditable(false);
				lblResult.setVisible(true);
				lbResult.setVisible(true);
				lbResult.setText(gameControllerGui.convertTab2String(gameControllerGui.getCombiRandom()));
				btnEnter.setEnabled(false);
				btnReplay.setVisible(true);
				btnReplay.requestFocus();
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
			
		case"Replay":
			ViewGamePc viewGamePc = new ViewGamePc();
			viewGamePc.setVisible(true);
			this.dispose();
			
		case"Exit":
			this.dispose();
		}
	}

}
