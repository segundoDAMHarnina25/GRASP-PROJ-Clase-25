package ejercicioacoplamientomal16;

public class Persona {
	private String nombre;
	private int edad;
	private Direccion direccion;

	public Persona(String nombre, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public void imprimirInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println(direccion.getDireccion());
		//Envidia de caracteristicas
//		System.out.println("Direccion "+direccion.getCalle()+" "+direccion.getCiudad()+direccion.getCodigoPostal());
	}

	public boolean isInSameStreet(Direccion direccion) {
		return this.direccion.inSameStreet(direccion);
	}
}
