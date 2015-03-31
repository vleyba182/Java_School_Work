//this is the class that represents a phone number
public class Phone_Number {

	//declare variables
	private int area;
	private int prefix;
	private int suffix;

	//constructor
	public Phone_Number(int area, int prefix, int suffix) {
		this.area = area;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	//get area
	public int getArea() {
		return area;
	}
	//set area code
	public void setArea(int area) {
		this.area = area;
	}
	//get prefix
	public int getPrefix() {
		return prefix;
	}
	//set prefix
	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}
	//getter
	public int getSuffix() {
		return suffix;
	}
	//setter
	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}

	//returns the right String representation of the phone number
	public String toString() {
		return String.format("(%d)%d-%d", area, prefix, suffix);
	}
}