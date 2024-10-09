package segregacioninterface02;

public class Penguin implements Bird {

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String tweet() {
		// TODO Auto-generated method stub
		return null;
	}
	//Cual es la firma de este metodo para java
	public String hazAlgo(String cosa,float otro) {
		return cosa;
		
	}
	public String hazAlgo(String cosa,int otro) {
		return cosa;
		
	}
	public float hazAlgo(float diferente,int otro) {
		return diferente;
		
	}
	public String hazAlgo(float diferente,int otro) {
		return String.valueOf(diferente);
		
	}
	//hazAlgo(String,float)
	//hazAlgo(String,int)
}
