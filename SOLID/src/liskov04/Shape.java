package liskov04;

import java.awt.Point;

public abstract class Shape {
	Point point;
	

	public Point getPoint() {
		return point;
	}


	public Shape(Point point) {
		super();
		this.point = point;
	}
	public abstract int getAmountOFVertix();
}
