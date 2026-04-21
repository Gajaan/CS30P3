package Mastery;

public class personalAccount extends account {

	// constructor that initializes the personal account using parent constructor
	public personalAccount(double bal, String fName, String lName) {

		// call the Account constructor to set balance and customer info
		super(bal, fName, lName);
	}

	// overrides the withdrawal method to include minimum balance rule
	public void withdrawal(double amt) {

		// perform the normal withdrawal using parent class method
		super.withdrawal(amt);

		// check if balance has fallen below the minimum required (100)
		if (getBalance() < 100) {

			// charge a $2 fee by withdrawing additional amount
			super.withdrawal(2.00);

			// inform the user about the fee
			System.out.println("Minimum balance not maintained. $2 fee charged.");
		}
	}
}