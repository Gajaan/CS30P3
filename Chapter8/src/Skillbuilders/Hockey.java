package Skillbuilders;

public class Hockey {

	public static void main(String[] args) {
		
		puck yPuck = new puck(4.1);
		puck spuck = new puck(5.2);
		
		Circle c1 = new Circle(3.0);
		
		Circle c2 = new Circle(2.0);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(yPuck.getDivision());
		
		System.out.println(spuck.getDivision());
		

	}

}
