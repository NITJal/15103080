package Assignment_1;

import javax.swing.JFrame;

/*Write a java program to create an abstract class named Shape that contains an empty method named number Of Sides ( ).
 * Provide three classes named Trapezoid, Triangle and Hexagon such that each one of the classes extends the class Shape. 
 * Each one of the classes contains only the method number Of Sides ( ) that shows the number of sides in the given 
 * geometrical figures.
 * 
 * Soluiton By : 15103080
 */


abstract class Shape{
	abstract void numberOfSides();
}

class Trapezoid extends Shape{

	@Override
	void numberOfSides() {
		System.out.println("Number Of Sides In Traiange: 4");	
	}
	
}

class Triangle extends Shape{

	@Override
	void numberOfSides() {
		System.out.println("Number Of Sides In Traiange: 3");
	}
	
}

class Hexagon extends Shape{

	@Override
	void numberOfSides() {
		System.out.println("Number Of Sides In Hexagon: 6");	
	}
	
}

public class AbstractClassTest {
	public static void main(String []args){
		Trapezoid trapezoid = new Trapezoid();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		
		trapezoid.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	}
}
