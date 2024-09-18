package cohesionfuncional03;

public class UsoBien3 {
	public static void main(String[] args) {
		
		SomeObject someObject = new SomeObject();
		OtherObject objecta = new OtherObject();
		FooBarBien3 barBien = new FooBarBien3() {
		} ;
		barBien.firstMethod(someObject,objecta);
		someObject.SecondCall();
		objecta.oneCall();
	}

}
