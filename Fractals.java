import java.awt.Color;

import acm.graphics.GTurtle;
import acm.program.GraphicsProgram;

public class Fractals extends GraphicsProgram {

	public void run() {
		int order = 4;
		int size = 10;

		GTurtle turtle = new GTurtle(0, 300);
		add(turtle);

		turtle.showTurtle();
		turtle.penDown();
		turtle.setColor(Color.BLACK);
		turtle.setSpeed(1.0);
		turtle.setSize(size);

		drawCesaro(turtle, order, size);

	}

	public void koch(GTurtle turtle, int order, int size) {
		if (order == 0) {
			turtle.forward(0.4);
		} else {
			koch(turtle, order - 1, size / 3);
			turtle.left(60);
			koch(turtle, order - 1, size / 3);
			turtle.right(120);
			koch(turtle, order - 1, size / 3);
			turtle.left(60);
			koch(turtle, order - 1, size / 3);

		}

	}

	public void kochs(GTurtle turtle, int order, int size) {
		if (order == 0) {
			turtle.forward(0.4);
		} else {
			koch(turtle, order - 1, size / 3);
			turtle.right(120);
			koch(turtle, order - 1, size / 3);
			turtle.right(120);
			koch(turtle, order - 1, size / 3);

		}

	}
	
	public void drawCesaro(GTurtle turtle, int order, int size) {
		if (order == 0) {
			turtle.forward(10);
		}else {
			drawCesaro(turtle, order - 1, size / 3);
			turtle.right(85);
			drawCesaro(turtle, order - 1, size / 3);
			turtle.left(170);
			drawCesaro(turtle, order - 1, size / 3);
			turtle.right(85);
			drawCesaro(turtle, order - 1, size / 3);
		}
	}
}
