package ssingleresponsability00;

public class Coche01 {

	String marca;

	Coche01(String marca) {
		this.marca = marca;
	}

	String getMarcaCoche() {
		return marca;
	}
}

class CocheDB {
	void guardarCocheDB(Coche01 coche) {
		// grabar
	}

	void eliminarCocheDB(Coche01 coche) {
		// borrar
	}

}
