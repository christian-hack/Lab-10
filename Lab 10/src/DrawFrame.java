import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame{
	
	private DrawPanel drawPanel = new DrawPanel();
	
	public DrawFrame(String title) {
		super(title);
		
		Circle head = new Circle((new Point(250,250)), 75, Color.BLACK, true);
		drawPanel.addShape(head);
		Oval body = new Oval((new Point(240, 325)), 50, 100, Color.BLACK, true);
		drawPanel.addShape(body);
		Rectangle arm = new Rectangle((new Point(265,350)), 80, 20, Color.BLACK, true);
		drawPanel.addShape(arm);
		Oval LLeg = new Oval((new Point(265, 410)), 25, 45, Color.BLACK, true);
		drawPanel.addShape(LLeg);
		Oval RLeg = new Oval((new Point(235, 410)), 25, 45, Color.BLACK, true);
		drawPanel.addShape(RLeg);
		Rectangle mask = new Rectangle((new Point(255, 280)), 70, 20, Color.RED, true);
		drawPanel.addShape(mask);
		Oval LEye = new Oval((new Point(260, 283)), 15, 10, Color.WHITE, true);
		drawPanel.addShape(LEye);
		Oval REye = new Oval((new Point(300, 283)), 15, 10, Color.WHITE, true);
		drawPanel.addShape(REye);
		Sinusoid weeds = new Sinusoid(Color.green, (new Point(0, 400)), 2, 10, 10);
		drawPanel.addShape(weeds);
		Rectangle staff = new Rectangle((new Point(340, 200)), 10, 250, Color.YELLOW, true);
		drawPanel.addShape(staff);
		Rectangle boat = new Rectangle((new Point(200, 425)), 200, 50, Color.YELLOW, true);
		drawPanel.addShape(boat);
		RightTriangle boatFront = new RightTriangle((new Point(400, 425)), 30, 50, Color.YELLOW, true);
		drawPanel.addShape(boatFront);
		
		
		add(drawPanel);
		setSize(500,500);
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}
	public static void main(String[] args) {
		new DrawFrame("AquaMan");
		
	}

}
