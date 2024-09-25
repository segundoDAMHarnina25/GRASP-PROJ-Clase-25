package modelo.repositorios.om;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.dominio.Persona;
import modelo.repositorios.Repository;

public class PersonaRepositoryOM implements Repository<Persona, String> {

	List<Persona> personas;

	public PersonaRepositoryOM() {
		super();
		this.personas = PersonaMother.crearVariasPersonas();
	}

	@Override
	public boolean add(Persona objeto) {
		return personas.add(objeto);
	}

	@Override
	public Optional<Persona> getByKey(String key) {
		return personas.stream().filter((persona) -> {
			return persona.getdNICliente().equals(key);
		}).findFirst();
	}

	@Override
	public boolean update(Persona objeto) {
		if (personas.remove(objeto)) {
			return personas.add(objeto);
		}
		return false;
	}

	@Override
	public Optional<Persona> delete(String key) {
//		Persona borrado=null;
//		for (Iterator iterator = personas.iterator(); iterator.hasNext();) {
//			Persona persona = (Persona) iterator.next();
//			if(persona.getdNICliente().equals(key)) {
//				borrado=persona;
//				iterator.remove();
//			}
//		}
//		return Optional.ofNullable(borrado);

		Optional<Persona> byKey = getByKey(key);
		if (byKey.isPresent()) {
			personas.remove(byKey.get());
			return byKey;
		}
		return Optional.empty();
//		/
//		Optional<Persona> byKey = getByKey(key);
//		personas = personas.stream().filter((persona) -> {
//			return !persona.getdNICliente().equals(key);
//		}).collect(Collectors.toList());
//		return byKey;
	}

}
