package bch60_lab8;


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
	
	public int add(Record data) {
			
		// Insertion base code that is provided in the google slides
		// Creating a type Node object that contains the data of the newest userInput that has been passed through
		Node currentNode = head;
		
		// null checker to make sure the head of the linked list has data, so you are not just setting currentNode to null
		if (currentNode == null) {
			this.head = new Node(data);
			return 0; // stopping add method because nothing else will work after the if-conditional
		}
		// Remember to use the object that is passed into the method if you are stuck 
		
		
		// Linked List iterator, that upon meeting parameters will iterate through the list until 
		while (currentNode.getNext() != null && data.getTime() < currentNode.next.data.getTime()) {
				currentNode = currentNode.getNext();
				System.out.println(data.getTime());
			
		}	
		/**
		 *  This code block works as follows:
		 *  A temporary comparrison node is declared and set to the next node in the list
		 *  The next node of currentNode is than changed to a node data 
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
		// Add your own code here to write out the list contents to a file. You can use
		// our file writing examples and the print() method above as a guide.
	}



}
