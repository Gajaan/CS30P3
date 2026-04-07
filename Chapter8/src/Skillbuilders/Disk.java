package Skillbuilders;

import java.awt.geom.Arc2D.Double;

public class Disk extends Circle {
private double thickness;

public Disk(double r, double t) {
	super(r);
	thickness= t;
	
}
public void setthickness(double newt) {
	thickness=newt;
}
public double getThickness() {
	return thickness;
}

public double volume() {
	double v;
	v = super.area()*thickness;
	return v;
}
public boolean equals(Object obj) {
	Disk testObj=(Disk)obj;
	if(testObj.getRadius()==super.getRadius() && testObj.getThickness()==thickness) {
		return true;
	}
	else
	{
		return false;
	}
}
	
	public String toString() {
		String diskString;
		diskString="The disk has radius "+super.getRadius()+" and thickness "+thickness+"";
		return diskString;
	}
}


