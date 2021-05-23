import java.awt.Color;
import java.awt.Graphics;

/* Description
 * -----------
 * Child of Vehicle class, a small
 * and fast car
 * 
 * Author
 * ------
 * Andy Fleischer
 * 
 * Date
 * ----
 * Last updated: 6/5/2020
 */

public class Sports extends Vehicle {

	public Sports(int newX, int newY) {
		super(newX, newY);
		width = 40;
		height = 20;
		speed = 12;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}
	
}