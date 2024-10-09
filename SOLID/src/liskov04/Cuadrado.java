package liskov04;

import java.awt.Point;

public class Cuadrado extends MoveableShape {
//	public class Cuadrado extends Shape {

	public Cuadrado(Point point) {
		super(point);
	}

	
	@Override
	public void mover(Movement movement) {
		super.mover(movement);
		System.out.println("Yo no me muevo");
	}

	@Override
	public int getAmountOFVertix() {
		return 4;
	}
}
