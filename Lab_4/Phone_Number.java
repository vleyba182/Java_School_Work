//
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

	//returns the right String representation of the phone number
	public String toString() {
		return String.format("(%d)%d-%d", area, prefix, suffix);
	}
}