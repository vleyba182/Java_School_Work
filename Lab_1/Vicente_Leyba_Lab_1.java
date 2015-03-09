/**
* This is a terminal calculator application written for CS111 Lab 1 Section 2 by Vicente Leyba
*/

//Import the Java Packages
import java.util.*;
import java.io.*;
import java.text.*;

//Declare a public class that must match the name of the file
public class Vicente_Leyba_Lab_1 {


	public static void main (String[] args){
		outputNameLabInfo();
		
		//Declare float variables
		float a, b;
		
		//Declare int variables
		int c, d;
		
		Scanner sc = new Scanner(System.in);
		
		//Asking using to enter floating point numbers
		System.out.println("Enter a floating-point number: ");
		a = sc.nextFloat();
		
		//Code asking for the user to enter the next float number		
		System.out.println("Enter another floating-point number: ");
		b = sc.nextFloat();
		
		System.out.println("Floating-Point:");
		
		//Addition of Floating-Point Numbers
		float addAnswerF = a + b;
		System.out.println(a + "+" + b + "=" + (a + b));
		
		//Subtraction of Floating-Point Numbers
		float subtractAnswerF = a - b;
		System.out.println(a + "-" + b + "=" + (a - b));
		
		//Multiplication of Floating-Point Numbers
		float multiplyAnswerF = a* b;
		System.out.println(a + "*" + b + "=" + (a * b));
		
		//Division of Floating-Point Numbers
		float divideAnswerF = a / b;
		System.out.println(a + "/" + b + "=" + (a / b));
		
		//Asking user to enter Integers
		System.out.println("Enter Integer C: " );
		c = sc.nextInt();
		
		//Code asking user to enter next integer
		System.out.print("Enter Integer D: " );
		d = sc.nextInt();
		
		System.out.println("Integers:");
		
		//Addition of Integers
		int addAnswer = c +d;
		System.out.println(c + "+" + d + "=" + (c + d));
		
		//Subtraction of Integers
		int subtractAnswer = c -d;
		System.out.println(c + "-" + d + "=" + (c - d));
		
		//Multiplication of Integers
		int multiplyAnswer= c *d;
		System.out.println(c + "*" + d + "=" + (c * d));
		
		//Division of Integers
		int divideAnswer= c /d;
		System.out.println(c + "/" + d + "=" + (c / d));

	}
	
	//Output of name and lab section 
	private static void outputNameLabInfo(){
		System.out.println("Name: Vicente Leyba");
		System.out.println("Lab Section: 02");
		
	//Output the Date
	Date				today;
	SimpleDateFormat	sdf;
	
	today = new Date ();
	sdf = new SimpleDateFormat("yyyyMMdd");
	
	//The Code below displays the date
	System.out.println(sdf.format(today));
	
	}
}