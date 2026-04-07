package Skillbuilders;

public class Circle {
private static double Pi=3.14;
private double radius;

public Circle()
{
	
radius=1;	
}

public Circle(double r)
{
	radius=r;
}

public void setRadius(double newR) {
	radius=newR;
}

public double getRadius() {
	return radius;
}
public double area() {
	double circleArea;
	
	circleArea=Pi*radius*radius;
	return(circleArea);
}

public boolean equals(Object obj) {
	Circle testobj=(Circle)obj;
	
	if(testobj.getRadius()==radius) {
		return(true);
	}
	else {
		return(false);
	}
}

public String toString() {
	String circleString;
	circleString="circle has radius" +radius;
	return(circleString);
}
}

