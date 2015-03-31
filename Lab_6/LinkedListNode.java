//this represents a node in the double linked list
public class LinkedListNode {
	
	private int value;
	//reference to the next and previous elements in the list
	private LinkedListNode next;
	private LinkedListNode previous;
	
	
		//constructor
		public LinkedListNode( int v ){
		//store the integer value
		value = v;
		}
	
		//returns a String representation of the object
		public String toString(){
		return "" +  value;
		}

		//getters and setters
		public int getValue() {
		return value;
		}
		
		//setter
		public void setValue(int value) {
		this.value = value;
		}

		//getter
		public LinkedListNode getNext() {
		return next;
		}

		//setter
		public void setNext(LinkedListNode next) {
		this.next = next;
		}

		//getter
		public LinkedListNode getPrevious() {
		return previous;
		}

		//setter
		public void setPrevious(LinkedListNode previous) {
		this.previous = previous;
	}	
}
