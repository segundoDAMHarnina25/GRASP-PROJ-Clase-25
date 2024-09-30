package modelo.repositorios;

import modelo.dominio.Persona;
import modelo.repositorios.om.PersonaMother;

public class PersonaRepositorioListaOM extends RepositorioLista <Persona,String>{

	public PersonaRepositorioListaOM() {
		super();
		this.elementos = PersonaMother.crearVariasPersonas();
	}

	
}
