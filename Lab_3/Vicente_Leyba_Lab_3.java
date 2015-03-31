/**
* This is a calculator application written for CS Lab 3 Section 3 at New Mexico Tech by Vicente Leyba. September 28, 2007. The calculator takes floating expression and integer expression entered by the user and outputs the expression and result on the screen
*/

//

//The imports below are for I/O
import java.util.*;
import java.io.*; 

//Declare a class
public class Vicente_Leyba_Lab_3{
		
	//make the doMath method
	static int doMath(char op,int numa, int numb){
		int return_val;
		return_val = 0;
		switch (op)	
		
		//These switch statements determines what input the user enters and computes it.
		{
		case '+': 
		return_val = numa + numb;
		break;
		
		case '-': 
		return_val = numa - numb;
		break;
		
		case '*': 
		return_val = numa * numb;
		break;
		
		case '/': 
		return_val = numa / numb;
		break;
		
		//if the user enters an exponent expression the exponent method will handle the input.
		case '^':
		return_val = exponent(numa, numb);
		break;
		
		//Declare a default statement if the user enters a invalid expression and return number to 0
		default:
		return_val = 0;
		System.out.println("You have entered an Invalid Operation");
		}
		
		return return_val;
		
}
						
	//Make the exponent method
	static int exponent(int a, int b){
		int return_val = 1;	
		
		//This method will handle an exponent expression
		if (b < 0) 
		{
		System.out.println("Error: Exponent Must Be >=0");
		return_val = 1;
		}
		
		else if (b == 0) 
		{
		return_val = 1;
		}
		
		else if (b == 1) 
		{
		return_val = a;
		}
		
		else 
		{
		return_val = a * exponent (a, b-1);
		}
		return (return_val);
		}	
	
//Declare main		
public static void main(String[] args){
	
	//Set up Scanner to take input from the user
	Scanner sc = new Scanner(System.in);

	//Declare the variables
	int inta, intb;
	String op;	
	char charop;
	
	//Ask the user to input an integer expression
	System.out.println ("Enter a simple integer expression:");	
	
	//Assing values entered by the user
	inta = sc.nextInt();
	op = sc.next();
	charop = op.charAt(0);
	intb = sc.nextInt();
	
	
	//Present the output to the user
	System.out.println(inta + op + intb + "=" +doMath(charop, inta, intb));
	}
	
}
	