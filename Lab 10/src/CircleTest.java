import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

	@Test
	public void test() {
		Circle test1 = new Circle((new Point(0, 0)), 1, Color.black, true);
		Circle test2 = new Circle((new Point(1, 1)), 1, Color.black, true);
		
		Assert.assertEquals("Incorrect color result", Color.black, test1.getColor());
		
		Point a = new Point(0,0);
		Point[] b = new Point[1];
		b[0] = a;
		Assert.assertEquals("Incorrect location given", b, test1.getLocation());
		Assert.assertEquals("Incorrect diameter",1, test1.getDiameter());
		
		Oval oval = new Oval((new Point(0,0)), 1, 2, Color.black, true);
		Assert.assertEquals("Incorrect diameter", 1, oval.getDiameter1());
		Assert.assertEquals("Incorrect diamter", 2, oval.getDiameter2());
		Assert.assertEquals("Incorrect boolean value", true, oval.isFilled());
		
		Rectangle rec = new Rectangle((new Point(0,0)), 2, 4, Color.black, true);
		Assert.assertEquals("Incorrect value", Color.black, rec.getColor());
		Point[] c = new Point[4];
		Point new1 = new Point(0, 4);
		Point new2 = new Point(2, 4);
		Point new3 = new Point(2, 0);
		c[0] = a;
		c[1] = new1;
		c[2] = new2;
		c[3] = new3;
		Assert.assertEquals("Incorrect value", c, rec.getLocation());
		Assert.assertEquals("Incorrect value", true, rec.isFilled());
		
		RightTriangle rt = new RightTriangle((new Point(0,0)), 2, 1, Color.black, true);
		Point[] d = new Point[3];
		Point one = new Point(0,1);
		Point two = new Point(2,0);
		d[0] = a;
		d[1] = one;
		d[2] = two;
		Assert.assertEquals("Incorrect value", Color.black, rt.getColor());
		Assert.assertEquals("Incorrect value", d, rt.getLocation());
		Assert.assertEquals("Incorrect value", true, rt.isFilled());
		
		Square sq = new Square((new Point(0,0)), 5, Color.black, true);
		Point[] e = new Point[4];
		Point x = new Point(0, 5);
		Point y = new Point(5,5);
		Point z = new Point(5,0);
		e[0] = a;
		e[1] = x;
		e[2] = y;
		e[3] = z;
		
		Assert.assertEquals("Incorrect value",Color.black, sq.getColor());
		Assert.assertEquals("Incorrect value", e, sq.getLocation());
	}

}
