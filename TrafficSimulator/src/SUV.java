import java.awt.Color;
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
 * 
 */

public class SUV extends Vehicle {

	public SUV(int newX, int newY) {
		super(newX, newY);
		width = 60;
		height = 30;
		speed = 8;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
	
}
