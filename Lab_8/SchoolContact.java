class SchoolContact extends Contact{
	
	// creates an instance of phone
	private int studentId;
	//used to store the value (gpa or hours)
	private Data data;
 
	//Another constructor
	public SchoolContact(String fName, String lName, Phone_Number phNo){
		super(fName, lName, phNo);
	}	
	//zero arguement constructor
	public SchoolContact(){	
	}

	//Set Data	
	public void setData(Data data){
		this.data = data;
	}
	//set data 
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	
	public int getId(){
		return studentId;
	}
	
	public Data getData(){
		return data;
	}
	
	//this will return a string representation of this object so that 
	//we can print it to the console easily
	public String toString(){
		return "Student Contact" + "\n" + this.firstName + " " + this.lastName + "\n" + studentId  + "\n" + data.toString() + "\n" + this.phone.toString();
	}
}