//Student Address class
public class StudentAddress {
	
	//Declare Variables
	private String streetAddress, city, state;
	private int zipCode;
	
	//getter and setters	
	public String getCity() {
		return city;
	}
	//Setter
	public void setCity(String city) {
		this.city = city;
	}
	//getter
	public String getState() {
		return state;
	}
	//setter
	public void setState(String state) {
		this.state = state;
	}
	//getter
	public String getStreetAddress() {
		return streetAddress;
	}
	//setter
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	//getter
	public int getZipCode() {
		return zipCode;
	}
	//setter
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	//this will return a string representation of this object so that 
	//we can print it to the console easily
	public String toString(){
		return "Street: " + streetAddress + ", CITY: " + city + ", STATE: " + state + ", ZIP: " + zipCode;
	}
}