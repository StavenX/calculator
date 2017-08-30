package calculator;

import java.util.Scanner;

public class Calculator {
	
	//Initialization
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		//Greets the user
		System.out.println("Welcome to my domain. Now, what is your name?");
		String name = scanner.next();
		
		System.out.println("Alright, let us start! Please enter your first number.");
		int num1 = scanner.nextInt();
		System.out.println("Good job! You have skills! Now, enter your second number.");
		int num2 = scanner.nextInt();
		
		System.out.println("Now enter the operation you would like to perform.");
		System.out.println("Type '1' for multiplication, '2' for addition, '3' for subtraction, '4' for division, and '5' for powering.");
		System.out.println("I am a very young and aspiring calculator, so I cannot do more.");
		
		//Stores the desired operation
		int operation = scanner.nextInt();
		
		//-- A thorough list of the different operations, that the program is able to perform
		
		
		//Multiplication
			if (operation == 1) {
			
			System.out.println(name + ", " + "The result is: " + (num1 * num2));
		}
			
		//Addition
			if (operation == 2) {
			
			System.out.println(name + ", " + "The result is: " +  (num1 + num2));
		}
			
		//Subtraction
			if (operation == 3) {
				
			System.out.println(name + ", " + "The result is: " + (num1 - num2));
		}
			
		//Division
			if (operation == 4) {
			
			System.out.println(name + ", " + "The result is: " + (num1 / num2));
		}
			
		//Power
			if (operation == 5) {
				
			System.out.println(name + ", " + "The result is: " + (Math.pow(num1, num2)));	
		}
			
		//----- Operations
			
		
		//Ends the program. 
		scanner.close();

	}
	
}
