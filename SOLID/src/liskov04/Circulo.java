package liskov04;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Circulo extends MoveableShape {

	public Circulo(Point point) {
		super(point);
	}
	
	@Override
	public void mover(Movement movement) {
		super.mover(movement);
		System.out.println("que agusto se esta despues de moverse");
	
	}
	
	//herencia rechazado
	@Override
	public int getAmountOFVertix() {
		// TODO Auto-generated method stub
		return 0;
	}

}
