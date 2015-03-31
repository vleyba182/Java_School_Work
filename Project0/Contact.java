//this will store a contact in our list
public class Contact {

	// creates an instance of phone
	private Phone_Number phone;
	private String firstName, lastName;
	//used to store the value (gpa or hours)
	private Data data;
	private int id;
	//address object to hold all details
	private StudentAddress address;
		
	//getter and setter methods
	public StudentAddress getAddress() {
		return address;
	}
	//setter
	public void setAddress(StudentAddress address) {
		this.address = address;
	}
	//getter
	public String getFirstName() {
		return firstName;
	}
	//setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Setter
	public void setData(Data data){
		this.data = data;
	}
	//getter
	public String getLastName() {
		return lastName;
	}
	//getter	
	public Data getData(){
		return data;
	}
	
	//setter
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//getter
	public Phone_Number getPhone() {
		return phone;
	}
	
	//setter
	public void setPhone(Phone_Number phone) {
		this.phone = phone;
	}
	
	//setter
	public void setId(int idNew){
		id = idNew;
	}
	
	//getter
	public int getId(){
		return id;
	}
	
	//	this will return a string representation of this object so that 
	//we can print it to the console easily
	public String toString(){
		return "ID: " + id + "\n" + firstName + " " +lastName +"\n" + data.toString() + "\nPHONE: " + phone.toString() + "\nADDRESS: " + address;
	}
}