package View;

import mastermind.GameControllerGUI;



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

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

//import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTextPane;

public class ViewGameSolo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField2;
	private String temp="----";
	private String temp2 ="----";
	private String combiInJframe="";

	public int levelSolo;
	private int numeroEssai = 0;
	
	private JLabel label_1;
	private JLabel label;
	private JLabel label_3;
	GameControllerGUI gameControllerGui = new GameControllerGUI();
	private JLabel lblGameSoloWith;
	private JTextPane combiInTout;
	private JTextPane combiResult;
	private JButton btMenu;
	private JLabel lbWin;
	
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
		setBounds(100, 100, 700, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{60, 60, 60, 60, 60, 60, 60};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 89, 29, 29, 29, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		btMenu = new JButton("Menu");
		GridBagConstraints gbc_btMenu = new GridBagConstraints();
		gbc_btMenu.insets = new Insets(0, 0, 5, 5);
		gbc_btMenu.gridx = 0;
		gbc_btMenu.gridy = 0;
		contentPane.add(btMenu, gbc_btMenu);
		btMenu.addActionListener(this);
		
		label_3 = new JLabel("Number Mastermind");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 7;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		lblGameSoloWith = new JLabel("Game Solo ");
		lblGameSoloWith.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		GridBagConstraints gbc_lblGameSoloWith = new GridBagConstraints();
		gbc_lblGameSoloWith.gridwidth = 7;
		gbc_lblGameSoloWith.insets = new Insets(0, 0, 5, 0);
		gbc_lblGameSoloWith.gridx = 0;
		gbc_lblGameSoloWith.gridy = 2;
		contentPane.add(lblGameSoloWith, gbc_lblGameSoloWith);
		
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
		
		
		JButton btnSwap = new JButton("Enter");
		GridBagConstraints gbc_btnSwap = new GridBagConstraints();
		gbc_btnSwap.insets = new Insets(0, 0, 5, 5);
		gbc_btnSwap.gridx = 0;
		gbc_btnSwap.gridy = 16;
		contentPane.add(btnSwap, gbc_btnSwap);
		btnSwap.addActionListener(this);
		
		textField2 = new JTextField();
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.gridwidth = 2;
		gbc_textField2.insets = new Insets(0, 0, 5, 5);
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridx = 1;
		gbc_textField2.gridy = 16;
		contentPane.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		
		lbWin = new JLabel("");
		lbWin.setHorizontalAlignment(SwingConstants.LEFT);
		lbWin.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lbWin = new GridBagConstraints();
		gbc_lbWin.gridheight = 2;
		gbc_lbWin.gridwidth = 4;
		gbc_lbWin.insets = new Insets(0, 0, 5, 5);
		gbc_lbWin.gridx = 3;
		gbc_lbWin.gridy = 16;
		contentPane.add(lbWin, gbc_lbWin);
		
		JButton btnClear = new JButton("Clear");
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnClear.gridx = 0;
		gbc_btnClear.gridy = 17;
		contentPane.add(btnClear, gbc_btnClear);
		btnClear.addActionListener(this);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 18;
		btnExit.addActionListener(this);
		contentPane.add(btnExit, gbc_btnExit);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()){
		case"Enter":
			
			combiInJframe=textField2.getText();
			
			temp2 = temp2 +"\n"+ gameControllerGui.corrige(combiInJframe);
			temp = temp+"\n"+combiInJframe;
		
			
			
			if(gameControllerGui.ifCorrect(combiInJframe) == true) {
				
				combiInTout.setText(temp);
				combiResult.setText(temp2);
				lbWin.setText("Vous avez gagne");
				textField2.setEditable(false);
				
			}
			else {
				if((numeroEssai +1 >= levelSolo) && (gameControllerGui.ifCorrect(combiInJframe) == false)) {
					
					combiInTout.setText(temp);
					combiResult.setText(temp2);
					lbWin.setText("Vous avez perdu !");
					textField2.setEditable(false);
				}
				else if(numeroEssai < levelSolo) {
					
					combiResult.setText(temp2);
					
					combiInTout.setText(temp);
					
					textField2.setText("");
					
					numeroEssai++;
				}
				
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