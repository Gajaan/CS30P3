package Skillbuilders;

public class puck extends Disk implements Comparable{

	private double weight;
	private boolean standard, youth;
	
	
	public double MIN_STD_W=5;
	public double MAX_STD_W=5.5;
	public double MIN_YTH_W=4;
	public double MAX_YTH_W=4.5;
	
	public puck(double w) {
		super(1.5, 1);
		
		weight=w;
		
		if(weight >= MIN_STD_W && weight <= MAX_STD_W ) {
			
			standard = true;
			youth = false;
		}
		
		else {
			standard = false;
			youth = true;
		}
		
		
	}
	public double getweight() {
		return weight;
	}
	
	public void setweight(double w) {
		weight =w;
	}
	
	public String getDivision() {
		String div;
		if(standard) {
			div="puck is standard";
		}
		
		else
		{
			div="puck is youth";
			
		}
		
		return div;
		
	}
	
	public boolean equals(Object obj) {
		puck testObj=(puck)obj;
		if(testObj.getDivision()== getDivision()) {
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public int compareTo(Object p)
	{
	puck testPuck=(puck)p;
	
	if(weight<= testPuck.getweight()) {
		return -1;
	}
	
	else if(weight == testPuck.getweight()) {
		return 0;
	}
	
	else {
		
		return 1;
	}
	
	}
	
	public String toString() {
		String puckString;
		
		puckString="The puck has wight" + getweight()+" and divission is " +getDivision()+"";
		
		return puckString;
	}
}
