package com.shape;

public class Rectangle implements Polygon {
	float length;
	float breadth;
	public Rectangle(float length,float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void calcArea() {
		System.out.println("Area of Rectangle:"+(length*breadth));
	}

	public void calcPeri() {
		
		System.out.println("Perimeter of Perimeter:"+(2*(length+breadth)));
	}

}
