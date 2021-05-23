import java.awt.Graphics;

/* Description
 * -----------
 * Parent class for all three vehicle types.
 * Each vehicle has an x, y, speed, width,
 * height, and getters/setters
 * 
 * Author
 * ------
 * Andy Fleischer
 * 
 * Date
 * ----
 * Last updated: 6/5/2020
 */


public class Vehicle {

	int x = 0;
	int y = 0;
	int width;
	int height;
	int speed;
	
	public Vehicle(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	public void paintMe(Graphics g) {
		
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int newX) {
		x = newX;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int newY) {
		y = newY;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getWidth() {
		return width;
	}
	
}
