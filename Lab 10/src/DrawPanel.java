import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	private ArrayList<Shape> shapelist;
	
	public DrawPanel() {
		shapelist = new ArrayList<Shape>();
	}
	public void addShape(Shape shape) {
		shapelist.add(shape);
	}
	protected void paintComponent(Graphics graphics) {
		
		for (int index = 0; index < shapelist.size(); ++index) 
		{
			shapelist.get(index).draw(graphics);
		}
		
	}

}
