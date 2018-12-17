package View;
import mastermind.GameController;

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

public class ViewIp extends JFrame implements ActionListener {

	GameController GameController = new GameController();
	ViewGameMulti viewGameMulti = new ViewGameMulti();
	/**
	 * Variables
	 */
	private JPanel contentPane;
	private JTextField textField;
	private JLabel title,lblEncoderLadresseIp;
	private JButton btnIp;
	String temp="";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewIp frame = new ViewIp();
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
	public ViewIp() {
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
		
		title = new JLabel("Number Mastermind");
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.gridwidth = 3;
		gbc_title.insets = new Insets(0, 0, 5, 0);
		gbc_title.gridx = 0;
		gbc_title.gridy = 1;
		contentPane.add(title, gbc_title);
		
		lblEncoderLadresseIp = new JLabel("Enter the Ip adress:");
		lblEncoderLadresseIp.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEncoderLadresseIp = new GridBagConstraints();
		gbc_lblEncoderLadresseIp.gridwidth = 2;
		gbc_lblEncoderLadresseIp.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEncoderLadresseIp.insets = new Insets(0, 0, 5, 5);
		gbc_lblEncoderLadresseIp.gridx = 0;
		gbc_lblEncoderLadresseIp.gridy = 3;
		contentPane.add(lblEncoderLadresseIp, gbc_lblEncoderLadresseIp);
		
		btnIp = new JButton("Enter");
		btnIp.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		GridBagConstraints gbc_btnIp = new GridBagConstraints();
		gbc_btnIp.anchor = GridBagConstraints.WEST;
		gbc_btnIp.insets = new Insets(0, 0, 5, 5);
		gbc_btnIp.gridx = 0;
		gbc_btnIp.gridy = 4;
		contentPane.add(btnIp, gbc_btnIp);
		btnIp.addActionListener(this);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()){
	
		case"Enter":
			viewGameMulti.setVisible(true);
			
		case"Exit":	
			this.dispose();
		}
	}

}
