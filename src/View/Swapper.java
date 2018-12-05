package View;
// _____________ TEST ___________

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JPopupMenu;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;

public class Swapper extends JFrame implements ActionListener{
	private JTextField  field1;
	private JTextField  field2;
	JButton swap;
	JButton exit;
	private JPanel contentPane;

	
	public Swapper(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			//Boutton pour forcer à fermer la page	
				
				
				JPopupMenu popup = new JPopupMenu();
				addPopup(contentPane, popup);
				
				JLabel lblForcerQuitter = new JLabel("Forcer à quitter");
				popup.add(lblForcerQuitter);
				
				JButton btnExit = new JButton("EXIT");
				popup.add(btnExit);
				
				GridBagLayout gbl_contentPane = new GridBagLayout();
				gbl_contentPane.columnWidths = new int[]{12, 80, 80, 80, 80, 80, 80, 80, 80, 12};
				gbl_contentPane.rowHeights = new int[]{31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31};
				gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				contentPane.setLayout(gbl_contentPane);
				
		Box fieldBox = Box.createHorizontalBox();
		
		
		swap = new JButton("SWAP");
		exit = new JButton("EXIT");
		Box buttonBox = Box.createHorizontalBox();
		buttonBox.add(swap);
		buttonBox.add(exit);
		swap.addActionListener(this);
		exit.addActionListener(this);
		
		Box panelBox = Box.createVerticalBox();
		panelBox.setBackground(Color.GRAY);
		setContentPane(panelBox);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(panelBox, popupMenu);
		
		JButton exit = new JButton("EXIT");
		popupMenu.add(exit);
		panelBox.add(fieldBox);
		panelBox.add(buttonBox);
		exit.addActionListener(this);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				Swapper frame = new Swapper();
				frame.setVisible(true);
				frame.setTitle("ma premiere JFrame");
				frame.pack();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()){ // par default est le text des bouttons
			case "SWAP":
				String temp = field1.getText(); // 3eme variable car field1 va se modifier avec field2
				field1.setText(field2.getText());
				field2.setText(temp);
				break;
			case "EXIT":
				this.dispose();
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
