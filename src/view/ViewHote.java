package view;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ModelGame;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert
 * La vue du jeu en GUI pour le choix entre hote ou client
 */

public class ViewHote extends JFrame implements ActionListener {

	
	ModelGame GameController = new ModelGame();
	
	/**
	 * Variable
	 */
	private JPanel contentPane;
	private JLabel title,lblYouAre;
	private JButton btnHote,btGuest;
	
	/**
	 * Launch the application.
	 * @param args les paramÃ¨tres du jeu.
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
		gbl_contentPane.columnWidths = new int[]{50, 150,150, 50};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 60, 0, 60, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		title = new JLabel("Number Mastermind");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 4;
		gbc_title.insets = new Insets(0, 0, 5, 5);
		gbc_title.gridx = 0;
		gbc_title.gridy = 1;
		contentPane.add(title, gbc_title);
		
		btnHote = new JButton("Host");
		btnHote.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btnHote = new GridBagConstraints();
		gbc_btnHote.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnHote.insets = new Insets(0, 0, 5, 5);
		gbc_btnHote.gridx = 2;
		gbc_btnHote.gridy = 3;
		contentPane.add(btnHote, gbc_btnHote);
		btnHote.addActionListener(this);
		btnHote.setMaximumSize(new Dimension(150, 40));
		btnHote.setMinimumSize(new Dimension(150, 40));
		
		lblYouAre = new JLabel("You are:");
		lblYouAre.setHorizontalAlignment(SwingConstants.LEFT);
		lblYouAre.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_lblYouAre = new GridBagConstraints();
		gbc_lblYouAre.anchor = GridBagConstraints.WEST;
		gbc_lblYouAre.insets = new Insets(0, 0, 5, 5);
		gbc_lblYouAre.gridx = 1;
		gbc_lblYouAre.gridy = 4;
		contentPane.add(lblYouAre, gbc_lblYouAre);
		
		btGuest = new JButton("Guest");
		btGuest.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		GridBagConstraints gbc_btGuest = new GridBagConstraints();
		gbc_btGuest.anchor = GridBagConstraints.NORTHWEST;
		gbc_btGuest.insets = new Insets(0, 0, 5, 5);
		gbc_btGuest.gridx = 2;
		gbc_btGuest.gridy = 5;
		contentPane.add(btGuest, gbc_btGuest);
		btGuest.addActionListener(this);
		btGuest.setMaximumSize(new Dimension(150, 40));
		btGuest.setMinimumSize(new Dimension(150, 40));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()){
		
		case"Host":
			ViewYourIp viewYourIp = new ViewYourIp();
			viewYourIp.setVisible(true);
			this.dispose();
			break;
			
		case"Guest":
			ViewIp viewIp = new ViewIp();
			viewIp.setVisible(true);
			this.dispose();
			break;
		
		case"Exit":
			this.dispose();
		}
		
	}

}
