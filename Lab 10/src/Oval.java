import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape{

	private int diameter1;
	private int diameter2;
	
	public Oval(Point pointUL, int d1, int d2, Color color, boolean filled) {
		super(color, filled);
	}
	public int getDiameter1() {
		return this.diameter1;
	}
	public int getDiameter2() {
		return this.diameter2;
	}
	public void draw(Graphics graphics) {
		
	}
}
