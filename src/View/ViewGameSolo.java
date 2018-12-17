package View;

import mastermind.GameControllerGUI;
import mastermind.RandomCombi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
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

public class ViewGameSolo extends JFrame implements ActionListener {


	GameControllerGUI gameControllerGui = new GameControllerGUI();
	RandomCombi instCombiRandom = new RandomCombi();
	/**
	 * Variables
	 */
	private JPanel contentPane;
	private JTextField textField2;
	private String temp="";
	private String temp2 ="";
	private String combiInJframe="";
	public int levelSolo;
	private int numeroEssai = 0;
	private JLabel title,label,label_1,label_2;
	private JTextPane combiInTout,combiResult;
	private JButton btMenu,btnEnter,btnReplay,btnExit;
	private JLabel lbWin,lbResult,lblResult;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGameSolo frame = new ViewGameSolo();
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
	public ViewGameSolo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{60, 30, 30, 60, 30, 30, 60,0};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 89, 29, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		btMenu = new JButton("Menu");
		GridBagConstraints gbc_btMenu = new GridBagConstraints();
		gbc_btMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btMenu.gridx = 0;
		gbc_btMenu.gridy = 0;
		contentPane.add(btMenu, gbc_btMenu);
		btMenu.addActionListener(this);
		
		title = new JLabel("Number Mastermind");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 7;
		gbc_title.insets = new Insets(0, 0, 5, 5);
		gbc_title.gridx = 0;
		gbc_title.gridy = 1;
		contentPane.add(title, gbc_title);
		
		label = new JLabel("Game Solo ");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 7;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 2;
		contentPane.add(label, gbc_label);
		
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
		gbc_combiResult.gridwidth = 2;
		gbc_combiResult.gridheight = 11;
		gbc_combiResult.insets = new Insets(0, 0, 5, 5);
		gbc_combiResult.fill = GridBagConstraints.BOTH;
		gbc_combiResult.gridx = 4;
		gbc_combiResult.gridy = 4;
		contentPane.add(combiResult, gbc_combiResult);
		combiResult.setEditable(false);
		
		
		btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 0;
		gbc_btnEnter.gridy = 15;
		contentPane.add(btnEnter, gbc_btnEnter);
		btnEnter.addActionListener(this);
		
		JRootPane rootPane = SwingUtilities.getRootPane(btnEnter);
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
		
		lbWin = new JLabel("");
		lbWin.setHorizontalAlignment(SwingConstants.LEFT);
		lbWin.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lbWin = new GridBagConstraints();
		gbc_lbWin.gridwidth = 4;
		gbc_lbWin.insets = new Insets(0, 0, 5, 5);
		gbc_lbWin.gridx = 3;
		gbc_lbWin.gridy = 15;
		contentPane.add(lbWin, gbc_lbWin);
		
		btnExit = new JButton("Exit");
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
		gbc_lbResult.gridwidth = 2;
		gbc_lbResult.insets = new Insets(0, 0, 5, 5);
		gbc_lbResult.gridx = 1;
		gbc_lbResult.gridy = 16;
		contentPane.add(lbResult, gbc_lbResult);
		contentPane.add(btnExit, gbc_btnExit);
		
		btnReplay = new JButton("Replay");
		GridBagConstraints gbc_btnReplay = new GridBagConstraints();
		gbc_btnReplay.gridwidth = 4;
		gbc_btnReplay.insets = new Insets(0, 0, 0, 5);
		gbc_btnReplay.gridx = 3;
		gbc_btnReplay.gridy = 17;
		contentPane.add(btnReplay, gbc_btnReplay);
		btnReplay.addActionListener(this);
		btnReplay.setVisible(false);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()){
		case"Enter":
			
			combiInJframe=textField2.getText();
			
			temp2 = temp2 + gameControllerGui.corrige(combiInJframe)+"\n";
			temp = temp+combiInJframe+"\n";
			
			
			if(gameControllerGui.ifCorrect(combiInJframe) == true) {
				
				combiInTout.setText(temp);
				combiResult.setText(temp2);
				textField2.setText("");
				lbWin.setText("You win !");
				textField2.setEditable(false);
				btnEnter.setEnabled(false);
				btnReplay.setVisible(true);
			//	btnReplay.setEnabled(false);
				
				
				
			}
			else {
				if((numeroEssai +1 >= levelSolo) && (gameControllerGui.ifCorrect(combiInJframe) == false)) {
					
					combiInTout.setText(temp);
					combiResult.setText(temp2);
					lbWin.setText("You lose !");
					textField2.setText("");
					lbResult.setText(gameControllerGui.convertTab2String(gameControllerGui.getCombiRandom()));
					textField2.setEditable(false);
					lblResult.setVisible(true); 
					btnEnter.setEnabled(false);
					btnReplay.setVisible(true);
					btnReplay.requestFocus();
				}
				else if(numeroEssai < levelSolo) {
					
					combiResult.setText(temp2);
					
					combiInTout.setText(temp);
					
					textField2.setText("");
					
					numeroEssai++;
				}
				
			}
			
			
	
			break;
		case"Menu":
			ViewMain viewMain = new ViewMain();
			viewMain.setVisible(true);
			this.dispose();
			break;
		case"Replay":
			ViewLevel viewLevel = new ViewLevel();
			viewLevel.setVisible(true);
			this.dispose();
		case"Exit":
			this.dispose();
		}
	}

}
