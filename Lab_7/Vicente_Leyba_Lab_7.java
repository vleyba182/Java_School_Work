//The imports below are for I/Oimport java.util.*;import java.io.*;// Declare a public classpublic class Vicente_Leyba_Lab_7 {	public static void main(String[] args) {		// Create scanner		Scanner sc = new Scanner(System.in);		//Declare array to hold school contact
		SchoolContact[] schoolContactInfo = new SchoolContact[10];
		FamilyContact[] familyContactInfo = new FamilyContact[10];
		Contact [] contactInfo = new Contact [10];		// Declare variables		int menuOption, creditHours, area, prefix, suffix, studentId, studentContactsSoFar = 0, familyContactsSoFar = 0, contactsSoFar = 0;		double gpa;		char studentData, familyRelationOption;		String menuOption2, menuOption3;			// Get menu to display		do {
			System.out.println("-----MENU-----");			System.out.println("1) Enter a Student Contact");			System.out.println("2) Enter a Family Contact");
			System.out.println("3) Enter a Contact");			System.out.println("4) Display Student Contacts");
			System.out.println("5) Display Family Contacts");
			System.out.println("6) Display Contacts");
			System.out.println("7) Display All Contacts");
			System.out.println("8) Quit");			System.out.println("Selection:");			menuOption = sc.nextInt();
			
			SchoolContact schoolContact = new SchoolContact();
			FamilyContact familyContact = new FamilyContact();
			Contact contact = new Contact();			// Implement switch statement to			switch (menuOption) {			// If user enters 1 to create contact this will be displayed to user			case 1:				
				System.out.println("Enter The First Name of The Student");
				schoolContact.setFirstName(sc.next());					System.out.println("Enter The Last Name of The Student");
				schoolContact.setLastName(sc.next());				System.out.println("Enter the Student ID of this person: 900");				schoolContact.setStudentId(Integer.parseInt("900" + sc.next()));
								System.out.println("G)Enter The GPA For This Student");				System.out.println("H)Enter The Number Of Completed Credit Hours");								menuOption2 = sc.next().toUpperCase();				studentData = menuOption2.charAt(0);				// Prompts the user for the next choice				if (studentData == 'G') {					System.out.println("GPA: ");					gpa = sc.nextDouble();					//create the Data object					Data data = new Data();					data.setStudentGPA(gpa);					//add it to the contact					schoolContact.setData(data);				} 
					else if (studentData == 'H') {						System.out.println("Hours: ");						creditHours = sc.nextInt();						//create the Data object						Data data = new Data();						data.setStudentCreditHours(creditHours);						//add it to the schoolcontact						schoolContact.setData(data);					} 
						else {							System.out.println("Invalid Entry");						}				System.out.println("Enter The Phone Number of This Student");				System.out.println("(###)-###-####: ");				area = sc.nextInt();				prefix = sc.nextInt();				suffix = sc.nextInt();				//create the phone object				Phone_Number studentPhone = new Phone_Number(area, prefix,	suffix);				//add it to the Schoolcontact				schoolContact.setPhone(studentPhone);
				
				//store info in an array
				schoolContactInfo[ studentContactsSoFar ] = schoolContact;				//increase the counter to point to the next free location (if any)				studentContactsSoFar++;				break;
				
			case 2:
							
				System.out.println("Enter the First Name of The Family Contact");
				familyContact.setFirstName(sc.next());					System.out.println("Enter The Last Name of The Family Contact");
				familyContact.setLastName(sc.next());
				System.out.println("Enter The Relationship of This Contact");
				System.out.println("A) SISTER");
				System.out.println("B) BROTHER");
				System.out.println("C) MOTHER");
				System.out.println("D) FATHER");
				System.out.println("E) OTHER");
				menuOption3 = sc.next();
				familyRelationOption = menuOption3.charAt(0);
				
				if (familyRelationOption == 'A') {					System.out.println("Relationship: SISTER ");
					familyContact.setRelationType(FamilyContact.RelationType.SISTER);				} 
					else if (familyRelationOption == 'B') {					System.out.println("Relationship: BROTHER ");
					familyContact.setRelationType(FamilyContact.RelationType.BROTHER);					} 
						else if (familyRelationOption == 'C') {							System.out.println("Relationship: MOTHER ");
							familyContact.setRelationType(FamilyContact.RelationType.MOTHER);
						}
							else if (familyRelationOption == 'D') {								System.out.println("Relationship: FATHER ");
								familyContact.setRelationType(FamilyContact.RelationType.FATHER);
							}
								else if (familyRelationOption == 'E') {									System.out.println("Relationship: OTHER ");
									familyContact.setRelationType(FamilyContact.RelationType.OTHER);
								}
							
				System.out.println("Enter The Phone Number of This Contact");				System.out.println("(###)-###-####: ");				area = sc.nextInt();				prefix = sc.nextInt();				suffix = sc.nextInt();				//create the phone object				Phone_Number familyContactNumber = new Phone_Number(area, prefix,	suffix);				//add it to the familyContact				familyContact.setPhone(familyContactNumber);
				//store info in an array
				familyContactInfo[ familyContactsSoFar ] = familyContact;				//increase the counter to point to the next free location (if any)				familyContactsSoFar++;				break;
				
			case 3:
				
				System.out.println("Enter The First Name of The Contact");
				contact.setFirstName(sc.next());					System.out.println("Enter The Last Name of The Contact");
				contact.setLastName(sc.next());
				System.out.println("Enter The Phone Number of This Contact");				System.out.println("(###)-###-####: ");				area = sc.nextInt();				prefix = sc.nextInt();				suffix = sc.nextInt();				//create the phone object				Phone_Number contactNumber = new Phone_Number(area, prefix,	suffix);				//add it to the contact				contact.setPhone(contactNumber);
				//store info in an array
				contactInfo[ contactsSoFar ] = contact;				//increase the counter to point to the next free location (if any)				contactsSoFar++;
				break;
				
			case 4:
			
				System.out.println("-----All Student Contacts-----");				//print each stored contact				for( int i = 0 ; i < studentContactsSoFar ; i++ )					System.out.println( (i+1) + ". " + schoolContactInfo[i].toString() + "\n");				break;
			
			case 5:
			
				System.out.println("-----All Family Contacts Stored-----");
				//prints each stored contact
				for( int i = 0 ; i < familyContactsSoFar ; i++ )					System.out.println( (i+1) + ". " + familyContactInfo[i].toString() + "\n");				break;
				
			case 6:
			
				System.out.println("-----All Contacts Stored-----");
				//prints each stored contact
				for( int i = 0 ; i < contactsSoFar ; i++ )					System.out.println( (i+1) + ". " + contactInfo[i].toString() + "\n");
				break;
			
			case 7:
				System.out.println("-----All Contacts Entered-----");
				System.out.println("\n-----Student Contacts-----");			    for( int i = 0 ; i < studentContactsSoFar ; i++ ) {        		System.out.println( (i+1) + ". " + schoolContactInfo[i].toString() + "\n");    			}
    			System.out.println("-----Family Contacts-----");  				 for( int i = 0 ; i < familyContactsSoFar ; i++ ) {     			  System.out.println( (i+1) + ". " + familyContactInfo[i].toString() + "\n");    			}
    			System.out.println("-----Contacts-----");   				 for( int i = 0 ; i < contactsSoFar ; i++ ) {     		   System.out.println( (i+1) + ". " + contactInfo[i].toString() + "\n");  				  }  				 break;
  				 
			case 8:
				
				System.out.println("Program Ended");
				break;			
			}		} while (menuOption != 8);	}}