package View;
import mastermind.GameController;
import mastermind.GameControllerGUI;
import mastermind.RandomCombi;
import mastermind.Correction;

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
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.Panel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.ScrollPane;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JInternalFrame;

public class ViewGamePc extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField2;
	String temp="----";


	private JLabel label_1;
	private JLabel label;
	private JLabel label_2;
	private JLabel label_3;
	private JTextPane combiInTout;
	GameControllerGUI GameControllerGui = new GameControllerGUI();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGamePc frame = new ViewGamePc();
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
	public ViewGamePc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{35, 80, 80, 80, 80, 35, 80, 80, 80, 35};
		gbl_contentPane.rowHeights = new int[]{29, 37, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
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
		
		label_2 = new JLabel("Competitor's game");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.gridwidth = 3;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 3;
		contentPane.add(label_2, gbc_label_2);
		
		combiInTout = new JTextPane();
		GridBagConstraints gbc_combiInTout = new GridBagConstraints();
		gbc_combiInTout.gridwidth = 2;
		gbc_combiInTout.gridheight = 11;
		gbc_combiInTout.insets = new Insets(0, 0, 5, 5);
		gbc_combiInTout.fill = GridBagConstraints.BOTH;
		gbc_combiInTout.gridx = 1;
		gbc_combiInTout.gridy = 4;
		contentPane.add(combiInTout, gbc_combiInTout);
		
		
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
	
	
	GameControllerGUI gameControllerGui = new GameControllerGUI();
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String textOrigine="";
		
		switch(e.getActionCommand()){
		case"Enter":
			
			
			String result = "";
			textOrigine=textField2.getText();
			
			result = gameControllerGui.corrige(textOrigine);
			
			label.setText(result);
		
			temp = temp+"\n"+textOrigine;
			combiInTout.setText(temp);
			
			textField2.setText("");
	
			break;
		case"Clear":
		
			textField2.setText("");
			break;
		case"Exit":
			this.dispose();
		}
	}

}
