package inyeccionDependencias06;

public class Principal {
public static void main(String[] args) {
	//inyeccion
	B b=new B(new A());
	b.setA(new A());
}
}
