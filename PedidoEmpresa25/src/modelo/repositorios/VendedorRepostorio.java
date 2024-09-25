package modelo.repositorios;

import java.util.Optional;

import modelo.dominio.Vendedor;

public class VendedorRepostorio implements Repository<Vendedor, String> {

	@Override
	public boolean add(Vendedor objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Vendedor> getByKey(String key) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean update(Vendedor objeto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Vendedor> delete(String key) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
