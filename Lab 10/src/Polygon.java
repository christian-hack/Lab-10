import java.awt.Color;
import java.awt.Graphics;

public abstract class Polygon extends Shape{

	public Polygon (Color color, boolean filled) {
		super(color, filled);
	}
	
	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(getColor());
		
		int[] xp = new int[location.length];
		int[] yp = new int[location.length];
		
		for (int index = 0; index < location.length; ++index) {
			xp[index] = location[index].x;
			yp[index] = location[index].y;
		}
		if (isFilled()) {
			graphics.fillPolygon(xp, yp, location.length);
		}
		
	}
}
