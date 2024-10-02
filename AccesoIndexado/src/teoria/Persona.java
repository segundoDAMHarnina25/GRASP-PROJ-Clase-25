package teoria;

import java.io.Serializable;

public class Persona implements Serializable {
	public int id;
	public String nombre;
	
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
