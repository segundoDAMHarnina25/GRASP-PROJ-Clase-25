package modelo.dominio;

import java.util.Objects;

public class Persona {
	private String dNICliente;
	private String nombre;
	
	public Persona(String dNICliente, String nombre) {
		super();
		this.dNICliente = dNICliente;
		this.nombre = nombre;
	}

	public String getdNICliente() {
		return dNICliente;
	}

	public void setdNICliente(String dNICliente) {
		this.dNICliente = dNICliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dNICliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dNICliente, other.dNICliente);
	}
	
}
