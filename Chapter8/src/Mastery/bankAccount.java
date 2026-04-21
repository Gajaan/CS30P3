/*

Program: bankAccount.java          Last Date of this Revision: April 21, 2026

Purpose: an application that sees if the user still has a balance after they withdraw a certain amount of money from a business and personal account

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/

package Mastery;

public class bankAccount {

	public static void main(String[] args) {

		// create a personal account with initial balance of 150
		personalAccount pAcc = new personalAccount(150, "John", "Doe");

		// create a business account with initial balance of 600
		businessAccount bAcc = new businessAccount(600, "Jane", "Smith");

		// display initial personal account information
		System.out.println("Personal Account:");
		System.out.println(pAcc);

		// withdraw 60 from personal account (may trigger fee if below minimum)
		pAcc.withdrawal(60);

		// display updated personal account information
		System.out.println(pAcc);

		// display initial business account information
		System.out.println("\nBusiness Account:");
		System.out.println(bAcc);

		// withdraw 200 from business account (may trigger fee if below minimum)
		bAcc.withdrawal(200);

		// display updated business account information
		System.out.println(bAcc);
	}
}


/*
Personal Account:
JDoe
John Doe
Current balance is $150.00
Minimum balance not maintained. $2 fee charged.
JDoe
John Doe
Current balance is $88.00

Business Account:
JSmith
Jane Smith
Current balance is $600.00
Minimum balance not maintained. $10 fee charged.
JSmith
Jane Smith
Current balance is $390.00

*/