package liskov04;

import java.awt.Color;
import java.awt.Point;

public abstract class MoveableShape extends Shape {
	public MoveableShape(Point point) {
		super(point);
		// TODO Auto-generated constructor stub
	}

	public void mover(Movement movement) {
		point.setLocation(point.getX() + movement.getHorizontal(), point.getY() + movement.getVertical());
	}

	public abstract int getAmountOFVertix();

	public Color getColor() {
		return Color.BLACK;
	}

}
