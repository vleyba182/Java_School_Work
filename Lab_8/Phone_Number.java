public class Phone_Number {

	private int area;
	private int prefix;
	private int suffix;

	//constructor
	public Phone_Number(int area, int prefix, int suffix) {

		this.area = area;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	
	//getter methods
	public int getArea() {
		return area;
	}

	public int getPrefix() {
		return prefix;
	}
	
	public int getSuffix() {
		return suffix;
	}

	//returns the right String representation of the phone number
	public String toString() {
		return String.format("(%d)%d-%d", area, prefix, suffix);
	}
}