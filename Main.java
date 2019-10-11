package ebatson3_lab04_q3; //Package name

import java.util.Scanner; //Importing scanner for user input

public class Main {
	public static double addition(int l) {
		
	Scanner inputScanner = new Scanner (System.in); //Naming my scanner
	int counter=0; //Declaring and naming counter variable, which counts number of questions asked
	long startTime = System.currentTimeMillis(); //Long type variable to compute time to complete questions
	
	for (int i = 1; i <=10; i++) {
		int num1 = (int)(Math.random()*l); //Uses function to create random integer
		int num2 = (int)(Math.random()*l); //Uses function to create random integer number 2
		System.out.println("Question "+i); //Outputs the question number based off of for loop i variable
		System.out.println("What is the result of "+ num1+ "+" +num2); //Outputs question 
		int answer = inputScanner.nextInt(); //Assigns input to answer variable
		if (num1+num2==answer) {
			System.out.println("Correct!"); //Outputs when they are correct
			counter++;}
		else 
			System.out.println("Incorrect! You SUCK!");  //Outputs when they are incorrect
		}
	System.out.println("You scored "+ counter + "/10 questions correctly and"); //Displays score
		
	inputScanner.close(); //Closes the scanner
	long endTime = System.currentTimeMillis(); //Long variable stores the end time of completion
	double testTime = endTime - startTime; //Computes the total test time
	testTime = testTime/10000.0; //Divides it into seconds
	return testTime; //Returns this value to code where testTime is declared
	}
	
