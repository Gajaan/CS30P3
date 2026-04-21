package Skillbuilders;

public class manager extends CEmployee {
	
	private double yearlySalary;
	
	public manager(String fn, String ln, double s) {
		super(fn,ln);
		yearlySalary=s;
	}
public double pay(double weeks) {
	 double payEarned;
	 payEarned= yearlySalary/52*weeks;
	 return payEarned;
	 
}
public String toString() {
	return super.toString()
	+", Manager" +"salary "+yearlySalary;
}

}
