import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Polygon{

	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled) {
		super(color, filled);
		location = new Point[4];
		location[0] = pointUL;
		
		Point r1 = new Point(pointUL.x, pointUL.y + height);
		Point r2 = new Point(pointUL.x + width, pointUL.y + height);
		Point r3 = new Point(pointUL.x + width, pointUL.y);
		location[1] = r1;
		location[2] = r2;
		location[3] = r3;
	}
}
