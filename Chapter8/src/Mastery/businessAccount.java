package Mastery;

public class businessAccount extends account {

	public businessAccount(double bal, String fName, String lName) {
		super(bal, fName, lName);
	}

	public void withdrawal(double amt) {
		// perform the normal withdrawal using the parent class method
		super.withdrawal(amt);

		// check if balance has fallen below the minimum required (500)
		if (getBalance() < 500) {

			// charge a $10 fee by withdrawing additional amount
			super.withdrawal(10.00);

			// inform the user about the fee
			System.out.println("Minimum balance not maintained. $10 fee charged.");
		}
	}
}