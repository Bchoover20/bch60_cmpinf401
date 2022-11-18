package bch60_lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

		public Node(Record dataValue) {
			next = null ;
			data = dataValue;
		}

		// node needs its on getters and setters
		public Node getNext() {
			// This is the link to the next node I don't know how thats possible since next is null
			return next;

		}
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
	 * Adds the given item to the linked list, sorted by time (lowest to highest)
	 * @param Record data -- 
	 * @return the index the data was inserted at
	 */
	int index1=0;
	int counter1=0;

	public int add(Record data) {

		// Declaring current Node of type Node that is set to the start of the Node
		Node currentNode = head;

		// null checker to make sure the head of the linked list has data, so you are not just setting currentNode to null
		if (currentNode == null) {
			this.head = new Node(data);
			return 0; // stopping add method because this adds the data to list so no need to go further
		}

		/**
		 * Linked List iterator, checks for null AND if the time passed through is greater than the next time in the list then it will keep doing that until the condition is false
		 * What this accomplishes is that you always have the right starting place for the below code block to execute properly. 
		 * For instance, if I pass through 4 in a list with 5 and 6, the while loop will not execute since 4 is the fastest time and is not larger than the next fastest time 
		 */
		while (currentNode.getNext() != null && data.getTime() > currentNode.next.data.getTime()) {
			currentNode = currentNode.getNext();
		}	
		/**
		 *  This code block works as follows:
		 *  A temporary comparison node is declared and set to the next node in the list based off of while loop 
		 *  Then currentNode.next is then changed to now contain the new data that is being added, 
		 *  Finally the node after currentNode.next is set to tempNode since that is where is should be in the list
		 */
		Node tempNode = currentNode.next;
		currentNode.next = new Node(data);
		currentNode.next.next = tempNode;

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
	
		String path = filename;
		
		try {
			// I guess its only meant for one use, ask Nemo before you spend too much time with it -- it was fw.close()
			
			FileWriter fw = new FileWriter(path); 
			BufferedWriter bw = new BufferedWriter(fw);
			
			Node currentNode = head.next;
			while (currentNode != null) {
				bw.write(currentNode.data.getName() + ", " + currentNode.data.getTime());
				bw.write("\n");
				currentNode = currentNode.next;
			}
			System.out.println("it ran");
			bw.close();
			// WHY does this code break the program: fw.close(); gives error message of "stream closed" 
			// this is gonna cause a memory leak though ask Nemo
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		
		  }
		
		
		
	}
	


}
