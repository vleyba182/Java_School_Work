//this is a double linked list


public class LinkedList {

	//these variables are the head and the tail of the list
	private LinkedListNode first;
	private LinkedListNode last;
	
	//the constructor of the class
	public LinkedList(){
		//initialization
		first = null;
		last = null;
	}
	
	//returns a String representation of the object
	public String toString(){
	
		//if empty list
		if( first == null )
			return "<empty>";
		
		LinkedListNode temp = first;
		String result = "";
		
		//will print each element in the list
		while( temp != null ){
			result = result + " " + temp.toString() + ",";			
			temp = temp.getNext();
		}
		
		return result;
	}
	
	//called to add a new element to the list, at the end of it
	public void addToList( int value ){
		//create the node to store it
		LinkedListNode newNode = new LinkedListNode(value);
		
		//if no elements in the list
		if( first == null ){
			//this will be the head and tail one
			first = newNode;
			last = newNode;
		}
		//else add it to the tail
		else{
			//set the links
			last.setNext( newNode );
			newNode.setPrevious(last);
			//new node becomes the last one
			last = newNode;
		}
	}
	
	//deletes the node with the specified value
	public void deleteNode( int value ){
		LinkedListNode temp = first;
		
		//if the list is empty
		if( first == null )
			//do nothing
			return;

		//if there is only one element in the list
		if( first == last ){
			//clear the list
			first = null;
			last = null;
			return;
		}

		//check each element in the list
		while( temp != null ){
			//if found
			if( temp.getValue() == value ){				
				
				//if the node to be deleted is the head of the list
				if( temp == first ){
					//next one becomes the first one
					first = first.getNext();
					//cut off the link to the old first node so that it is lost
					first.setPrevious(null);
					return;
				}
				
				//if the node to be deleted is the tail of the list
				if( temp == last ){
					//previous one becomes the last one
					last = last.getPrevious();
					//cut off the link to the old last node so that it is lost
					last.setNext(null);
					return;
				}

				//reference to the next node
				LinkedListNode next = temp.getNext();
				//if none of the above,we simply by-pass the node by linking together the previous with the next node
				//first the previous to next link
				temp.getPrevious().setNext(next);
				//then the next to the previous link
				next.setPrevious(temp.getPrevious());
				
				//end this method
				return;
			}	
			//move to the next element
			temp = temp.getNext();
		}		
	}
	
	//prints the list
	public void printBackwards(){
		LinkedListNode temp = last;
		
		System.out.println("-----Print The List Backwards-----");
				
		//if empty list
		if( first == null )
			System.out.println("List is empty");
		
		//will print each element in the list
		while( temp != null ){
			System.out.print( " " + temp.toString() + ",");
			//go to the head of the list
			temp = temp.getPrevious();
		}		
	}
}
