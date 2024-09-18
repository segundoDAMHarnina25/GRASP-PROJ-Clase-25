package cohesionfuncional03;

public class UsoBien2 {
	public static void main(String[] args) {
		
		SomeObject someObject = new SomeObject();
		OtherObject objecta = new OtherObject();
		FooBarBien2 barBien = new FooBarBien2(someObject,objecta);
		barBien.firstMethod();
		someObject.SecondCall();
		objecta.oneCall();
	}

}
