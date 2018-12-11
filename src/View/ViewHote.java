package View;
import mastermind.GameController;


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

public class ViewHote extends JFrame implements ActionListener {

	private JPanel contentPane;
	String temp="";
	private JLabel label_3;
	GameController GameController = new GameController();
	ViewIp viewIp = new ViewIp();
	ViewGameMulti viewGameMulti = new ViewGameMulti();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewHote frame = new ViewHote();
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
	public ViewHote() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 60, 0, 60, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		label_3 = new JLabel("Number Mastermind");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 3;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		
		JButton btnHote = new JButton("Hote");
		GridBagConstraints gbc_btnHote = new GridBagConstraints();
		gbc_btnHote.insets = new Insets(0, 0, 5, 5);
		gbc_btnHote.gridx = 1;
		gbc_btnHote.gridy = 3;
		contentPane.add(btnHote, gbc_btnHote);
		btnHote.addActionListener(this);
		
		JButton btnInvite = new JButton("Invite");
		GridBagConstraints gbc_btnInvite = new GridBagConstraints();
		gbc_btnInvite.insets = new Insets(0, 0, 5, 5);
		gbc_btnInvite.gridx = 1;
		gbc_btnInvite.gridy = 5;
		contentPane.add(btnInvite, gbc_btnInvite);
		btnInvite.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		switch(e.getActionCommand()){
		
		case"Hote":
			
			viewGame.setVisible(true);
			break;
		case"Invite":
		
			viewIp.setVisible(true);
			break;
			
		case"Exit":
			
			this.dispose();
		}
		
	}

}
