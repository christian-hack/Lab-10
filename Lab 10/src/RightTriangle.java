import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle{

	public RightTriangle(Point pointRA, int base, int height, Color color, boolean fill) {
		super(pointRA, color, fill);
		location = new Point[3];
		location[0] = pointRA;
		
		Point upAng = new Point(pointRA.x, pointRA.y + height);
		Point adjAng = new Point(pointRA.x + base, pointRA.y);
		location[1] = upAng;
		location[2] = adjAng;
	}
}
