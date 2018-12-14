package View;
import mastermind.GameController;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
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

public class ViewMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	String temp="";
	private JLabel label_3;
	GameController GameController = new GameController();
	private JButton BtnRules;
	private JLabel label;
	private JLabel lblHermant;
	private JLabel lblMeryers;
	private JLabel lblGauthier;
	private JLabel lblThibaut;
	private JLabel lblHumbert;


	
	
	private JButton btnSoloPc;
	private JLabel lbDate;
	private JPanel pan;
	private JLabel lbImage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMain frame = new ViewMain();
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
	public ViewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{50, 100, 80, 80, 80, 35, 80, 80, 80, 0};
		gbl_contentPane.rowHeights = new int[]{30, 40, 50, 50, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		label_3 = new JLabel("Number Mastermind");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 10;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 15;
		btnExit.addActionListener(this);
		
		
		JButton btnSolo = new JButton("Solo");
		btnSolo.setHorizontalAlignment(SwingConstants.LEFT);
		btnSolo.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnSolo = new GridBagConstraints();
		gbc_btnSolo.anchor = GridBagConstraints.WEST;
		gbc_btnSolo.gridwidth = 2;
		gbc_btnSolo.insets = new Insets(0, 0, 5, 5);
		gbc_btnSolo.gridx = 1;
		gbc_btnSolo.gridy = 3;
		contentPane.add(btnSolo, gbc_btnSolo);
		btnSolo.addActionListener(this);
		btnSolo.setMaximumSize(new Dimension(200, 40));
		btnSolo.setMinimumSize(new Dimension(200, 40));
		
		// pour l'image
		/*
		
		String imgUrl="8761974.jpg";
	    ImageIcon icone = new ImageIcon(imgUrl);
		
		JLabel lbImage = new JLabel(icone, JLabel.CENTER);
		GridBagConstraints gbc_lbImage = new GridBagConstraints();
		gbc_lbImage.gridwidth = 4;
		gbc_lbImage.gridheight = 7;
		gbc_lbImage.insets = new Insets(0, 0, 5, 5);
		gbc_lbImage.gridx = 4;
		gbc_lbImage.gridy = 3;
		contentPane.add(lbImage, gbc_lbImage);
		
		*/
		
	
		btnSoloPc = new JButton("Solo_Pc");
		btnSoloPc.setHorizontalAlignment(SwingConstants.LEFT);
		btnSoloPc.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnSoloPc = new GridBagConstraints();
		gbc_btnSoloPc.gridwidth = 2;
		gbc_btnSoloPc.anchor = GridBagConstraints.WEST;
		gbc_btnSoloPc.insets = new Insets(0, 0, 5, 5);
		gbc_btnSoloPc.gridx = 1;
		gbc_btnSoloPc.gridy = 5;
		contentPane.add(btnSoloPc, gbc_btnSoloPc);
		btnSoloPc.addActionListener(this);
		btnSoloPc.setMaximumSize(new Dimension(200, 40));
		btnSoloPc.setMinimumSize(new Dimension(200, 40));
		
		
		JButton btnMulti = new JButton("Multiplayer");
		btnMulti.setHorizontalAlignment(SwingConstants.LEFT);
		btnMulti.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnMulti = new GridBagConstraints();
		gbc_btnMulti.anchor = GridBagConstraints.WEST;
		gbc_btnMulti.gridwidth = 2;
		gbc_btnMulti.insets = new Insets(0, 0, 5, 5);
		gbc_btnMulti.gridx = 1;
		gbc_btnMulti.gridy = 7;
		contentPane.add(btnMulti, gbc_btnMulti);
		btnMulti.addActionListener(this);
		btnMulti.setMaximumSize(new Dimension(200, 40));
		btnMulti.setMinimumSize(new Dimension(200, 40));
		
		BtnRules = new JButton("Rules");
		BtnRules.setHorizontalAlignment(SwingConstants.LEFT);
		BtnRules.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_BtnRules = new GridBagConstraints();
		gbc_BtnRules.anchor = GridBagConstraints.WEST;
		gbc_BtnRules.gridwidth = 2;
		gbc_BtnRules.insets = new Insets(0, 0, 5, 5);
		gbc_BtnRules.gridx = 1;
		gbc_BtnRules.gridy = 9;
		contentPane.add(BtnRules, gbc_BtnRules);
		BtnRules.addActionListener(this);
		BtnRules.setMaximumSize(new Dimension(200, 40));
		BtnRules.setMinimumSize(new Dimension(200, 40));
		
		label = new JLabel("BOHYN ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 12;
		contentPane.add(label, gbc_label);
		
		lblGauthier = new JLabel("Gauthier");
		GridBagConstraints gbc_lblGauthier = new GridBagConstraints();
		gbc_lblGauthier.anchor = GridBagConstraints.WEST;
		gbc_lblGauthier.insets = new Insets(0, 0, 5, 5);
		gbc_lblGauthier.gridx = 1;
		gbc_lblGauthier.gridy = 12;
		contentPane.add(lblGauthier, gbc_lblGauthier);
		
		lblHermant = new JLabel("HERMANT");
		GridBagConstraints gbc_lblHermant = new GridBagConstraints();
		gbc_lblHermant.anchor = GridBagConstraints.WEST;
		gbc_lblHermant.insets = new Insets(0, 0, 5, 5);
		gbc_lblHermant.gridx = 0;
		gbc_lblHermant.gridy = 13;
		contentPane.add(lblHermant, gbc_lblHermant);
		
		lblThibaut = new JLabel("Thibaut");
		GridBagConstraints gbc_lblThibaut = new GridBagConstraints();
		gbc_lblThibaut.anchor = GridBagConstraints.WEST;
		gbc_lblThibaut.insets = new Insets(0, 0, 5, 5);
		gbc_lblThibaut.gridx = 1;
		gbc_lblThibaut.gridy = 13;
		contentPane.add(lblThibaut, gbc_lblThibaut);
		
		lblMeryers = new JLabel("MEYERS");
		GridBagConstraints gbc_lblMeryers = new GridBagConstraints();
		gbc_lblMeryers.anchor = GridBagConstraints.WEST;
		gbc_lblMeryers.insets = new Insets(0, 0, 5, 5);
		gbc_lblMeryers.gridx = 0;
		gbc_lblMeryers.gridy = 14;
		contentPane.add(lblMeryers, gbc_lblMeryers);
		
		lblHumbert = new JLabel("Humbert");
		GridBagConstraints gbc_lblHumbert = new GridBagConstraints();
		gbc_lblHumbert.anchor = GridBagConstraints.WEST;
		gbc_lblHumbert.insets = new Insets(0, 0, 5, 5);
		gbc_lblHumbert.gridx = 1;
		gbc_lblHumbert.gridy = 14;
		contentPane.add(lblHumbert, gbc_lblHumbert);
		contentPane.add(btnExit, gbc_btnExit);
		
		lbDate = new JLabel("Janvier 2019");
		GridBagConstraints gbc_lbDate = new GridBagConstraints();
		gbc_lbDate.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lbDate.gridwidth = 3;
		gbc_lbDate.gridx = 7;
		gbc_lbDate.gridy = 15;
		contentPane.add(lbDate, gbc_lbDate);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		
	
		
		switch(e.getActionCommand()){
		case "Solo":
			ViewLevel viewLevel = new ViewLevel();
			viewLevel.setVisible(true);
			this.dispose();
			break;
		case"Solo_Pc":
			ViewGamePc viewGamePc = new ViewGamePc();
			viewGamePc.setVisible(true);
			this.dispose();
			break;
		case"Multiplayer":
			ViewHote viewHote = new ViewHote();
			viewHote.setVisible(true);
			this.dispose();
			break;
		case"Rules":
			ViewRules viewRules = new ViewRules();
			viewRules.setVisible(true);
			this.dispose();
			break;
		case"Exit":
			
			this.dispose();
		}
	}

}
