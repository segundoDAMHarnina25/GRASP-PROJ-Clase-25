package modelo.repositorios;

import java.util.Optional;

public class RepositorioFicheroIndexado <T extends Keyable<S>, S> implements Repository<T, S> {

	@Override
	public boolean add(T objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<T> getByKey(S key) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean update(T objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<T> delete(S key) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
