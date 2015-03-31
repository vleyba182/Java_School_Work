//imports 
import java.io.*;
import java.util.*;


// Declare a public class
public class Vicente_Leyba_Lab_8 {

	public static void main(String[] args) {

		// Create scanner
		Scanner sc = new Scanner(System.in);
		//Declare arraylist to hold school contact
		ArrayList contacts = new ArrayList();
		// Declare variables
		int menuOption, creditHours, area, prefix, suffix, studentId;
		double gpa;
		char studentData, familyRelationOption;
		String menuOption2, menuOption3;
	
		//instance of the current class
		Vicente_Leyba_Lab_8 lab8 = new Vicente_Leyba_Lab_8();
		//load the contacts from the file
		contacts = lab8.loadFromFile("backup.txt");

		// Get menu to display
		do {
			System.out.println("-----MENU-----");
			System.out.println("1) Enter a Student Contact");
			System.out.println("2) Enter a Family Contact");
			System.out.println("3) Enter a Contact");
			System.out.println("4) Display Student Contacts");
			System.out.println("5) Display Family Contacts");
			System.out.println("6) Display Contacts");
			System.out.println("7) Display All Type Of Contacts");
			System.out.println("8) Quit");
			System.out.println("Selection:");

			menuOption = sc.nextInt();
			
			SchoolContact schoolContact = new SchoolContact();
			FamilyContact familyContact = new FamilyContact();
			Contact contact = new Contact();
			// Implement switch statement to
			switch (menuOption) {

			// If user enters 1 to create contact this will be displayed to user
			case 1:
				
				System.out.println("Enter The First Name of The Student");
				schoolContact.setFirstName(sc.next());	
				System.out.println("Enter The Last Name of The Student");
				schoolContact.setLastName(sc.next());
				System.out.println("Enter the Student ID of this person: 900");
				schoolContact.setStudentId(Integer.parseInt("900" + sc.next()));
				
				System.out.println("G)Enter The GPA For This Student");
				System.out.println("H)Enter The Number Of Completed Credit Hours");
				
				menuOption2 = sc.next().toUpperCase();
				studentData = menuOption2.charAt(0);

				// Prompts the user for the next choice
				if (studentData == 'G') {
					System.out.println("GPA: ");
					gpa = sc.nextDouble();
					//create the Data object
					Data data = new Data();
					data.setStudentGPA(gpa);
					//add it to the contact
					schoolContact.setData(data);
				} 
					else if (studentData == 'H') {
						System.out.println("Hours: ");
						creditHours = sc.nextInt();
						//create the Data object
						Data data = new Data();
						data.setStudentCreditHours(creditHours);
						//add it to the schoolcontact
						schoolContact.setData(data);
					} 
						else {
							System.out.println("Invalid Entry");
						}

				System.out.println("Enter The Phone Number of This Student");
				System.out.println("(###)-###-####: ");
				area = sc.nextInt();
				prefix = sc.nextInt();
				suffix = sc.nextInt();
				//create the phone object
				Phone_Number studentPhone = new Phone_Number(area, prefix,	suffix);
				//add it to the Schoolcontact
				schoolContact.setPhone(studentPhone);
				
				//store info in an arraylist
				contacts.add(schoolContact);
				break;
				
			case 2:
				//ask user to enter info for family contact			
				System.out.println("Enter the First Name of The Family Contact");
				familyContact.setFirstName(sc.next());	
				System.out.println("Enter The Last Name of The Family Contact");
				familyContact.setLastName(sc.next());
				System.out.println("Enter The Relationship of This Contact");
				System.out.println("A) SISTER");
				System.out.println("B) BROTHER");
				System.out.println("C) MOTHER");
				System.out.println("D) FATHER");
				System.out.println("E) OTHER");
				menuOption3 = sc.next().toUpperCase();
				familyRelationOption = menuOption3.charAt(0);
				
				if (familyRelationOption == 'A') {
					System.out.println("Relationship: SISTER ");
					familyContact.setRelationType(FamilyContact.RelationType.SISTER);
				} 
					else if (familyRelationOption == 'B') {
					System.out.println("Relationship: BROTHER ");
					familyContact.setRelationType(FamilyContact.RelationType.BROTHER);
					} 
						else if (familyRelationOption == 'C') {
							System.out.println("Relationship: MOTHER ");
							familyContact.setRelationType(FamilyContact.RelationType.MOTHER);
						}
							else if (familyRelationOption == 'D') {
								System.out.println("Relationship: FATHER ");
								familyContact.setRelationType(FamilyContact.RelationType.FATHER);
							}
								else if (familyRelationOption == 'E') {
									System.out.println("Relationship: OTHER ");
									familyContact.setRelationType(FamilyContact.RelationType.OTHER);
								}
							
				System.out.println("Enter The Phone Number of This Contact");
				System.out.println("(###)-###-####: ");
				area = sc.nextInt();
				prefix = sc.nextInt();
				suffix = sc.nextInt();
				//create the phone object
				Phone_Number familyContactNumber = new Phone_Number(area, prefix,	suffix);
				//add it to the familyContact
				familyContact.setPhone(familyContactNumber);
				//store it with the rest of the contacts
				contacts.add(familyContact);
				break;
				
			case 3:
				
				System.out.println("Enter The First Name of The Contact");
				contact.setFirstName(sc.next());	
				System.out.println("Enter The Last Name of The Contact");
				contact.setLastName(sc.next());
				System.out.println("Enter The Phone Number of This Contact");
				System.out.println("(###)-###-####: ");
				area = sc.nextInt();
				prefix = sc.nextInt();
				suffix = sc.nextInt();
				//create the phone object
				Phone_Number contactNumber = new Phone_Number(area, prefix,	suffix);
				//add it to the contact
				contact.setPhone(contactNumber);
				contacts.add(contact);
				break;
				
			case 4:
			
				System.out.println("-----All Student Contacts-----");
				//print each stored student contact
				for( int i = 0 ; i < contacts.size() ; i++ )
					if(contacts.get(i) instanceof SchoolContact ) 
						System.out.println( (i+1) + ". " + contacts.get(i).toString() + "\n");
				break;
			
			case 5:
			
				System.out.println("-----All Family Contacts Stored-----");
				//prints each stored family contact
				for( int i = 0 ; i < contacts.size() ; i++ )
					if(contacts.get(i) instanceof FamilyContact ) 
						System.out.println( (i+1) + ". " + contacts.get(i).toString() + "\n");
				break;
				
			case 6:
			
				System.out.println("-----All Contacts Stored-----");
				//prints each stored contact
				for( int i = 0 ; i < contacts.size() ; i++ )
					if(!(contacts.get(i) instanceof SchoolContact || contacts.get(i) instanceof FamilyContact)) 
						System.out.println( (i+1) + ". " + contacts.get(i).toString() + "\n");
				break;
			
			case 7:
				System.out.println("-----All Contacts Types-----");
				for( int i = 0 ; i < contacts.size() ; i++ )
					System.out.println( (i+1) + ". " + contacts.get(i).toString() + "\n");

  				 break;
  				 
			case 8:
				//save the contacts
				lab8.saveToFile("backup.txt", contacts);
				
				System.out.println("Program Ended");
				break;
			
			}
		} while (menuOption != 8);
	}
	
	
	//will save contacts to the given file
	public void saveToFile(String filename, ArrayList contacts){
		try{
			File out = new File(filename);
			FileWriter outwriter = new FileWriter(out);
			BufferedWriter fileout = new BufferedWriter(outwriter);
			
			//first line holds the number of records the file holds
			fileout.write("" + contacts.size());
			fileout.newLine();
			
			//for each contact
			Iterator it = contacts.iterator();			
			while(it.hasNext()){
				//get the object
				Contact contact = (Contact)it.next();
				
				//first line is always the Contact type
				if( contact instanceof FamilyContact ){
					fileout.write("F");
					fileout.newLine();
				}
				else
				if( contact instanceof SchoolContact ){
					fileout.write("S");
					fileout.newLine();
				}
				else{
					fileout.write("C");
					fileout.newLine();
				}
					
				fileout.write(contact.firstName);
				fileout.newLine();
				fileout.write(contact.lastName);
				fileout.newLine();
				//then save the phone
				Phone_Number phone = contact.phone;
				fileout.write(phone.getArea() + " " + phone.getPrefix() + " " + phone.getSuffix());
				fileout.newLine();
				
				//if we do not have a simple Contact object...
				if( contact instanceof FamilyContact ){
					fileout.write("" + ((FamilyContact)contact).relType);
					fileout.newLine();
				}
				else
				if( contact instanceof SchoolContact ){
					fileout.write("" + ((SchoolContact)contact).getId());
					fileout.newLine();
					fileout.write("" + ((SchoolContact)contact).getData());
					fileout.newLine();
				}
			}
			
			fileout.close();
			
		//handle exception 
		}catch(Exception e){
			System.out.println("Something went wrong when saving to file: "+e);
		}
	}
	
	
	//will load contacts from the given file
	public ArrayList loadFromFile(String filename){
		//will hold read records
		ArrayList result = new ArrayList();
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			
			//read in the first line
			int counter = Integer.parseInt(reader.readLine());
			
			//read each record
			for( int i = 0 ; i < counter ; i ++ ){
				String type = reader.readLine();
				
				String firstName = reader.readLine();
				String lastName = reader.readLine();
				//we read the phone line, and split it in the 3 components
				String[] phoneStrings = reader.readLine().split(" ");
				Phone_Number phoneNumber = new Phone_Number(Integer.parseInt(phoneStrings[0]), Integer.parseInt(phoneStrings[1]), Integer.parseInt(phoneStrings[2]));
				
				//based on the type create the object
				if( type.equals("C")){
					Contact contact = new Contact(firstName, lastName, phoneNumber);
					//add it to the list
					result.add( contact);
				}else
					if( type.equals("F")){
						FamilyContact contact = new FamilyContact(firstName, lastName, phoneNumber);
						
						//set the relation
						String relation = reader.readLine();						
						contact.setRelationType(FamilyContact.RelationType.valueOf(relation));
						
						//add it to the list
						result.add( contact);
					}else{
						SchoolContact contact = new SchoolContact(firstName, lastName, phoneNumber);
						contact.setStudentId(Integer.parseInt(reader.readLine()));
						
						Data data = new Data();
						String[] dataString = reader.readLine().split(" ");
						//set the data elements based on the info stored in the file
						if( dataString[0].startsWith("GPA"))
							data.setStudentGPA(Double.parseDouble(dataString[1]));
						else
							data.setStudentCreditHours(Integer.parseInt(dataString[1]));
						contact.setData(data);
						//add it to the list
						result.add( contact);
					}
			}
			
			reader.close();
		//handle exception 
		}catch(Exception e){
			System.out.println("Something went wrong when reading from file: "+e);
		}
		
		return result;
	}
}