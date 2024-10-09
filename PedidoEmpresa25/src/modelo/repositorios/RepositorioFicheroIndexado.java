package modelo.repositorios;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import exceptions.IndexNotAccsibleException;
import exceptions.NotFolderPath;

public class RepositorioFicheroIndexado <T extends KeyAccesible<S>, S> implements Repository<T, S> {
	
	private String pathFolder;
	private String indexFile, objectFile;
	private Map<S, Long> index;
	private AccesibleUnicoObjeto<Map<S, Long>> accesoSerializadoUnicoObjeto;
	private AccesibleMultiObjeto<T> accesoSerializadoAleatorioMultiObjeto;
	
	public RepositorioFicheroIndexado(String pathFolder,AccesibleMultiObjeto<T> accesoSerializadoAleatorioMultiObjeto) throws NotFolderPath, IndexNotAccsibleException  {
		super();
		this.pathFolder = pathFolder;
		checkPath(pathFolder);
		createPaths();
		if(!loadIndex()) throw new IndexNotAccsibleException();
		this.accesoSerializadoAleatorioMultiObjeto=accesoSerializadoAleatorioMultiObjeto;
		this.accesoSerializadoAleatorioMultiObjeto.setPath(objectFile);
	}

	private void createPaths() {
		indexFile = "./" + pathFolder + "/index.data";
		objectFile = "./" + pathFolder + "/objects.data";
	}

	private boolean loadIndex() {
		try {
			accesoSerializadoUnicoObjeto = new AccesoFicheroSerializadoUnicoObjeto<Map<S, Long>>(indexFile);
			index = accesoSerializadoUnicoObjeto.load().orElse(new HashMap<>());
			if(index.size()==0) accesoSerializadoUnicoObjeto.save(index);
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void checkPath(String pathFolder) throws NotFolderPath {
		File folder = new File(pathFolder);
		// si existe y es un directorio
		boolean exists = folder.exists();
		if (exists && !folder.isDirectory())
			throw new NotFolderPath();
		if (!exists) {
			folder.mkdir();
		}
	}

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
