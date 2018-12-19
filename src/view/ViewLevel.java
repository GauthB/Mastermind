package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

import model.ModelGame;

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

public class ViewLevel extends JFrame implements ActionListener {

	ModelGame GameControllerGui = new ModelGame();
	private JPanel contentPane;
	private JTextField textField;
	private JLabel Title,lblEncoderLadresseIp,lblHardh,lblNormaln,lblEasye,lbErreur;
	private JButton btnEnter;
	String temp="";
	
	/**
	 * Launch the application.
	 * @param args les paramètres du jeu.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLevel frame = new ViewLevel();
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
	public ViewLevel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{10, 90, 20, 50, 50, 20, 20,20, 80};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		Title = new JLabel("Number Mastermind");
		Title.setHorizontalAlignment(SwingConstants.LEFT);
		Title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_Title = new GridBagConstraints();
		gbc_Title.gridwidth = 3;
		gbc_Title.insets = new Insets(0, 0, 5, 0);
		gbc_Title.gridx = 0;
		gbc_Title.gridy = 1;
		contentPane.add(Title, gbc_Title);
		
		lblEncoderLadresseIp = new JLabel("Please enter your difficulty:");
		lblEncoderLadresseIp.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEncoderLadresseIp = new GridBagConstraints();
		gbc_lblEncoderLadresseIp.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEncoderLadresseIp.gridwidth = 3;
		gbc_lblEncoderLadresseIp.insets = new Insets(0, 0, 5, 0);
		gbc_lblEncoderLadresseIp.gridx = 0;
		gbc_lblEncoderLadresseIp.gridy = 3;
		contentPane.add(lblEncoderLadresseIp, gbc_lblEncoderLadresseIp);
		
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 0;
		gbc_btnEnter.gridy = 4;
		contentPane.add(btnEnter, gbc_btnEnter);
		btnEnter.addActionListener(this);
		
		JRootPane rootPane = SwingUtilities.getRootPane(btnEnter);
		rootPane.setDefaultButton(btnEnter);
		rootPane.setVisible(true);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		setVisible(true);
		textField.requestFocus();
		
		lblHardh = new JLabel("Hard = 'H'          5 chances");
		GridBagConstraints gbc_lblHardh = new GridBagConstraints();
		gbc_lblHardh.anchor = GridBagConstraints.WEST;
		gbc_lblHardh.insets = new Insets(0, 0, 5, 5);
		gbc_lblHardh.gridx = 1;
		gbc_lblHardh.gridy = 5;
		contentPane.add(lblHardh, gbc_lblHardh);
		
		lblNormaln = new JLabel("Normal = 'N'      9 chances");
		GridBagConstraints gbc_lblNormaln = new GridBagConstraints();
		gbc_lblNormaln.anchor = GridBagConstraints.WEST;
		gbc_lblNormaln.insets = new Insets(0, 0, 5, 5);
		gbc_lblNormaln.gridx = 1;
		gbc_lblNormaln.gridy = 6;
		contentPane.add(lblNormaln, gbc_lblNormaln);
		
		lblEasye = new JLabel("Easy = 'E'           12 chances");
		GridBagConstraints gbc_lblEasye = new GridBagConstraints();
		gbc_lblEasye.anchor = GridBagConstraints.WEST;
		gbc_lblEasye.insets = new Insets(0, 0, 5, 5);
		gbc_lblEasye.gridx = 1;
		gbc_lblEasye.gridy = 7;
		contentPane.add(lblEasye, gbc_lblEasye);
		
		lbErreur = new JLabel("");
		lbErreur.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		GridBagConstraints gbc_lbErreur = new GridBagConstraints();
		gbc_lbErreur.anchor = GridBagConstraints.WEST;
		gbc_lbErreur.insets = new Insets(0, 0, 0, 5);
		gbc_lbErreur.gridx = 1;
		gbc_lbErreur.gridy = 8;
		contentPane.add(lbErreur, gbc_lbErreur);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		switch(e.getActionCommand()){
	
		case"Enter":
				
			ViewGameSolo ViewGameSolo = new ViewGameSolo();

			if(!(GameControllerGui.isLevelCorrect(textField.getText()))){
				lbErreur.setText("Value no correct");
				textField.setText("");
			}
			else {
				ViewGameSolo.levelSolo = GameControllerGui.levelSolo(textField.getText());
				ViewGameSolo.setVisible(true);
				this.dispose();
			}
			
		}
	}

}