	public static double subtraction(int e) 
	{
		Scanner inputScanner = new Scanner (System.in); //Naming scanner
		int counter =0;
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <=10; i++) {
			int num1 = (int)(Math.random()*e); //Uses function to create random integer
			int num2 = (int)(Math.random()*e); //Uses function to create random integer
			System.out.println("Question "+i); //Outputs the question number based off of for loop i variable
			System.out.println("What is the result of "+ num1+ "-" +num2); //Outputs question
			int answer = inputScanner.nextInt(); //Assigns input to answer variable
			if (num1-num2==answer) {
				System.out.println("Correct!");  //Outputs when they are correct
				counter++;
			}
			else 
				System.out.println("Incorrect! You SUCK!"); //Outputs when they are incorrect
				}
		inputScanner.close(); //Closes the scanner
		System.out.println("You scored "+ counter + "/10 questions correctly and");
		long endTime = System.currentTimeMillis();
		double testTime = endTime - startTime;
		testTime = testTime/10000.0;
		return testTime;
	}
	public static double multiplication(int j)
	{
		long startTime = System.currentTimeMillis();
		int counter = 0;
		Scanner inputScanner = new Scanner(System.in);
		for (int i = 1; i <=10; i++) {
			int num1 = (int)(Math.random()*j); //Uses function to create random integer
			int num2 = (int)(Math.random()*j); //Uses function to create random integer
			System.out.println("Question "+i); //Outputs the question number based off of for loop i variable
			System.out.println("What is the result of "+ num1+ "*" +num2); //Outputs question
			int answer = inputScanner.nextInt(); //Assigns input to answer variable
			if (num1*num2==answer) {
				System.out.println("Correct!");  //Outputs when they are correct
				counter++;}
			else 
				System.out.println("Incorrect! You SUCK!"); //Outputs when they are incorrect
		}
		inputScanner.close(); //Closes the scanner
		System.out.println("You scored "+ counter + "/10 questions correctly and");
		long endTime = System.currentTimeMillis(); //Long variable stores the end time of completion
		double testTime = endTime - startTime;
		testTime = testTime/10000.0;
		return testTime;
	}
	public static double random (int k)
	{
		Scanner inputScanner = new Scanner(System.in); //Naming scanner
		int counter = 0;
		long startTime = System.currentTimeMillis();
		int random = (int)(Math.random()*3);
		if (random==1)
		{
			for (int i = 1; i <=10; i++) {
				int num1 = (int)(Math.random()*k); //Uses function to create random integer
				int num2 = (int)(Math.random()*k); //Uses function to create random integer
				System.out.println("Question "+i); //Outputs the question number based off of for loop i variable
				System.out.println("What is the result of "+ num1+ "+" +num2); //Outputs question
				int answer = inputScanner.nextInt(); //Assigns input to answer variable
				if (num1+num2==answer) {
					System.out.println("Correct!");  //Outputs when they are correct
					counter++;}
				else 
					System.out.println("Incorrect, the correct answer was"+ (num1-num2)); //Outputs when they are incorrect + the right answer
				}
		}
		else if (random==2)
		{
			for (int i = 1; i <=10; i++) {
				int num1 = (int)(Math.random()*k); //Uses function to create random integer
				int num2 = (int)(Math.random()*k); //Uses function to create random integer
				System.out.println("Question "+i); //Outputs the question number based off of for loop i variable
				System.out.println("What is the result of "+ num1+ "-" +num2); //Outputs question
				int answer = inputScanner.nextInt(); //Assigns input to answer variable
				if (num1-num2==answer) {
					System.out.println("Correct");  //Outputs when they are correct
					counter++;}
				else 
					System.out.println("Incorrect, the correct answer was"+(num1-num2)); //Outputs when they are incorrect + the right answer
				}
		}
		else if(random==3)
		{
			for (int i = 1; i <=10; i++) {
				int num1 = (int)(Math.random()*k); //Uses function to create random integer
				int num2 = (int)(Math.random()*k); //Uses function to create random integer
				System.out.println("Question "+i); //Outputs the question number based off of for loop i variable
				System.out.println("What is the result of "+ num1+ "*" +num2); //Outputs question
				int answer = inputScanner.nextInt(); //Assigns input to answer variable
				if (num1*num2==answer) {
					System.out.println("Correct");  //Outputs when they are correct
					counter++;}
				else 
					System.out.print("Incorrect, the correct answer was "+(num1*num2));
					
			}
		}
		inputScanner.close(); //Closes the scanner
		System.out.println("You scored "+ counter + "/10 questions correctly and");
		long endTime = System.currentTimeMillis(); //Long variable stores the end time of completion
		double testTime = endTime - startTime;
		testTime = testTime/10000.0;
		return testTime;
	}
	public static void main (String[]args)
	{
	int operation = 0, choice = 0;
	Scanner inputScanner = new Scanner (System.in); //Naming scanner
	System.out.println("Welcome to the math practice program!"); //Outputs the opening message
	
	
	System.out.println("Please choose a difficulty level \n" +"1) Easy: Integers ranging 0 to 10 \n"+
	"2) Medium: Integers ranging 0 to 100\n"+	"3) Hard: Integers ranging -100 to 100\n"
			+"Please input a choice (1-3):");
	choice = inputScanner.nextInt();
	if (choice <1||choice >3 )
	{
		System.out.println("Invalid difficulty choice!\r\n" + "Please input a choice (1-3):\r\n");
		choice = inputScanner.nextInt();
	}
	
	System.out.println("Which operation would you like to perform? \n 1. Addition \n 2. Subtraction\n 3. Multiplcation\n "
			+ "4. Random \n 5. Change Difficulty\n 6. Exit: ");
	System.out.println("Please input a choice (1-6)");//Prompts user to input their choice
	operation = inputScanner.nextInt();//Assigns this value to the operation choice 
	if (choice ==1)
	switch (operation) {// Uses their choice input for a switch statement 
	case 1: 
		System.out.println("the average question time was "+ (addition (11))+ "seconds");
		break;//Exits once this statement is met	
	case 2: 
		System.out.println("the average question time was "+ (subtraction (11))+ "seconds");
		break; //Exits once this statement is met
	
	case 3: 
		System.out.println("the average question time was "+ (multiplication (11))+ "seconds");
		break; //Exits once this statement is met
	
	case 4:
		System.out.println("the average question time was "+ (random (11))+ "seconds");
		break; //Exits once this statement is met
	case 5:
		System.out.println("Please choose a difficulty level \n" +"1) Easy: Integers ranging 0 to 10 \n"+
				"2) Medium: Integers ranging 0 to 100\n"+	"3) Hard: Integers ranging -100 to 100\n"
						+"Please input a choice (1-3):");
				choice = inputScanner.nextInt();
				if (choice <1||choice >3 )
				{
					System.out.println("Invalid difficulty choice!\r\n" + "Please input a choice (1-3):\r\n");
					choice = inputScanner.nextInt();
				}
		break; //Exits once this statement is met
	case 6: 
	System.out.println("Goodbye!");
	break;		//Exits once this statement is met
	default:// default case if none of the other cases work 
	System.out.println("Invalid choice, please re-run the program to try again.");// prints out the following message 
	break;		//Exits once this statement is met	
}
	if (choice ==2)
	switch (operation) {// uses the stored operation as part of the switch 
	case 1: 
		System.out.println("the average question time was "+ (addition (101))+ "seconds");
		break;//exits this case  	
	case 2: 
		System.out.println("the average question time was "+ (subtraction (101))+ "seconds");
		break;//exits this case
	
	case 3: 
		System.out.println("the average question time was "+ (multiplication (101))+ "seconds");
		break;//exits this case
	
	case 4:
		System.out.println("the average question time was "+ (random (101))+ "seconds");
		break;//exits this case
	case 5:
		System.out.println("Please choose a difficulty level \n" +"1) Easy: Integers ranging 0 to 10 \n"+
				"2) Medium: Integers ranging 0 to 100\n"+	"3) Hard: Integers ranging -100 to 100\n"
						+"Please input a choice (1-3):");
				choice = inputScanner.nextInt();
				if (choice <1||choice >3 )
				{
					System.out.println("Invalid difficulty choice!\r\n" + "Please input a choice (1-3):\r\n");
					choice = inputScanner.nextInt();
				}
		break; //Exits once this statement is met
	case 6: 
	System.out.println("Goodbye!");
	break;	//Exits once this statement is met	
	default:// default case if none of the other cases work 
	System.out.println("Invalid choice, please re-run the program to try again.");// prints out the following message 
	break;	//Exits once this statement is met		
	}
	if (choice ==3)
	switch (operation) {// uses the stored operation as part of the switch 
	case 1: 
		System.out.println("the average question time was "+ (addition (201))+ "seconds");
		break;//exits this case  	
	case 2: 
		System.out.println("the average question time was "+ (subtraction (201))+ "seconds");
		break;//exits this case
	
	case 3: 
		System.out.println("the average question time was "+ (multiplication (201))+ "seconds");
		break;//exits this case
	
	case 4:
		System.out.println("the average question time was "+ (random (201))+ "seconds");
		break;//exits this case
	case 5:
		System.out.println("Please choose a difficulty level \n" +"1) Easy: Integers ranging 0 to 10 \n"+
				"2) Medium: Integers ranging 0 to 100\n"+	"3) Hard: Integers ranging -100 to 100\n"
						+"Please input a choice (1-3):");
				choice = inputScanner.nextInt();
				if (choice <1||choice >3 )
				{
					System.out.println("Invalid difficulty choice!\r\n" + "Please input a choice (1-3):\r\n");
					choice = inputScanner.nextInt();
				}
		break; //Exits the switch
	case 6: 
	System.out.println("Goodbye!"); //Outputs this message
	break;		//Exits the switch
	default:// Default for if no other criteria are met
	System.out.println("Invalid choice, please re-run the program to try again.");//Outputs the message 
	break;		//Exits the switch	
		}
	inputScanner.close(); //Closes the scanner
	}	
}
