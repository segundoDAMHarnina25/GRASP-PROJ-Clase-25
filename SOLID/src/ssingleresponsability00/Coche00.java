package ssingleresponsability00;

class Coche00 {
	String marca;
	DDBB base;

	Coche00(String marca) {
		this.marca = marca;
	}

	String getMarcaCoche() {
		return marca;
	}
	// no tiene una responsabilidad unica

	void guardarCocheDB(Coche00 coche) {
		// guarda el coche en la bbdd
		base.almacena(coche);
	}
}