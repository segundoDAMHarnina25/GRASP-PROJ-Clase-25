package inversiondepndencias05;

import java.util.ArrayList;

public class Entrada {
	public static void main(String[] args) {
		
		//Yo soy el codigo cliente
		Principal principal=new Principal();
		A a = new B();
		a.dame(new ArrayList<>());
		principal.arrancando(a);
		
		B b =new B();
		B c =new C();
	}
}
