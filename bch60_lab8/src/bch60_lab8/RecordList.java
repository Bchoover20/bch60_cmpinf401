package bch60_lab8;

import java.awt.List;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class RecordList {


	/**
	 * The node class represents a single list element with a data item and
	 * reference to the next node in the list
	 */
	
	private class Node { 
		
		
		// data held by this node
		Record data;
		// reference to the next node in the list, or null if there is no such node
		// (i.e. this is the last node in the list)
		Node next;
		
		/**
		 * Creates a node with the given data
		 * @param dataValue data to hold in this node
		 */
		
	
		public Node(Record dataValue) {
			next = null ;
			data = dataValue;

		}
		
		// node needs its on getters and setters
		public Node getNext() {
			// This is the link to the next node I dont know how thats possible since next is null
			return next;
			
		}
		// Getter for the data associated with a node
		public Record getData() {
			return data;
		}
		

		// Setter for the data associated with a node
		public void setData(Record dataValue) {
			data = dataValue;
		}
		// another Node constructor if we want to specify the node to point to. 
		// dont know if  I need to use this or not 
		
		
		
		public void setNext(Node nextValue) {
			
			next = nextValue;
		}
	}
	
	private Node head;
	
	/**
	 * Initializes a linked list with a single "dummy" node (contains no real data)
	 * to simplify code for the case of an empty list
	 * @param nx 
	 */
	public RecordList() {
		// dummy linked list created, somehow I need to insert something before the dummy I think?
		head = new Node(null);
	}
	
	/**
	 * Finds the index of the record with the given name in the list
	 * @param name name to search for
	 * @return index of name in list if found, -1 otherwise
	 */
	public int indexOf(String name) {
		
		Node currentNode = head;
		int index = 0;
		
		// traverse through the list looking for our target node
		while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
			currentNode = currentNode.next;
			index++;
			System.out.println(currentNode.next.data.getName());
		}
		
		// we got to the end of the list without finding our target
		if (currentNode.next == null) return -1;
		else return index;
	}
	
	/**
	 * Adds the given item to the list, sorted by time (lowest to highest)
	 * @param data data to add
	 * @return the index the data was inserted at
	 */
	
	int index1=0;
	int counter1=0;
	int counter2=0;
	int rightSpot=0;
	ArrayList<Integer> timeData = new ArrayList<Integer>();
	
	public int add(Record data) {
		
		
		// Insertion base code that is provided in the google slides
		// Creating a type Node object that contains the data of the newest userInput that has been passed through
		Node tempNode = new Node(data);
		Node currentNode = head;
		// starting at the head node, crawl to the end of the list
		
		// Creating console object
		Console cnsl = System.console();
		
		while (cnsl != null) {
			String tempLine = cnsl.readLine();
			
			String[] splitLine = tempLine.split(",");
			
			// parse that int 
			int tempInt = Integer.parseInt(splitLine[1]);
			// Adding the time that has been split from splitLine
			timeData.add(tempInt);
			
			for (int element : timeData) {
				
				if (timeData.get(element) < timeData.get(element+1)) {
					rightSpot = element;
				}
			}
		}
		
		while (currentNode.getNext() != null && counter1 < rightSpot) {
				currentNode = currentNode.getNext();
				counter1++;
			
		}	
		
			currentNode.setNext(tempNode);
			index1++;
		
		return index1;
	}
	
	/**
	 * Prints out each record in the list, one per line
	 */
	public void print() {
		// note that we start from our first *real* node in this case (head.next, not
		// our dummy head)
		Node currentNode = head.next;
		while (currentNode != null) {
			System.out.println(currentNode.data.getName() + ", " + currentNode.data.getTime());
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	/**
	 * Write out the contents of the linked list to the given file, one entry per line
	 * @param filename name of the file to write the list to
	 */
	public void writeToFile(String filename) {
		// Add your own code here to write out the list contents to a file. You can use
		// our file writing examples and the print() method above as a guide.
	}



}
