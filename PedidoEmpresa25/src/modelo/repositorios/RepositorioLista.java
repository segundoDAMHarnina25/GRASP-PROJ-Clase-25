package modelo.repositorios;

import java.util.List;
import java.util.Optional;

public class RepositorioLista<T extends Keyable<S>, S> implements Repository<T, S> {
	protected List<T> elementos;
	
	@Override
	public boolean add(T objeto) {
		return elementos.add(objeto);
	}

	@Override
	public Optional<T> getByKey(S key) {
		return elementos.stream().filter((elemento) -> {
			return (elemento).equalKey(key);
		}).findFirst();
	}

	@Override
	public boolean update(T objeto) {
		if (elementos.remove(objeto)) {
			return elementos.add(objeto);
		}
		return false;
	}

	@Override
	public Optional<T> delete(S key) {
		Optional<T> byKey = getByKey(key);
		if (byKey.isPresent()) {
			elementos.remove(byKey.get());
			return byKey;
		}
		return Optional.empty();
	}

}
