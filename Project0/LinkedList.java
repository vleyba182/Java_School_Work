//this is a double linked list
//this is a double linked list
public class LinkedList {

	//the head and the tail of the list
	private LinkedListNode first;
	private LinkedListNode last;
	
	
	//the constructor of the class
	public LinkedList(){
		//initialize the variables
		first = null;
		last = null;
	}
	
	//returns a String representation of the object 
	public String toString(){
	
		//if empty list we need to tell user
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
	
	
	//we call this to add a new element to the list at the end
	public void addToList( Contact contact ){
		//create the node to store it
		LinkedListNode newNode = new LinkedListNode(contact);
		
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
	public void deleteNode( Contact contact ){
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
			if( temp.getContact().equals(contact) ){				
				
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
				//if none of the above, link together the previous with the next node
				//first the previous to next link
				temp.getPrevious().setNext(next);
				//then the next to the previous link
				next.setPrevious(temp.getPrevious());
				return;
			}	
			//move to the next element
			temp = temp.getNext();
		}		
	}
	
	//prints the list
	public void printList(){
		LinkedListNode temp = first;
		
		System.out.print("----PRINT----");
				
		//if empty list
		if( first == null )
			System.out.println("List is empty");
		
		//will print each element in the list
		while( temp != null ){
			System.out.print( "\n" + temp.toString());
			//go to the tail of the list
			temp = temp.getNext();
		}		
	}
	
	
	//counts the number of items in the list
	public int getNumberOfItems(){
		//if the list is empty
		if( first == null )
			return 0;
		
		LinkedListNode temp = first;
		int counter = 0;
		
		//will print each element in the list
		while( temp != null ){
			counter++;			
			temp = temp.getNext();
		}
		
		return counter;
	}
	//getter method
	public LinkedListNode getFirst(){
		return first;
	}
}