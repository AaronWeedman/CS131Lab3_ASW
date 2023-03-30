 /**
 * The purpose of the Square class is to create a square object with a side length.
 *
 * @author Aaron Weedman
 * @version 1.0
 * Lab 3
 * Spring 2023
 *
 */
public class Square {
	
	private double side;//the side variable will be used to represent the side length of the square
	
	/*
	 * This is a default constructor where side = 0.0.
	 */
	
	public Square() {
		side = 0.0; 
	}//end default constructor
	
	/*
	 * This is a preferred constructor with parameter s, where side = s.
	 */
	
	public Square(double s) {
		side = s;
	}//end preferred constructor
	
	/*
	 * The getArea method will return the area of a square.
	 * @ return side * side
	 */
	
	public double getArea() {
		return side * side;
	}//end getArea

	/*
	 * getter for side
	 * @return the side
	 */
	public double getSide() {
		return side;
	}//end getSide

	/**
	 * setter for side
	 * @param side the side to set
	 */
	public void setSide(double aSide) {
		side = aSide;
	}//end setSide
	
	/*
	 * The toString Method will return the side length of the square, and it's area.
	 */
	
	public String toString() {
		return ("\nSide: " + side + "\nArea: " + getArea() + "\n");
	}//end toString
	
}//end class
