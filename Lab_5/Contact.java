//
public class Contact {

	// creates an instance of phone
	private Phone_Number phone;
	private int studentId;
	//used to store the value (gpa or hours)
	private Data data;

	// Constructors
	public Contact(int studentId) {
		this.studentId = studentId;
	}

	//setter methods 
	public void setPhone(Phone_Number phone) {
		this.phone = phone;
	}
		
	public void setData(Data data){
		this.data = data;
	}
	
	//this will return a string representation of this object so that 
	//we can print it to the console easily
	public String toString(){
		return studentId  + "\n" + data.toString() + "\n" + phone.toString();
	}
}