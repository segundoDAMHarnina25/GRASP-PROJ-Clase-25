package cohesionfuncional03;

public interface FooBarBien3 {

	default public void firstMethod(SomeObject someObject, OtherObject otherObject) {
		someObject.FirstCall();
		otherObject.oneCall();
		System.out.println("funciona");
	}

}
