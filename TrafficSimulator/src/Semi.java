import java.awt.Color;
import java.awt.Graphics;

/* Description
 * -----------
 * Child of Vehicle class, a large
 * and slow semi
 * 
 * Author
 * ------
 * Andy Fleischer
 * 
 * Date
 * ----
 * Last updated: 6/5/2020
 */

public class Semi extends Vehicle {

	public Semi(int newX, int newY) {
		super(newX, newY);
		width = 120;
		height = 40;
		speed = 5;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
	
}
