package liskov04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class testDos {

	@Test
	void test() {
		MoveableShape shape=Generador.getShape();
		shape.mover(new Movement(3, 3));
	}

}
