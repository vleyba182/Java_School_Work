q//The imports below are for I/Oimport java.util.*;// Declare a public classpublic class Vicente_Leyba_Project0 {	// Create scanner	static Scanner sc = new Scanner(System.in);	//his will hold all data in the linked list	static LinkedList list = new LinkedList();		public static void main(String[] args) {		try{			// Declare variables			int menuOption, area, prefix, suffix;				// Initialize variabls			menuOption = 0;				// Display menu until user enters 5 to quit program			do {
				System.out.println("\n \n-----MENU-----");				System.out.println("1) Enter a new contact");				System.out.println("2) Display number of contacts");				System.out.println("3) Print all list");				System.out.println("4) Search records");				System.out.println("5) Quit");				System.out.println("Selection:");				//this takes in option user enters				menuOption = Integer.parseInt(sc.nextLine());					// Implement switch statement to				switch (menuOption) {					// If user enters 1 to create contact this will be displayed to user				case 1:					Contact contact = new Contact();						//get the basic info from the contact					System.out.println("Enter ID: 900");					contact.setId(Integer.parseInt("900" + sc.nextLine()));					System.out.println("Student first name: ");					contact.setFirstName(sc.nextLine());					System.out.println("Student last name: ");					contact.setLastName(sc.nextLine());					System.out.println("Select GPA (1) or Credit Hours (2): ");					menuOption = Integer.parseInt(sc.nextLine());					Data data = new Data();										if( menuOption == 1 ){						System.out.println("Enter GPA: ");						data.setStudentGPA(Double.parseDouble(sc.nextLine()));					}else{						System.out.println("Enter Credit Hours: ");						data.setStudentCreditHours(Integer.parseInt(sc.nextLine()));					}	
					//set data to contact					contact.setData(data);										// create the address					StudentAddress address = new StudentAddress();					//gett the info					System.out.println("Street: ");					address.setStreetAddress(sc.nextLine());					System.out.println("City: ");					address.setCity(sc.nextLine());					System.out.println("State: ");					address.setState(sc.nextLine());					System.out.println("Zip: ");					address.setZipCode(Integer.parseInt(sc.nextLine()));						// store the address in contact					contact.setAddress(address);						//get user phone number					System.out.println("Enter phone number (on 3 lines)");					System.out.println("(###)-###-####: ");					area = Integer.parseInt(sc.nextLine());					prefix = Integer.parseInt(sc.nextLine());					suffix = Integer.parseInt(sc.nextLine());					Phone_Number phonenumber = new Phone_Number(area, prefix,							suffix);					// store the phone in the contact					contact.setPhone(phonenumber);										//add contact to the list					list.addToList(contact);					break;					case 2:					//prints the number of items in the list					System.out.println("Number of contacts in the list: " + list.getNumberOfItems());					break;					
				//prints the contacts of the list				case 3:					list.printList();					break;					case 4:					//allows user to serach for contacs					searchRecords();					break;				}			} while (menuOption != 5);						list = null;			//we run the garbage collector to remove all elements from the memory			System.gc();		//will handle exception		}catch(Exception ex){			System.out.println("ERROR! Program will close! " + ex);			ex.printStackTrace();		}	}			//this will be called for a contact found on a given search, and	//will ask the user to do something with it	private static void handleFoundContact(Contact contact){		//print contact details		System.out.println("FOUND contact: " + contact.toString());				System.out.println("1) Modify contact");		System.out.println("2) Delete contact");		System.out.println("3) Do nothing");		System.out.println("Selection:");		int menuOption = Integer.parseInt(sc.nextLine());				switch(menuOption){					//will allow user to edit contact			case 1: 				int area, prefix, suffix;				//get the new info of the user				System.out.println("Enter ID: 900");				contact.setId(Integer.parseInt("900" + sc.nextLine()));							System.out.println("Student first name: ");				contact.setFirstName(sc.nextLine());				System.out.println("Student last name: ");				contact.setLastName(sc.nextLine());								System.out.println("Select GPA (1) or Credit Hours (2): ");				menuOption = Integer.parseInt(sc.nextLine());				Data data = new Data();									if( menuOption == 1 ){					System.out.println("Enter GPA: ");					data.setStudentGPA(Double.parseDouble(sc.nextLine()));				}else{					System.out.println("Enter Credit Hours: ");					data.setStudentCreditHours(Integer.parseInt(sc.nextLine()));				}					contact.setData(data);								// create the address				StudentAddress address = new StudentAddress();				// read details				System.out.println("Street: ");				address.setStreetAddress(sc.nextLine());				System.out.println("City: ");				address.setCity(sc.nextLine());				System.out.println("State: ");				address.setState(sc.nextLine());				System.out.println("Zip: ");				address.setZipCode(Integer.parseInt(sc.nextLine()));				// store the address in the contact				contact.setAddress(address);				// get the phone number				System.out.println("Enter phone number (on 3 lines)");				System.out.println("(###)-###-####: ");				area = Integer.parseInt(sc.nextLine());				prefix = Integer.parseInt(sc.nextLine());				suffix = Integer.parseInt(sc.nextLine());				Phone_Number phonenumber = new Phone_Number(area, prefix,suffix);				// store the phone in the contact				contact.setPhone(phonenumber);				break;											//allows user to remove contact from linked list			case 2: 								System.out.println("Are you sure you want to delete it? (1 for YES and 2 for NO)");				menuOption = Integer.parseInt(sc.nextLine());				//make sure the user wants to delete record				if( menuOption == 1 ){					list.deleteNode(contact);					//we run the garbage collector to remove all elements from the memory					System.gc();				}				else					System.out.println("Contact NOT Deleted");								break;				//do nothing			case 3: return; 			default: System.out.println("Invalid selection!");		}	}	//will ask the user to choose criteria to search for	private static void searchRecords(){				System.out.println("1) Search by first name");		System.out.println("2) Search by last name");		System.out.println("3) Search by gpa");		System.out.println("4) Search by phone ( format: (area)-prefix suffix) )");		System.out.println("5) Search by position in list");		System.out.println("6) Search by ID");		System.out.println("Selection:");		//		int menuOption = Integer.parseInt(sc.nextLine());		String str;		LinkedListNode first, temp;		Contact currentcontact;		//switch statements takes what option the user enters and then executes the option		switch(menuOption){					case 1: 				System.out.println("First name to search for: ");				str = sc.nextLine();								first = list.getFirst();				//				if the list is empty we need to tell the user				if( first == null ){					System.out.println("List is empty!");					return;				}															temp = first;				currentcontact =null;								//check each element in the list				while( temp != null ){					currentcontact = temp.getContact();										//if it meets the criteria, see what user wants to do with it					if( currentcontact.getFirstName().equals(str))						handleFoundContact(currentcontact);										//go to the next in the list					temp = temp.getNext();				}								break;			//if the user wants to search by last name case 2 will do that				case 2: 				System.out.println("Last name to search for: ");				str = sc.nextLine();								first = list.getFirst();								//need to tell user if the list is empty				if( first == null ){					System.out.println("List is empty!");					return;				}															temp = first;				currentcontact =null;								//check each element in the list				while( temp != null ){					currentcontact = temp.getContact();										//if it meets the criteria, see what user wants to do with it					if( currentcontact.getLastName().equals(str))						handleFoundContact(currentcontact);										//go to the next in the list					temp = temp.getNext();				}									break;							case 3: System.out.println("GPA to search for: ");			double gpa = Double.parseDouble(sc.nextLine());						first = list.getFirst();						//if The list is empty need to tell user			if( first == null ){				System.out.println("List is empty!");				return;			}													temp = first;			currentcontact =null;						//check each element in the list			while( temp != null ){				currentcontact = temp.getContact();								//if it meets the criteria, see what user wants to do with it				if( currentcontact.getData().getGPA() == gpa )					handleFoundContact(currentcontact);								//go to the next in the list				temp = temp.getNext();			}								break;						case 4: System.out.println("Phone to search for: ");			str = sc.nextLine();						first = list.getFirst();						//if the list is empty			if( first == null ){				System.out.println("List is empty!");				return;			}													temp = first;			currentcontact =null;						//need to check each element in the list			while( temp != null ){				currentcontact = temp.getContact();				 				System.out.println("compare *" + str + "* with *" +currentcontact.getPhone().toString()+ "*");												//if it meets the criteria, see what user wants to do with it				if( currentcontact.getPhone().toString().equals(str))					handleFoundContact(currentcontact);								//go to the next in the list				temp = temp.getNext();			}								break;							case 5: System.out.println("Position in list: ");			int position = Integer.parseInt(sc.nextLine());						first = list.getFirst();			//			if empty list			if( first == null ){				System.out.println("List is empty!");				return;			}													temp = first;			currentcontact =null;			//position of current object			int counter = 0;			//check each element in the list			while( temp != null ){				counter++;				currentcontact = temp.getContact();								//if it meets the criteria, see what user wants to do with it				if( counter == position )					handleFoundContact(currentcontact);								//go to the next in the list				temp = temp.getNext();			}								break;							case 6: System.out.println("ID to search for: ");			int id = Integer.parseInt(sc.nextLine());						first = list.getFirst();			//			if empty list			if( first == null ){				System.out.println("List is empty!");				return;			}													temp = first;			currentcontact =null;						//check each element in the list			while( temp != null ){				currentcontact = temp.getContact();								//if it meets the criteria, see what user wants to do with it				if( currentcontact.getId() == id)					handleFoundContact(currentcontact);								//go to the next in the list				temp = temp.getNext();			}								break;											default: System.out.println("Invalid selection!");		}			}}