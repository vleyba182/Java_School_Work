//this represents a node in the double linked list
public class LinkedListNode {
	//decalre instance of contact
	private Contact contact;
	//reference to the next and previous elements in the list
	private LinkedListNode next;
	private LinkedListNode previous;
	
	
		//constructor
		public LinkedListNode( Contact c ){
		//store the object
		contact = c;
		}
	
		//returns a String representation of the object
		public String toString(){
		return contact.toString();
		}

		//getters and setters
		public Contact getContact() {
		return contact;
		}
		
		//setter
		public void setContact(Contact c) {
		this.contact = c;
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
