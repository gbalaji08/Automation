package scenario1;

import java.util.Scanner;

/*** 
 *  @author gbalaji
 *  Scenario :   Develop a program for ATM Functionalities
 *  1. Check Balance
 *  2. Deposit Money
 *  3. Withdraw Money
 *
 */



public class ATMExample {

	
	
	public static void main(String[] args) {
		
		// Declare 3 variables (balance, deposit, withdraw)
		
		int balance = 10000, withdraw, deposit;
		
		Scanner sc = new Scanner(System.in);  // to get choice of user using scanner class
		
		//conditional statement  (while / switch)
		
		while(true)
		{
		
		System.out.println("Welcome to HDFC ATM Bank");
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Balance");
		System.out.println("Choose 4 for Exit");
		System.out.println("Choose option to perform: "); // the system has to take input from the user

		
		// get choice from the user
		
		int choice  = sc.nextInt();
		
		switch(choice)
		
		{
		
		case 1:
			
			//if choice is 1   ,  system ask the user to enter the withdrawl amount
			
			System.out.println("Enter the withdrawl amount : ");
			
			//get amount from user
			
			withdraw = sc.nextInt();
			
			// Exceptions should be handled here
			
			if(balance >= withdraw)
				
			{
				// write a logic here to deduct the amount from the balance and update the ledger
				
				balance = balance - withdraw;
				System.out.println("Please collect your money");  
			}
			
			else
			{
				
				System.out.println("Insufficient balance");  
			}
			
			
			System.out.println(" ");
			
			break;
			
		case 2:
			
			// if choice is 2, then system asks the user to enter deposit money
			
			System.out.print("Enter money to be deposited:");  
			
			// get amount from the user
			
			deposit = sc.nextInt();
			
			// logic to add deposit amount to the balance
			
			balance  = balance + deposit;
			
			System.out.println("Your Money has been successfully deposited");  
	        System.out.println("");  
	        break;  
	        
		case 3:
			
			// if choice is 3, the system should return only balance amount from the ledger
			
			 System.out.println("Balance : "+balance); 
			
			// displays the balance amount
			 System.out.println("");  
		        break;  
		        
		case 4:
			
			// if choice is 4 then exit from the system
			
			System.exit(0);
			
		}
			 
		}
			
		
	}

}
