import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/* Description
 * -----------
 * Child of JPanel class, contains most of
 * the drawing of the cars and lanes
 * 
 * Author
 * ------
 * Andy Fleischer
 * 
 * Date
 * ----
 * Last updated: 6/5/2020
 */

public class Road extends JPanel {

	final int LANE_HEIGHT = 120;
	final int ROAD_WIDTH = 800;
	ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	int carCount = 0;
	
	
	public Road() {
		super();
	}
	
	public void addCar(Vehicle v) {
		cars.add(v);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.WHITE);
		for (int i = LANE_HEIGHT; i < LANE_HEIGHT * 4; i += LANE_HEIGHT) { //which lane
			for (int j = 0; j < getWidth(); j+=40) { //which line
				g.fillRect(j, i, 30, 5);
				
			}
		}
		//Draw cars
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).paintMe(g);
		}
		
	}
	
	public void step() {
		for (int i = 0; i < cars.size(); i++) {
			Vehicle v = cars.get(i);
			
			if (!collision(v.getX() + v.getSpeed(), v.getY(), v)) {
				v.setX(v.getX() + v.getSpeed());
				if (v.getX() > ROAD_WIDTH) {
					if (!collision(0, v.getY(), v)) {
						v.setX(0);
						carCount++;
					}
				}
			}
			else {
				if (v.getY() > 40 && !collision(v.getX(), v.getY() - LANE_HEIGHT, v)) {
					v.setY(v.getY() - LANE_HEIGHT);
				}
				else if (v.getY() < 40 + 3 * LANE_HEIGHT && !collision(v.getX(), v.getY() + LANE_HEIGHT, v)) {
					v.setY(v.getY() + LANE_HEIGHT);
				}
			}
		}
	}
	
	public boolean collision(int x, int y, Vehicle v) {
		for (int i = 0; i < cars.size(); i++) {
			Vehicle u = cars.get(i);
			if (y == u.getY()) { //in the same lane
				if (!u.equals(v)) { //if I'm not checking myself
					if (x < u.getX() + u.getWidth() && //my left is left of his right
							x + v.getWidth() > u.getX()) { //my right is right of his left
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public int getCarCount() {
		return carCount;
	}
	
	public void resetCarCount() {
		carCount = 0;
	}
	
}
