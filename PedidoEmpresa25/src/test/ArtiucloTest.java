package test;

import org.junit.jupiter.api.Test;

import modelo.dominio.Articulo;
import modelo.dominio.Persona;
import modelo.repositorios.RepositorioLista;

class ArtiucloTest {

	@Test
	void test() {
		RepositorioLista<Articulo,Long> articuloRepositorioLista=new RepositorioLista<Articulo, Long>();
		RepositorioLista<Persona,String> personaRepositorioLista=new RepositorioLista();
		
	}

}
