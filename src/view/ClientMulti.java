package view;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Correction;
import controller.RandomCombi;
import model.ModelGame;
import network.ClientConnect;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;

/**
 * @author BOHYN Gauthier
 * @author HERMANT Thibaut
 * @author MEYERS Humbert
 * La vue du client en GUI
 */
public class  ClientMulti extends JFrame implements ActionListener {
	
	public String ip="";
	public int port;
	public char[] combiRandom = new char[4];
	public int chances = 12;
	public String temp="";
	public String temp2="";
	public String temp3="";
	
	ModelGame modelGame = new ModelGame();
	Correction correction = new Correction();
	
	static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public boolean flag =false;

    
    public JTextPane combiInTout;
	public JTextPane combiResult;
	public static JTextPane combiCompetitor;
	private JLabel lblGameMuli;
	private JButton btMenu;
	private JLabel lbWin;
	private JLabel label_1;
	private JLabel lblYourResult;
	private JLabel label_2;
	private JLabel label_3;
	private JPanel contentPane;
	public static JTextField textField2;
	
	
	 public static void main(String[] args) throws Exception {
		 EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ClientMulti frame = new ClientMulti();
						frame.setVisible(true);
						frame.setTitle("Number Mastermind");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

	 }
	 
	 public ClientMulti() throws Exception {
			initComponents();
		}
	 
	public ClientMulti(String ip,int port) throws Exception {
		this.ip = ip;
		this.port = port;
		initComponents();
		RandomCombi randomCombi =  new RandomCombi();
		combiRandom = randomCombi.combi;		
		
	}
	public void initComponents()  {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{70, 70, 70, 20, 70, 70, 70, 70, 70};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
		gbc_label_3.gridwidth = 10;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		lblGameMuli = new JLabel("Game Multiplayer");
		lblGameMuli.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		GridBagConstraints gbc_lblGameMuli = new GridBagConstraints();
		gbc_lblGameMuli.gridwidth = 10;
		gbc_lblGameMuli.insets = new Insets(0, 0, 5, 0);
		gbc_lblGameMuli.gridx = 0;
		gbc_lblGameMuli.gridy = 2;
		contentPane.add(lblGameMuli, gbc_lblGameMuli);
		
		label_1 = new JLabel("Your game");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.gridwidth = 2;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		contentPane.add(label_1, gbc_label_1);
		
		lblYourResult = new JLabel("Your result");
		GridBagConstraints gbc_lblYourResult = new GridBagConstraints();
		gbc_lblYourResult.gridwidth = 2;
		gbc_lblYourResult.anchor = GridBagConstraints.WEST;
		gbc_lblYourResult.insets = new Insets(0, 0, 5, 5);
		gbc_lblYourResult.gridx = 4;
		gbc_lblYourResult.gridy = 3;
		contentPane.add(lblYourResult, gbc_lblYourResult);
		
		label_2 = new JLabel("Competitor's game");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.gridwidth = 2;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
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
		
		
		JButton btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 0;
		gbc_btnEnter.gridy = 16;
		contentPane.add(btnEnter, gbc_btnEnter);
		btnEnter.addActionListener(this);
		
		textField2 = new JTextField();
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.gridwidth = 2;
		gbc_textField2.insets = new Insets(0, 0, 5, 5);
		gbc_textField2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField2.gridx = 1;
		gbc_textField2.gridy = 16;
		contentPane.add(textField2, gbc_textField2);
		textField2.setColumns(10);
		
		lbWin = new JLabel("You have 12 chances");
		lbWin.setHorizontalAlignment(SwingConstants.LEFT);
		lbWin.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		GridBagConstraints gbc_lbWin = new GridBagConstraints();
		gbc_lbWin.gridwidth = 5;
		gbc_lbWin.insets = new Insets(0, 0, 5, 5);
		gbc_lbWin.gridx = 4;
		gbc_lbWin.gridy = 16;
		contentPane.add(lbWin, gbc_lbWin);
		
		JButton btnExit = new JButton("Exit");
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.insets = new Insets(0, 0, 0, 5);
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 17;
		btnExit.addActionListener(this);
		contentPane.add(btnExit, gbc_btnExit);
		
		JButton btnConnect = new JButton("Connect");
		GridBagConstraints gbc_btnConnect = new GridBagConstraints();
		gbc_btnConnect.insets = new Insets(0, 0, 0, 5);
		gbc_btnConnect.gridx = 0;
		gbc_btnConnect.gridy = 18;
		contentPane.add(btnConnect, gbc_btnConnect);
		btnConnect.addActionListener(this);
		
		JButton btnDisconnect = new JButton("Disconnect");
		GridBagConstraints gbc_btnDisconnect = new GridBagConstraints();
		gbc_btnDisconnect.insets = new Insets(0, 0, 0, 5);
		gbc_btnDisconnect.gridwidth = 2;
		gbc_btnDisconnect.gridx = 1;
		gbc_btnDisconnect.gridy = 18;
		contentPane.add(btnDisconnect, gbc_btnDisconnect);
		btnDisconnect.addActionListener(this);
		
		
	}
	
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		
		case "Disconnect":
			try {
				ClientConnect clientConnect = new ClientConnect(ip,port);

				clientConnect.disconnected();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			break;
		case"Connect":
			try {
				ClientConnect clientConnect = new ClientConnect(ip,port,modelGame.convertTab2String(combiRandom));

				clientConnect.connect();
				System.out.println(combiRandom);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			break;
		case "Enter":
			try {
				System.out.println(combiRandom);
				ClientConnect clientConnect = new ClientConnect(ip,port);
				clientConnect.msg_send(textField2.getText());
				char[] txtTab = new char[4];

				
				temp = temp+textField2.getText()+"\n";
				txtTab = modelGame.convertString2Tab(textField2.getText()) ;
				char tab[] =correction.correction(txtTab,combiRandom); 
				temp2 = temp2+modelGame.convertTab2String(tab)+"\n";
				
				
				if( (textField2.getText().equals(modelGame.convertTab2String(combiRandom)))) {
					combiInTout.setText(temp);
					combiResult.setText(temp2);
					lbWin.setText("You win");
					textField2.setText("");
					textField2.setEditable(false);
				}
				else if(chances == 0) {
					lbWin.setText("You lose");
					textField2.setText("");
					textField2.setEditable(false);
				}
				else {
					chances--;
					combiInTout.setText(temp);
					combiResult.setText(temp2);
					temp3 = temp3+clientConnect.msg_Receive()+"\n";
					combiCompetitor.setText(temp3);
					lbWin.setText("You have " + chances + " chances");
				}
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			break;
			
		case "Menu":
			ViewMain viewMain = new ViewMain();
			viewMain.setVisible(true);
			this.dispose();
			break;
		
		case "Exit":
			this.dispose();
			break;
			
		}
	}
		
		
	}

