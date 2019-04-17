import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon{

	public PolyLine (Point pointUL, Point pointUR, int thickness, Color color, boolean fill) {
		super(color, fill);
		location = new Point[4];
		location[0] = pointUL;
		location[1] = pointUR;
		
		Point pointLR = new Point(pointUR.x, pointUR.y + thickness);
		Point pointLL = new Point(pointUL.x, pointUL.y + thickness);
		location[2] = pointLR;
		location[3] = pointLL;
	}
}
