//The imports below are for I/O
        
        case ':':
        return_val0 = multiplyRange(numa, numb);
        break;
        

	//Make the multiply range function
	static int multiplyRange(int start, int stop){
		System.out.println("Calling Multiply Range");
		int return_val = 0;
		
		if(start > stop){
			System.out.println("start is greater than stop");
			return return_val;
		}else if(start == stop){
			return start;
		}else{
			int tempAnswer = start;
			while(start < stop){
				System.out.println("In Loop");
				if(tempAnswer == start){
					tempAnswer = start * (start + 1);
					System.out.println("In Loop If tempAnswer = " + tempAnswer);
				}else{
					tempAnswer = tempAnswer * (start + 1);
					System.out.println("In Loop Else tempAnswer = " + tempAnswer);
				}
				start ++;
			}
			//Finished loop now set return_val to temp answer
			return_val = tempAnswer;		
		}
		return return_val;
	}
		
	
        return return_val;
		double doublea, doubleb;
		String op, op1;	
		char charop, charop1;
    	int[] intAnswers = new int[10];
    	double[] doubleAnswers = new double[10];
    	int optionOneCount, optionTwoCount;
    	
    	//Initialize the variable
    	menuOption = 0;
    	optionOneCount = 0;
    	optionTwoCount = 0;
    	
		
	switch (menuOption){
		
		//Is user choses to enter a integer expression this will handle the input
		case 1:
		System.out.println("Enter A Integer Expression");
			inta = sc.nextInt();
			op = sc.next();
			charop = op.charAt(0);
			intb = sc.nextInt();
			int intAnswer = doIntMath(charop, inta, intb);
			System.out.println(inta + op + intb + "=" +intAnswer);
			intAnswers[optionOneCount] = intAnswer;
			optionOneCount ++;
		break;	
		
		//Is user choses to enter a floating point expression this will handle the input
		case 2:
		System.out.println("Enter A Floating Point Expression");
			doublea = sc.nextDouble();
			op1 = sc.next();
			charop1 = op1.charAt(0);
			doubleb = sc.nextDouble();
			double doubleAnswer = doDoubleMath(charop1, doublea, doubleb);
			System.out.println(doublea + op1 + doubleb + "=" +doubleAnswer);
			doubleAnswers[optionTwoCount] = doubleAnswer;
			optionTwoCount ++;
			break;
		
		//If user wants to see integer answer this will show the any answers if any they have calculated
		case 3: 
			for (int i=0; i<optionOneCount; i++ ) 
			{
			break;
		
		case 4: 
			for (int l=0; l<optionTwoCount; l++ ) 
			{
			break;
			
		//Program will end if the user enters 5
		default:
		System.out.println("Program Ended"); 
			break;
			
			}
		    	
   			}
  		}