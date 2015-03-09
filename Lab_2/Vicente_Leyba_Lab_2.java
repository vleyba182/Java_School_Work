/**
* This is a calculator application written for CS Lab 2 Section 2 by Vicente Leyba.  The calculator takes floating expression and integer expression entered by the user and outputs the expression and result on the screen
*/


//The imports below are for I/O 
import java.util.*;
import java.io.*; 

// Declare a public class
public class Vicente_Leyba_Lab_2 { 

	public static void main (String[] args){

	//Declare Variables
	float float0, float1;
	int int0, int1;
	String mathSign;
	char charMathSign;
	
	Scanner sc = new Scanner(System.in);
	
	
	//Ask user to Enter FLoating-Point Number Expression
	System.out.println("Enter a simple floating-point expression: "); 

	//declare variables
	float0 = sc.nextFloat();
	mathSign = sc.next();
	float1 = sc.nextFloat();

	//Depending on what the math expression is entered by the user the if statement will deteremnine what the user entered and 				output the right result
	if(mathSign.equals("+"))
	{
	System.out.println(float0 + " + " + float1 + " = " + (float0 + float1));	
	}
	
	else if(mathSign.equals("-"))
	{
	System.out.println(float0 + " - " + float1 + " = " + (float0 - float1));
	}
	
	else if(mathSign.equals("*"))
	{
	System.out.println(float0 + " * " + float1 + " = " + (float0 * float1));
	}
	
	else if(mathSign.equals("/"))
	{
	System.out.println(float0 + " / " + float1 + " = " + (float0 / float1));
	}

	//Ask the user to enter a simple floating point expression
	System.out.println("Enter a simple integer expression: ");
	
	//Declare the variables
	int0 = sc.nextInt();
	mathSign = sc.next();
	charMathSign = mathSign.charAt(0);
	int1 = sc.nextInt();
	
	//starts switch statement
	switch (charMathSign) 
		
		
		//Depending on what the math expression is entered by the user the switch statement will deteremnine what the user entered and output the right result
		{
		case '+': 
		System.out.println(int0 + " + " + int1 + " = " + (int0 + int1));
		break;
		
		case '-':
		System.out.println(int0 + " - " + int1 + " = " + (int0 - int1));
		break;
		
		case '*':
		System.out.println(int0 + " * " + int1 + " = " + (int0 * int1));
		break;
		
		case '/':
		System.out.println(int0 + " / " + int1 + " = " + (int0 / int1));
		break; 
		}		
}
}