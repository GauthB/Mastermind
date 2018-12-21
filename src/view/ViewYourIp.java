package view;
import network.AddressIp;
import network.ClientMulti;
import network.ServeurMulti;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;

import model.ModelGame;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;

public class ViewYourIp extends JFrame implements ActionListener {

	ModelGame GameController = new ModelGame();
AddressIp addressIp = new AddressIp();
	
	
	/**
	 * Variables
	 */
	private JPanel contentPane;
	private JLabel title,lblIpAddress;
	String temp="";
	private JLabel lblIp;
	public  InetAddress LocaleAdresse ;
	private JButton btnOk;
	private JRootPane rootPane;
	
	/**
	 * Launch the application.
	 * @param args les paramÃƒÆ’Ã†â€™Ãƒâ€šÃ‚Â¨tres du jeu.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewYourIp frame = new ViewYourIp();
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
	 * @throws UnknownHostException 
	 */
	public ViewYourIp() /*throws Exception*/{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{20, 0, 20};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 60, 0, 60, 0, 0,20};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		title = new JLabel("Number Mastermind");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 3;
		gbc_title.insets = new Insets(0, 0, 5, 0);
		gbc_title.gridx = 0;
		gbc_title.gridy = 1;
		contentPane.add(title, gbc_title);
		
		lblIpAddress = new JLabel("Your Ip address:");
		lblIpAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblIpAddress = new GridBagConstraints();
		gbc_lblIpAddress.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblIpAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblIpAddress.gridx = 1;
		gbc_lblIpAddress.gridy = 3;
		contentPane.add(lblIpAddress, gbc_lblIpAddress);
		
		lblIp = new JLabel("");
		lblIp.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		GridBagConstraints gbc_lblIp = new GridBagConstraints();
		gbc_lblIp.anchor = GridBagConstraints.WEST;
		gbc_lblIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblIp.gridx = 1;
		gbc_lblIp.gridy = 4;
		contentPane.add(lblIp, gbc_lblIp);
		
		btnOk = new JButton("OK");
		btnOk.setMinimumSize(new Dimension(100, 40));
		btnOk.setMaximumSize(new Dimension(100, 40));
		btnOk.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnOk.gridwidth = 2;
		gbc_btnOk.insets = new Insets(0, 0, 5, 5);
		gbc_btnOk.gridx = 0;
		gbc_btnOk.gridy = 6;
		contentPane.add(btnOk, gbc_btnOk);
		btnOk.addActionListener(this);
		setVisible(true);
		btnOk.requestFocus();
		
		// Pour afficher l'adresse IP
		
		//String ip = InetAddress.getLocalHost().getHostAddress().toString();
		try {
			System.out.println("Votre IP est : " + addressIp.giveMyIp());
			lblIp.setText(addressIp.giveMyIp());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//lblIp.setText(ip);
		
		rootPane = SwingUtilities.getRootPane(btnOk);
		rootPane.setDefaultButton(btnOk);
		rootPane.setVisible(true);
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()){
	
		case"OK":
			 
			try {
				ServeurMulti serveurMulti = new ServeurMulti();
				serveurMulti.setVisible(true);
				this.dispose();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		case"Exit":	
			this.dispose();
		}
	}

}
