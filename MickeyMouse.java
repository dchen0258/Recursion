import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class MickeyMouse extends GraphicsProgram {
	
	public void run() {
		setBackground(Color.GRAY);
		int numberOfRecursions = 7;
		double width = getWidth() / 2;
		double height = getHeight() / 2;
		double length = 200;
		drawMickeyMouse(numberOfRecursions, width, height, length);
	}
	
	public void drawMickeyMouse(int numberOfRecursions, double x, double y, double length) {
		if (numberOfRecursions == 0) {
			
		} else {
			drawMickeyMouse(numberOfRecursions - 1, x + length / 2, y + length / 2, length / 2);
			drawMickeyMouse(numberOfRecursions - 1, x - length / 2, y + length / 2, length / 2);
			drawMickeyMouse(numberOfRecursions - 1, x + length / 2, y - length / 2, length / 2);
			drawMickeyMouse(numberOfRecursions - 1, x - length / 2, y - length / 2, length / 2);
			GOval Circle = new GOval(length, length);
			add(Circle, x - Circle.getWidth() / 2, y - Circle.getHeight() / 2);
			Circle.setFillColor(Color.BLACK);
			Circle.setFilled(true);
			Circle.setColor(Color.WHITE);
		}
	}
}
