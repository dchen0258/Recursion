import java.awt.Color;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class HTree extends GraphicsProgram {

	public void run() {
		int numberOfRecursions = 7;
		double width = getWidth() / 2;
		double height = getHeight() / 2;
		double length = 200;
		drawHTreesRecursively(numberOfRecursions, width, height, length);

	}
 //draws each tree using the corners as coordinates that reset each time, and lengths that half each time
	public void drawHTreesRecursively(int numberOfRecursions, double x, double y, double length) {
		if (numberOfRecursions ==0) {
		
		} else {
			GLine leftLine = new GLine(x - length / 2, y + length / 2, x - length / 2, y - length / 2);
			GLine middleLine = new GLine(x - length / 2, y, x + length / 2, y);
			GLine rightLine = new GLine(x + length / 2, y + length / 2, x + length / 2, y - length / 2);
			add(leftLine);
			add(middleLine);
			add(rightLine);
			drawHTreesRecursively(numberOfRecursions - 1, x + length / 2, y + length / 2, length / 2);
			drawHTreesRecursively(numberOfRecursions - 1, x - length / 2, y + length / 2, length / 2);
			drawHTreesRecursively(numberOfRecursions - 1, x + length / 2, y - length / 2, length / 2);
			drawHTreesRecursively(numberOfRecursions - 1, x - length / 2, y - length / 2, length / 2);
		}
	}
}
