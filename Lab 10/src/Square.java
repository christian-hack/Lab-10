import java.awt.Color;
import java.awt.Point;

public class Square extends Rectangle{

	public Square(Point pointUL, int width, Color color, boolean filled) {
		super(pointUL, width, width, color, filled);
		location = new Point[4];
		location[0] = pointUL;
		
		Point ul = new Point(pointUL.x, pointUL.y + width);
		Point ur = new Point(pointUL.x + width, pointUL.y + width);
		Point ll = new Point(pointUL.x + width, pointUL.y);
		location[1] = ul;
		location[2] = ur;
		location[3] = ll;
	}
}
