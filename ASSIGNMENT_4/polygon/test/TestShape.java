package com.test;
import com.shape.*;
public class TestShape {

	public static void main(String[] args) {
		Square sq=new Square(4.0f);
		sq.calcArea();
		sq.calcPeri();
		Rectangle rl=new Rectangle(4.0f,5.0f);
		rl.calcArea();
		rl.calcPeri();
	}

}
