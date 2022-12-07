package bch60_MenuManager_v3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class MenuManagerGUI {

	// Declaring the GUI objects that you will be using 
	JFrame mainFrame;
	JLabel lblFirstName;
	JTextField txtFirstName;
	JButton firstButton;
	JPanel firstPane;
	Border blackline1;
	JComboBox firstBox;
	JComboBox secondBox;
	JComboBox thirdBox;
	JComboBox fourthBox;
	
	
	// When something has a J in front of it that means that it is swing and not the old AWT
	
	// Is this what you meant when you mentioned that all components had to be declared as properties?
	
	public MenuManagerGUI() {
		
		
		// might have to change the read file but for now that works 
		MenuManager newMM = new MenuManager("cd ..\\..\\data\\dishes.txt");
		//System.out.println("Constructor was called");

		
		initGui(newMM);
	}
	
	private void initGui(MenuManager newMM) {
		
		// Make sure you set the size of your Frame
		mainFrame = new JFrame("Menu Manager");
		
		// The first two inputs are where the application will launch
		// 650 pixels wide, 550 pixels tall
		mainFrame.setBounds(400,200,650,550);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the frame
		mainFrame.getContentPane().setLayout(null); // Choosing layout I g were manual
		mainFrame.setVisible(true); // actually makes Pane appear, must be done for user to see it 
	
		// Creates the border that will be used throughout the app 
		Border thatBorder1 = new LineBorder(Color.BLACK);
		blackline1 = (BorderFactory.createTitledBorder(thatBorder1,"Build your own Menu  ")); 
		Font font = new Font("Serif", Font.ITALIC, 12);
		Border thatBorder = new TitledBorder(blackline1,"",0, 0, font,Color.BLACK);
		//((TitledBorder) blackline1).setTitleColor(Color.red); to change color
		// Much more difficult but nessecary way to create a border, manually with more access to methods
		
		
		// First Border Pane section 
		firstPane = new JPanel();
		firstPane.setBounds(10,10,500,500);
		firstPane.setBorder(blackline1);
		firstPane.setBorder(thatBorder);
		mainFrame.getContentPane().add(firstPane);
		
		//System.out.println(newMM.getEntrees());
		
		// Important to note: Make sure that your 3 and 4 are big enough to fit the label you are trying to put 
		lblFirstName = new JLabel(" Entree ");
		lblFirstName.setBounds(30,30,100,10); // with respect to the mainFrame you are adding it to
		firstPane.add(lblFirstName);//.getContentPane().add(lblFirstName); // adds element to the app
		
		
		firstBox = new JComboBox();
		firstBox.setBounds(140,30,100,20);
		firstPane.add(firstBox);
		
		secondBox = new JComboBox(); // initializing the state?
		secondBox.setBounds(240,60,100,20);
		firstPane.add(secondBox);
		
		thirdBox = new JComboBox();
		thirdBox.setBounds(360,90,100,20);
		firstPane.add(thirdBox);
		
		fourthBox = new JComboBox();
		fourthBox.setBounds(490,120,100,20);
		firstPane.add(fourthBox);
		
		//Adding Correct Items to the Combo Boxes
		for (int i=0; i<newMM.getEntrees().size(); i++) {
			firstBox.addItem(newMM.getEntrees().get(i));
		}
		for (int i=0; i<newMM.getSides().size(); i++) {
			secondBox.addItem(newMM.getSides().get(i));
		}
		for (int i=0; i<newMM.getSalads().size(); i++) {
			thirdBox.addItem(newMM.getSalads().get(i));
		}
		for (int i=0; i<newMM.getDesserts().size(); i++) {
			fourthBox.addItem(newMM.getDesserts().get(i));
		}
		
		
		/*
		txtFirstName = new JTextField();
		txtFirstName.setBounds(140, 30, 100, 15);
		mainFrame.getContentPane().add(txtFirstName);
		*/
		
		// Button example 
		/*
		firstButton = new JButton();
		firstButton.setBounds(230,10,100,20);
		mainFrame.getContentPane().add(firstButton);
		*/
		
		
		mainFrame.repaint();
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Do you have to declare a new instance of class object? Will that get the GUI going?
		MenuManagerGUI app = new MenuManagerGUI(); 
		
			
		/*
		 * Oh even though it says its unused -- Because you are activating 
		 * the constructor you are activating the class itself. ****
		 * So now the Final Driver doesnt even have to exist anymore 
		 */
	
		//MenuManagerGUI();
	}
	
}
