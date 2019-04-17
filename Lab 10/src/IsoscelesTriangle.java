import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle{
	
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean fill) {
		super(pointLB, color, fill);
		location = new Point[3];
		location[0] = pointLB;
		
		Point two = new Point((int)(pointLB.x + .5*base), pointLB.y + height);
		Point three = new Point(pointLB.x + base, pointLB.y);
		location[1] = two;
		location[2] = three;
	}

}
