package cohesionfuncional03;

public class UsoBien {
	public static void main(String[] args) {
		FooBarBien barBien = new FooBarBien();
		barBien.firstMethod();
		SomeObject someObject = new SomeObject();
		someObject.SecondCall();
		OtherObject objecta = new OtherObject();
		objecta.oneCall();
	}

}
