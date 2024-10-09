package liskov04;

import java.awt.Point;
import java.util.Random;

public class Generador {

	public static MoveableShape getShape() {
		int nextInt = new Random().nextInt(12);
		if (nextInt < 5)
			return new Circulo(new Point());
		return new Cuadrado(new Point());
	}
}
