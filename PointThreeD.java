/**
 * This class will be used to create three points that will make up a 3-D Plot.
 * 
 * @author Aaron Weedman
 * @version 1.0
 * Lab 3
 * Spring 2023
 */

public class PointThreeD {
	
	private double xPoint;// xPoint will be used as the x-axis point in a 3D plot.
	private double yPoint;// yPoint will be used as the y-axis point in a 3D plot.
	private double zPoint;// zPoint will be used as the z-axis point in a 3D plot.
	
	/*
	 * This is a default constructor for PointThreeD where all points are set to 0.0.
	 */
	
	public PointThreeD() {
		xPoint = 0.0;
		yPoint = 0.0;
		zPoint = 0.0;
	}//end default constructor
	
	/*
	 * This is a preferred constructor where xPoint = x, yPoint = y, and zPoint = z.
	 */
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor
	
	/**
	 * getter for xPoint
	 * @return the xPoint
	 */
	public double getXPoint() {
		return xPoint;
	}//end getXPoint

	/**
	 * setter for xPoint
	 * @param xPoint the xPoint to set
	 */
	public void setXPoint(double aXPoint) {
		xPoint = aXPoint;
	}//end setXPoint

	/**
	 * getter for yPoint
	 * @return the yPoint
	 */
	public double getYPoint() {
		return yPoint;
	}//end getYPoint

	/**
	 * setter for yPoint
	 * @param yPoint the yPoint to set
	 */
	public void setYPoint(double aYPoint) {
		yPoint = aYPoint;
	}//end setYPoint

	/**
	 * getter for zPoint
	 * @return the zPoint
	 */
	public double getZPoint() {
		return zPoint;
	}//end getZPoint

	/**
	 * setter for zPoint
	 * @param zPoint the zPoint to set
	 */
	public void setZPoint(double aZPoint) {
		zPoint = aZPoint;
	}//end setZPoint

	/*
	 * the toString method returns the x, y, and z point
	 */
	
	public String toString() {
		return ("\nx: " + xPoint + "\ny: " + yPoint + "\nz: " + zPoint);
	}//end toString

}//end class