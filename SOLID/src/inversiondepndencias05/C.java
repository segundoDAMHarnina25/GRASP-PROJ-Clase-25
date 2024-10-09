package inversiondepndencias05;

import java.util.List;

public class C extends A {
@Override
public void dame(List<String> cc) {
	//para liskov
	super.dame(cc);
	System.out.println("tambien hago cosas de hijo");
}
}
