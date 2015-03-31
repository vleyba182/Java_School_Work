//The imports below are for I/Oimport java.util.*;import java.io.*;// Declare a public classpublic class Vicente_Leyba_Lab_4 {        static int doIntMath(char op,int numa, int numb){    int return_val0;    return_val0 = 0;    switch (op)                    //These switch statements determines what input the user enters and computes it.        {        case '+':        return_val0 = numa + numb;        break;                case '-':        return_val0 = numa - numb;        break;                case '*':	    return_val0 = numa * numb;	    break;	        	    case '/':	    return_val0 = numa / numb;        break;                case '%':        return_val0 = numa % numb;        break;                //if the user enters an exponent expression the exponent method will handle the input.        case '^':        return_val0 = exponent(numa, numb);        break;
        
        case ':':
        return_val0 = multiplyRange(numa, numb);
        break;
                        //Declare a default statement if the user enters a invalid expression and return number to 0        default:        return_val0 = 0;        System.out.println("You have entered an Invalid Operation");        }                return return_val0;        	}

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
		
	    //Makes method to do double expressions    static double doDoubleMath(char op,double numa, double numb){        double return_val;        return_val = 0;        switch (op)                    //These switch statements determines what input the user enters and computes it.        {        case '+':        return_val = numa + numb;        break;                case '-':        return_val = numa - numb;        break;                case '*':        return_val = numa * numb;        break;                case '/':        return_val = numa / numb;        break;                //Declare a default statement if the user enters a invalid expression and return number to 0        default:        return_val = 0;        System.out.println("You have entered an Invalid Operation");        }        
        return return_val;        }//Make the exponent method    static int exponent(int a, int b){        int return_val = 1;                    //This method will handle an exponent expression        if (b < 0)        {        System.out.println("Error: Exponent Must Be >=0");        return_val = 1;        }                else if (b == 0)        {        return_val = 1;        }                else if (b == 1)        {        return_val = a;        }                else        {        return_val = a * exponent (a, b-1);        }        return (return_val);        }        //Declare main    public static void main (String[] args){        	//Declare variables		int menuOption, inta, intb;
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
    	    	//Create scanner    	Scanner sc = new Scanner( System.in);                	//This displays the menu for the user as long as they choose a selection between 1-4. if they hit 5 the programterminates    do {    	System.out.println("1) Do Integer Expression");    	System.out.println("2) Do Floating Point Expression");    	System.out.println("3) Display Integer Answers");    	System.out.println("4) Display Floating Point Answers");    	System.out.println ("5) End Program");    	System.out.println("Selection:");    		menuOption = sc.nextInt();
		
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
			{ 		   System.out.println("Integer Answer = "+intAnswers[i]);			}
			break;
		
		case 4: 
			for (int l=0; l<optionTwoCount; l++ ) 
			{ 		   System.out.println("Floating Point Answer = "+doubleAnswers[l]);			}
			break;
			
		//Program will end if the user enters 5
		default:
		System.out.println("Program Ended"); 
			break;
			
			}
		    	
   			}   	    	while (menuOption < 5);  			}
  		}