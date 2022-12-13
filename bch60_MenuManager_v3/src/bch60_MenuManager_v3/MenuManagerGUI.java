package bch60_MenuManager_v3;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


/**
 * Class: MenuManagerGUI
 * @author Brandon Hoover
 * Created: 11/27/2022
 */

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
	JLabel lblSecond;
	JLabel lblThird;
	JLabel lblFourth;


	JPanel secondPane;
	JButton botButton1;
	JButton botButton2;
	JButton botButton3;
	Border blackline2;

	JPanel thirdPane;
	JTextField firstText;
	JLabel thirdPaneTitle;
	Border blackline3;
	JList list;
	DefaultListModel<Menu> listModel;
	JScrollPane listScroller;

	int userMenuCount;

	JButton detailsButton;
	JButton deleteButton;
	JButton saveButton;

	JFrame detailFrame;
	JTextArea entreeText;
	JTextArea sideText;
	JTextArea saladText;
	JTextArea dessertText;
	JTextField calText;
	JTextField priceText;
	JLabel entreeLabel;
	JLabel sideLabel;
	JLabel saladLabel;
	JLabel dessertLabel;
	JLabel calLabel;
	JLabel priceLabel;

	// When something has a J in front of it that means that it is swing and not the old AWT
	// Is this what you meant when you mentioned that all components had to be declared as properties?

	/**
	 * Constructor MenuManagerGUI 
	 * -initializes state of non GUI objects, of which there are two (counters), 
	 * calls initGui, which is the GUI, which is the display that the user will see. 
	 * And creates a new instance of MenuManager which then avoids having to set everything to static
	 */
	
	public MenuManagerGUI() {

		// initializing the state of these objects
		userMenuCount=0;
		MenuManager newMM = new MenuManager("cd ..\\..\\data\\dishes.txt");
		//System.out.println("Constructor was called");

		initGui(newMM);
	}
	
	/**
	 * Method initGui
	 * -activates and places all GUI objects that the user can then interact with, also contains all 
	 * event listeners at which point when the user clicks a button it will trigger that section of code.
	 * Is the main method contained within class MenuManagerGUI 
	 * @param MenuManager newMM - an instance of MenuManager that will take all of the loaded data that has been read, sorted, and loaded through the constructor, 
	 * and pass that data for this method utilize it below.
	 * a
	 * @return no return as the type is void
	 */

	private void initGui(MenuManager newMM) {

		// Make sure you set the size of your Frame
		mainFrame = new JFrame("Menu Manager");

		// The first two inputs are where the application will launch
		// 650 pixels wide, 550 pixels tall
		mainFrame.setBounds(300,200,700,550);
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


		// First Border Pane section -- 350 pixels wide, 350 pixels down
		// Default layout was set to Flow layout which was automatically ligning things up left to right
		// Changed to null layout to see what changes
		// The Preferred sizes are what java predetermines should work based off of the layout manager
		firstPane = new JPanel();
		firstPane.setBounds(10,10,350,300);
		firstPane.setLayout(null);
		firstPane.setBorder(blackline1);
		firstPane.setBorder(thatBorder);
		mainFrame.getContentPane().add(firstPane);

		//System.out.println(newMM.getEntrees());


		// initiated list model that elements will be added too
		listModel = new DefaultListModel<Menu>();

		Menu mondayMenu = new Menu("Menu for Monday", newMM.getEntrees().get(1), newMM.getSides().get(2), newMM.getSalads().get(4),newMM.getDesserts().get(3));
		Menu veganMenu = new Menu("'Vegan Menu'", newMM.getEntrees().get(0), newMM.getSides().get(1), newMM.getSalads().get(3),newMM.getDesserts().get(4));
		// Cannot call this method, is it because it is not in main, was able to work in driver file
		//Menu randoMenu = new MenuManager.randomMenu("Menu for Tuesday");


		Menu[] listExamples = {mondayMenu, veganMenu};

		listModel.addElement(mondayMenu);
		listModel.addElement(veganMenu);


		// List for third Pane
		list = new JList(listModel);
		JScrollPane scrollPane = new JScrollPane(list);


		// Important to note: Make sure that your 3 and 4 are big enough to fit the label you are trying to put 
		lblFirstName = new JLabel("------ Entree: ");
		lblFirstName.setBounds(30,35,100,35); // with respect to the mainFrame you are adding it to
		firstPane.add(lblFirstName);//.getContentPane().add(lblFirstName); // adds element to the app


		firstBox = new JComboBox();
		firstBox.setBounds(135,35,175,35);
		firstPane.add(firstBox);

		lblSecond = new JLabel ("------- Sides: ");
		lblSecond.setBounds(30,85,100,35);
		firstPane.add((lblSecond));

		secondBox = new JComboBox(); // initializing the state?
		secondBox.setBounds(135,85,175,35);
		firstPane.add(secondBox);

		lblThird = new JLabel ("------ Salads: ");
		lblThird.setBounds(30,135,100,35);
		firstPane.add((lblThird));

		thirdBox = new JComboBox();
		thirdBox.setBounds(135,135,175,35);
		firstPane.add(thirdBox);

		lblFourth = new JLabel("---- Desserts: ");
		lblFourth.setBounds(30,185,175,35);
		firstPane.add((lblFourth));

		fourthBox = new JComboBox();
		fourthBox.setBounds(135,185,175,35);
		firstPane.add(fourthBox);

		// Button example 
		firstButton = new JButton("Create Menu with these dishes ");
		firstButton.setBounds(30,245,282,25);
		firstButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				userMenuCount++;

				// code that will be executed when the button is clicked
				Entree eChoice = (Entree) firstBox.getSelectedItem();
				Side sChoice = (Side) secondBox.getSelectedItem();
				Salad saChoice = (Salad) thirdBox.getSelectedItem();
				Dessert dChoice = (Dessert) fourthBox.getSelectedItem();

				Menu userGen = new Menu("Your Menu " + userMenuCount, eChoice, sChoice, saChoice, dChoice);

				listModel.addElement(userGen);
			}
		});

		firstPane.add(firstButton);

		// Border set up for second Pane
		Border secondPaneBorder = new LineBorder(Color.BLACK);
		blackline2 = (BorderFactory.createTitledBorder(secondPaneBorder," Or Generate a Menu  ")); 
		Border addBorder2 = new TitledBorder(blackline2,"",0, 0, font,Color.BLACK);

		secondPane = new JPanel();
		secondPane.setBounds(10,325,350,165);
		secondPane.setBorder(addBorder2);
		secondPane.setLayout(null);
		botButton1 = new JButton("Generate a Random Menu ");
		botButton1.setBounds(30,30,282,25);
		botButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String userInputName = JOptionPane.showInputDialog("Name your Random Menu: ");

				Menu randoMen = newMM.randomMenu(userInputName); 
				listModel.addElement(randoMen);
				// must use newMM since that is the new instance of the MenuManager class that you are using
				// that could be an error along with the static problem from last assignment
			}
		});
		secondPane.add(botButton1);

		botButton2 = new JButton("Generate a Minimum Calories Menu ");
		botButton2.setBounds(30,75,282,25);
		botButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Menu minCalories = newMM.minCaloriesMenu("Low Cal Menu"); // maybe fix that, the name is being changed within the method
				listModel.addElement(minCalories);
			}
		});

		;

		secondPane.add(botButton2);

		botButton3 = new JButton("Generate a Maximum Calories Menu ");
		botButton3.setBounds(30,120,282,25);
		botButton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Menu maxCalories = newMM.maxCaloriesMenu("High Cal Menu");
				listModel.addElement(maxCalories);
			}
		});
		secondPane.add(botButton3);

		mainFrame.getContentPane().add(secondPane);

		thirdPane = new JPanel();
		thirdPane.setLayout(null); // default is flow layout
		thirdPane.setBounds(375,35,300,400);
		thirdPane.setBorder(BorderFactory.createLineBorder(Color.black));
		thirdPane.add(scrollPane);
		scrollPane.setBounds(10,10,280,350);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		mainFrame.getContentPane().add(thirdPane);


		// adding it to mainframe instead of third Pane because the figure does not have the label inside of the border
		thirdPaneTitle = new JLabel ("Created Menus: ");
		thirdPaneTitle.setBounds(380,0,100,50);
		mainFrame.add((thirdPaneTitle));



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

		detailsButton = new JButton("Details");
		detailsButton.setBounds(375,450,80,30);
		detailsButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				detailFrame = new JFrame("Menu: " + list.getSelectedValue() );

				detailFrame.setBounds(900,200,650,550);
				detailFrame.getContentPane().setLayout(null); 
				detailFrame.setVisible(true); 

				Menu select = listModel.get(list.getSelectedIndex());

				entreeLabel = new JLabel(" Entree ");
				entreeLabel.setBounds(20,10,50,50);
				detailFrame.add(entreeLabel);

				sideLabel = new JLabel(" Side ");
				sideLabel.setBounds(20,110,50,50);
				detailFrame.add(sideLabel);

				saladLabel = new JLabel(" Salad ");
				saladLabel.setBounds(20,220,175,35);
				detailFrame.add(saladLabel);

				dessertLabel = new JLabel(" Dessert ");
				dessertLabel.setBounds(20,330,175,35);
				detailFrame.add(dessertLabel);

				entreeText = new JTextArea();
				entreeText.setBounds(100, 10, 400, 75);
				entreeText.setLineWrap(true);
				entreeText.setText(select.getEntree().name + "\n" + select.getEntree().description + "\n" + "Calories: " + select.getEntree().calories +
						"  " + "Price: " + select.getEntree().price);
				entreeText.setEditable(false);
				detailFrame.add(entreeText);

				sideText = new JTextArea();
				sideText.setBounds(100, 110, 400, 75);
				sideText.setLineWrap(true);
				sideText.setText(select.getSide().name + "\n" + select.getSide().description +  "\n" + "Calories: " + select.getSide().calories +
						"  " + "Price: " + select.getSide().price + "---- Included with Entree" );
				sideText.setEditable(false);
				detailFrame.add(sideText);

				saladText = new JTextArea();
				saladText.setBounds(100, 220, 400, 75);
				saladText.setLineWrap(true);
				saladText.setText(select.getSalad().name + "\n" + select.getSalad().description + "\n" + "Calories: " + select.getSalad().calories +
						"  " + "Price: " + select.getSalad().price);
				saladText.setEditable(false);
				detailFrame.add(saladText);

				dessertText = new JTextArea();
				dessertText.setBounds(100, 330, 400, 75);
				dessertText.setLineWrap(true);
				dessertText.setText(select.getDessert().name + "\n" + select.getDessert().description + "\n" + "Calories: " + select.getDessert().calories +
						"  " + "Price: " + select.getDessert().price);
				dessertText.setEditable(false);
				detailFrame.add(dessertText);

				calLabel = new JLabel("Total Calories: ");
				calLabel.setBounds(20,420,100,50);
				detailFrame.add(calLabel);

				priceLabel = new JLabel("Total Price: $");
				priceLabel.setBounds(270,420,100,50);
				detailFrame.add(priceLabel);

				calText = new JTextField("" + select.totalCalories());
				calText.setBounds(120,430,100,30);
				calText.setEditable(false);
				detailFrame.add(calText);

				priceText = new JTextField("" + select.totalPrice());
				priceText.setEditable(false);
				priceText.setBounds(360,430,100,30);
				detailFrame.add(priceText);
			}
		});

		mainFrame.add(detailsButton);


		deleteButton = new JButton("Delete all");
		deleteButton.setBounds(462,450,100,30);
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				// Convenient sub method that performs the task
				listModel.removeAllElements();

			}
		});

		mainFrame.add(deleteButton);

		saveButton = new JButton("Save to File");
		saveButton.setBounds(570,450,105,30);
		saveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				// Create new instance of FileManager with to call from
				FileManager saveToFile = new FileManager();
				ArrayList<Menu> saveMenu = new ArrayList<Menu>();

				for(int i=0; i<listModel.size(); i++) {
					saveMenu.add(listModel.get(i));
				}
				saveToFile.writeMenus("cd ..\\..\\data\\menus.txt", saveMenu);

			}
		});

		mainFrame.add(saveButton);
		
		/*
		 * Generating menus to have before the user begins to generate menu from the button
		 * Saving those menus to an array and then adding the Jlist with the array passing through
		 */

		
		mainFrame.repaint();


	}

	/**
	 * Method main
	 * The main driver method that creates the an instance of MenuManagerGUI, launched application
	 * @param String[] args - ....
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuManagerGUI app = new MenuManagerGUI(); 

		/*
		 * Oh even though it says its unused -- Because you are activating 
		 * the constructor you are activating the class itself.  
		 */
	}



}
