/**
 * This is the Contact base class that all other Contact classes will extend (aka subclass)
 * Any public or protected methods or instance variables that this class declares will be available
 * to any subclasses
 */
public class Contact {
	
	//All Contacts have a first name so we declare it in superclass
	protected String firstName = null;
	//All Contacts have a last name so we declare in superclass
	protected String lastName = null;
	//All Contacts have a phone number so we declare in superclass
	protected Phone_Number phone = null;
	
	//Declare zero arg constructor
	public Contact(){	
	}
	
	//Declare constructor that actually does some work
	public Contact(String fName, String lName, Phone_Number phNo){
		this.firstName = fName;
		this.lastName = lName;
		this.phone = phNo;
	}	
	
	
	public void setFirstName(String fname){		this.firstName = fname;	}
	
	public void setLastName(String lname){		this.lastName = lname;	}
	
	public void setPhone(Phone_Number phNo){		this.phone = phNo;	}

	public String toString(){
		return "Contact"+ "\n" + firstName + " " + lastName + "\n" + phone.toString();
	}
}