//The imports below are for I/O
		SchoolContact[] schoolContactInfo = new SchoolContact[10];
		FamilyContact[] familyContactInfo = new FamilyContact[10];
		Contact [] contactInfo = new Contact [10];
			System.out.println("-----MENU-----");
			System.out.println("3) Enter a Contact");
			System.out.println("5) Display Family Contacts");
			System.out.println("6) Display Contacts");
			System.out.println("7) Display All Contacts");
			System.out.println("8) Quit");
			
			SchoolContact schoolContact = new SchoolContact();
			FamilyContact familyContact = new FamilyContact();
			Contact contact = new Contact();
				System.out.println("Enter The First Name of The Student");
				schoolContact.setFirstName(sc.next());	
				schoolContact.setLastName(sc.next());
				
					else if (studentData == 'H') {
						else {
				
				//store info in an array
				schoolContactInfo[ studentContactsSoFar ] = schoolContact;
				
			case 2:
							
				System.out.println("Enter the First Name of The Family Contact");
				familyContact.setFirstName(sc.next());	
				familyContact.setLastName(sc.next());
				System.out.println("Enter The Relationship of This Contact");
				System.out.println("A) SISTER");
				System.out.println("B) BROTHER");
				System.out.println("C) MOTHER");
				System.out.println("D) FATHER");
				System.out.println("E) OTHER");
				menuOption3 = sc.next();
				familyRelationOption = menuOption3.charAt(0);
				
				if (familyRelationOption == 'A') {
					familyContact.setRelationType(FamilyContact.RelationType.SISTER);
					else if (familyRelationOption == 'B') {
					familyContact.setRelationType(FamilyContact.RelationType.BROTHER);
						else if (familyRelationOption == 'C') {
							familyContact.setRelationType(FamilyContact.RelationType.MOTHER);
						}
							else if (familyRelationOption == 'D') {
								familyContact.setRelationType(FamilyContact.RelationType.FATHER);
							}
								else if (familyRelationOption == 'E') {
									familyContact.setRelationType(FamilyContact.RelationType.OTHER);
								}
							
				System.out.println("Enter The Phone Number of This Contact");
				//store info in an array
				familyContactInfo[ familyContactsSoFar ] = familyContact;
				
			case 3:
				
				System.out.println("Enter The First Name of The Contact");
				contact.setFirstName(sc.next());	
				contact.setLastName(sc.next());
				System.out.println("Enter The Phone Number of This Contact");
				//store info in an array
				contactInfo[ contactsSoFar ] = contact;
				break;
				
			case 4:
			
				System.out.println("-----All Student Contacts-----");
			
			case 5:
			
				System.out.println("-----All Family Contacts Stored-----");
				//prints each stored contact
				for( int i = 0 ; i < familyContactsSoFar ; i++ )
				
			case 6:
			
				System.out.println("-----All Contacts Stored-----");
				//prints each stored contact
				for( int i = 0 ; i < contactsSoFar ; i++ )
				break;
			
			case 7:
				System.out.println("-----All Contacts Entered-----");
				System.out.println("\n-----Student Contacts-----");
    			System.out.println("-----Family Contacts-----");
    			System.out.println("-----Contacts-----");
  				 
			case 8:
				
				System.out.println("Program Ended");
				break;
			}