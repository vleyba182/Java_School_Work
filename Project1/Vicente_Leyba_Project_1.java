//The imports below are for I/O
import java.util.*;
import java.io.*;

// Declare a public class
public class Vicente_Leyba_Project_1 {

	public static void main(String[] args) {

		try {
			// Create scanner
			Scanner sc = new Scanner(System.in);

			// the 2 matrix we have and handle in the programs
			Matrix a = new Matrix(0, 0);
			Matrix b = new Matrix(0, 0);

			// Declare variable + initialise
			int menuOption = 0;

			// Get menu to display
			do {
				System.out.println("1) Read A as sparse matrix");
				System.out.println("2) Read B as sparse matrix");
				System.out.println("3) Read A as full matrix");
				System.out.println("4) Read B as full matrix");
				System.out.println("5) Add A with B (result saved to add.txt)");
				System.out.println("6) Multiply A with B (result saved to multiply.txt)");
				System.out.println("7) Write A to file as sparse matrix");
				System.out.println("8) Write B to file as sparse matrix");
				System.out.println("9) Write A to file as full matrix");
				System.out.println("10) Write B to file as full matrix");
				System.out.println("11) Print A");
				System.out.println("12) Print B");
				System.out.println("13) EXIT");
				System.out.println("Selection:");

				menuOption = Integer.parseInt(sc.nextLine());

				String filename = null;
				
				// Implement switch statement to
				switch (menuOption) {

				//Read A as sparse matrix
				case 1:
					System.out.print("Filename to read from: ");
					filename = sc.nextLine();
					BufferedReader in = new BufferedReader(new FileReader(filename));
					a.readSparse(in);
					break;
					
				//Read B as sparse matrix
				case 2:
					System.out.print("Filename to read from: ");
					filename = sc.nextLine();
					in = new BufferedReader(new FileReader(filename));
					b.readSparse(in);
					break;
				//Read A as full matrix
				case 3:
					System.out.print("Filename to read from: ");
					filename = sc.nextLine();
					in = new BufferedReader(new FileReader(filename));
					a.readFull(in);
					break;					
				//Read B as full matrix					
				case 4:
					System.out.print("Filename to read from: ");
					filename = sc.nextLine();
					in = new BufferedReader(new FileReader(filename));
					b.readFull(in);
					break;
				//Add A with B
				case 5:
					BufferedWriter out = new BufferedWriter(new FileWriter("add.txt"));
					a.add(b).writeFull(out);					
					break;
				//Multiply A with B
				case 6:
					out = new BufferedWriter(new FileWriter("multiply.txt"));
					a.multiply(b).writeFull(out);
					break;
				//Write A to file as sparse matrix
				case 7:
					System.out.print("Filename to write to: ");
					filename = sc.nextLine();
					out = new BufferedWriter(new FileWriter(filename));
					a.writeSparse(out);
					break;
				//Write B to file as sparse matrix
				case 8:
					System.out.print("Filename to write to: ");
					filename = sc.nextLine();
					out = new BufferedWriter(new FileWriter(filename));
					b.writeSparse(out);
					break;
				//Write A to file as full matrix
				case 9:
					System.out.print("Filename to write to: ");
					filename = sc.nextLine();
					out = new BufferedWriter(new FileWriter(filename));
					a.writeFull(out);
					break;
				//Write B to file as full matrix
				case 10:
					System.out.print("Filename to write to: ");
					filename = sc.nextLine();
					out = new BufferedWriter(new FileWriter(filename));
					b.writeFull(out);
					break;
				//print matrix A
				case 11:
					a.printMatrix();
					break;
				// print matrix B
				case 12:
					b.printMatrix();
					break;					
				// end program
				case 13:
					System.exit(0);
					break;
				}
			} while (true);
			// handle exception
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}