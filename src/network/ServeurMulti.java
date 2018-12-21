package network;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import view.ViewGameMulti;
import view.ViewIp;
import view.ViewYourIp;

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

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;


public class ServeurMulti extends JFrame implements ActionListener {
	
	ServeurConnect serveurConnect = new ServeurConnect(1118);
	public int port;
	static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
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
	
	
	
	public ServeurMulti() throws Exception {
		initComponents();
		
	}
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{70, 70, 70, 20, 70, 70, 70, 70, 70};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 0};
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
		
		lbWin = new JLabel("");
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
		gbc_btnConnect.gridx = 2;
		gbc_btnConnect.gridy = 17;
		contentPane.add(btnConnect, gbc_btnConnect);
		btnConnect.addActionListener(this);
	}
	  
	  
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "Connect":
			try {
				serveurConnect.connect();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			break;
			
		case "Enter":
			try {
				serveurConnect.msg_send(textField2.getText());
				combiCompetitor.setText(serveurConnect.msg_Receive());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			break;
			
		case "Exit":
			this.dispose();
			break;
		}
		
		
		
	}
	

    
}   
	


	
/*
	   public static void main(String[] args) {
	      
	      final Socket clientSocket;
	      final BufferedReader in;
	      final PrintWriter out;
	      final Scanner sc = new Scanner(System.in);//pour lire ÃƒÆ’Ã‚Â  partir du clavier
	  
	      try {
	         
	         clientSocket = new Socket("127.0.0.1",5000);
	   
	         //flux pour envoyer
	         out = new PrintWriter(clientSocket.getOutputStream());
	         //flux pour recevoir
	         in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	   
	         Thread envoyer = new Thread(new Runnable() {
	             String msg;
	              @Override
	              public void run() {
	                while(true){
	                  msg = sc.nextLine();
	                  out.println(msg);
	                  out.flush();
	                }
	             }
	         });
	         envoyer.start();
	   
	        Thread recevoir = new Thread(new Runnable() {
	            String msg;
	            @Override
	            public void run() {
	               try {
	                 msg = in.readLine();
	                 while(msg!=null){
	                    System.out.println("Serveur : "+msg);
	                    msg = in.readLine();
	                 }
	                 System.out.println("Serveur dÃƒÆ’Ã‚Â©conectÃƒÆ’Ã‚Â©");
	                 out.close();
	                 clientSocket.close();
	               } catch (IOException e) {
	                   e.printStackTrace();
	               }
	            }
	        });
	        recevoir.start();
	   
	      } catch (IOException e) {
	           e.printStackTrace();
	      }
	  }*/
	/*
public void connect() throws Exception {
		
		System.out.println(ip);
		System.out.println(port);
		
		try {
			
			Socket s = new Socket(ip,port);
			
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgin="", msgout="";
			while(!msgin.equals("end")) {
				msgout = br.readLine();
				dout.writeUTF(msgout);
				msgin = din.readUTF();
				System.out.println(msgin);
				
			}
			s.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void createMulti() {
		ViewGameMulti viewGameMulti = new ViewGameMulti();
		viewGameMulti.setVisible(true);
	}*/

