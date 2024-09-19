package invencionpura14;

public class PajaraEnfadadoViewMiError implements PajaroEnfadadoView {

	@Override
	public void Mostrar(PajaroEnfadado pajaroEnfadado) {
		System.err.println(pajaroEnfadado.nombre);

	}

}
