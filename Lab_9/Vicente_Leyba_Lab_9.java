//The imports below are for I/O
import java.util.*;
import java.io.*;

// Declare a public class
public class Vicente_Leyba_Lab_9 {
	//Main
	public static void main(String[] args) {
	//declare variables
	double totalMoneyInserted = 0, add25 = .25, add10 = .10, add5 = .05, change0, change1, subtract60 =.60;
	int menuOption0, menuOption1, menuOption2;

	//decalre scanner
	Scanner sc = new Scanner(System.in);
	
	//Will keep displaying main menu until user enters 2
	do {	
		System.out.println("------Soda Machine------ \nSodas $0.60");
		System.out.println("1.Purchase Soda");
		System.out.println("2.Quit Program");
		menuOption0 = sc.nextInt();	
		//If user enters 1 they will be asked to purchase soda with either coins or $1 BILL
		if (menuOption0 == 1) {
		System.out.println("1.Insert $1.00");	
		System.out.println("2.Insert Coins");	
		menuOption1 = sc.nextInt();	
		
		switch (menuOption1) {
		//IF USER decdes to purchase soda with $1 case 1 will handle this
		case 1:
			System.out.println("SODA DISPENSED!");
			System.out.println("Your Change is:\n"+ "$"+add25+"\n"+"$"+add10+"0"+"\n"+"$"+add5);
			break;
		//Case 2 will run when user enters 2 and ask user to enter coins until it is enough to purchase soda
		case 2:
		//do while loop will run until user enters enought money to dispense soda
		do {
			//menu ask user what king of coin they will enter
			System.out.println("1.Insert $0.25");
			System.out.println("2.Insert $0.10");
			System.out.println("3.Insert $0.05");
			menuOption2 =sc.nextInt();
			//will add 25 cents if user enters 1
			if (menuOption2 ==1){
				totalMoneyInserted = totalMoneyInserted + add25;	
				System.out.println("Total Money Inserted:"+totalMoneyInserted);
			}
			//will add 10 cents if user enters 2
			else if (menuOption2 ==2){
				totalMoneyInserted = totalMoneyInserted + add10;
				System.out.println("Total Money Inserted:"+totalMoneyInserted);
			}
			//will add 5 cents if user enters 2		
			else if (menuOption2 ==3){
				totalMoneyInserted = totalMoneyInserted + add5;
				System.out.println("Total Money Inserted:"+totalMoneyInserted);
			}
			
		} while (totalMoneyInserted < .60);
			//Display to user they have purchased soda
			System.out.println("SODA DISPENSED!");
			//Dispense change to user
			if (totalMoneyInserted == .6){
				System.out.println("Your Change is:\n"+ "$0.00");
			}
			//dispense change to user
			else if (totalMoneyInserted == .65){
				System.out.println("Your Change is:\n"+ "$\n"+add5);
			}
			//Dispense change to user
			else if (totalMoneyInserted == .7){
				System.out.println("Your Change is:\n"+ "\n$"+add10+"0");
			}
			//Dispense change to user
			else if (totalMoneyInserted == .75){
				System.out.println("Your Change is:\n"+ "$"+add10+"0"+"\n$"+add5);
			}
			//Dispense change to user
			else if (totalMoneyInserted == .80){
				System.out.println("Your Change is:\n"+"$"+add10+"0"+"\n$"+add10+"0");
			}
			//Dispense change to user
			else if (totalMoneyInserted == .85){
				System.out.println("Your Change is:\n"+"\n$"+add25);
			}
			//need to set money inserted back to 0 so next person buying a soda pays correct amount
			totalMoneyInserted = 0;	
			break;	
		}
	}//if user enters 2 program will terminate
	} while (menuOption0 != 2);	System.out.println("Fine Dont Buy A Soda");
	}
}