import arraylist.ArrayList;

/**
 * The purpose of this class is to instantiate different lists and fill them with objects.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Lab 3
 * Spring 2023
 */

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>();//Instantiates a list of strings
		ArrayList<Square> squareList = new ArrayList<Square>();//Instantiates a list of Squares
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();//Instantiates a list of Points
		
		        stringList.addItem("Dog");//Adds "Dog" to the string list
		        stringList.addItem("Cat");//Adds "Cat" to the string list
		        stringList.addItem("Horse");//Adds "Horse" to the string list

		        squareList.addItem(new Square(9.9));//Adds a square with a side length of 9.9 to the square list.
		        squareList.addItem(new Square(2));//Adds a square with a side length of 2 to the square list.
		        squareList.addItem(new Square(4.5));//Adds a square with a side length of 4.5 to the square list.

		        pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));//Adds the set of points (1.0, 2.0, 3.0) to the point list.
		        pointList.addItem(new PointThreeD(5.0, 2.1, 9.9));//Adds the set of points (5.0, 2.1, 9.9) to the point list.
		        pointList.addItem(new PointThreeD(0.9, 0.7, 2.5));//Adds the set of points (0.9, 0.7, 2.5) to the point list.

		        
		        System.out.println("String List: " + stringList.toString());//prints "Dog Cat Horse".
		        System.out.println("Square List: " + squareList.toString());//prints the toString method from the Square class.
		        System.out.println("Point List: " + pointList.toString());//prints the toString method from the PointThreeD class.
		
	}//end main
}//end class