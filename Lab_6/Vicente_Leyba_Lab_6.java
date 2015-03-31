 /**This code is fro Vicente Leyba CS111 Lab 6 section 3**/

import java.util.Scanner;

public class Vicente_Leyba_Lab_6 {

	public static void main(String[] args) {
		// instantiate the list
		LinkedList list = new LinkedList();
		// used to read from the console
		Scanner sc = new Scanner(System.in);

		// this will go on and on until user chooses to quit
		while (true) {
			try {
				// print the menu to the user
				System.out.println("\n\n-------MENU--------");
				System.out.println("1. Enter a number");
				System.out.println("2. Delete a number");
				System.out.println("3. Show all numbers");
				System.out.println("4. Print backwards");
				System.out.println("5. End program");
				System.out.print("Your option: ");

				// read input
				int option = Integer.parseInt(sc.nextLine());
				
				if( option == 1 ){
					//add a number
					System.out.print("Enter value: ");
					int number = Integer.parseInt(sc.nextLine());
					//store it to the list
					list.addToList(number);
					//print the content of the list
					System.out.println("\nList content: " + list.toString());
				}
				else					
					if( option == 2 ){
						System.out.print("Enter value: ");
						int number = Integer.parseInt(sc.nextLine());
						//delete it from the list
						list.deleteNode(number);
						//print the content of the list
						System.out.println("\nList content: " + list.toString());
					}
					else
						if( option == 3 ){
							//calls the toString() method and will print the list from head to tail 
							//print the content of the list
							System.out.println("\nList content: " + list.toString());
						}
						else
							//prints the list backwards
							if( option == 4 ){
								list.printBackwards();
							}
							else
								//end application
								if( option == 5 ){
									System.exit(0);
								}
								else
									System.out.print("Invalid option! Choose one in range 1-5!");
				
			// handle exception
			} catch (Exception ex) {
				//print message
				System.out.println("ERROR! Invalid input: " + ex );
			}
		}
	}
}