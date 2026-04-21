package Skillbuilders;

public abstract class  CEmployee {
private String FirstName, lastname;

public CEmployee(String fn, String ln) {
	FirstName=fn;
	lastname=ln;
}

public String toString() {
	return(FirstName+""+lastname);
}
abstract double pay(double period); 
	

}
