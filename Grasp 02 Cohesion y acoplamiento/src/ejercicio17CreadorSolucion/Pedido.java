package ejercicio17CreadorSolucion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pedido {
	public String idPedido;
	public String datos_Pedido;
	public Cliente cliente;
	private List<String> nombrelineas;
	private List<Float> subtotales;

	public Pedido(String idPedido, String datos_Pedido, Cliente cliente) {
		super();
		this.idPedido = idPedido;
		this.datos_Pedido = datos_Pedido;
		this.cliente = cliente;
//		lineas = new HashMap<String,Float>();
		nombrelineas=new ArrayList();
		subtotales=new ArrayList();
	}

	public void addLinea(String concepto, float subtotal) {
		nombrelineas.add(concepto);
		subtotales.add(subtotal);
	}
//	public Factura getFactura() {
//		Factura factura=new Factura();
//		factura.cliente=this.cliente;
//		factura.id_Factura=this.idPedido;
//		factura.total=calculaTotal();
//		return factura;
//	}

	Float calculaTotal() {
		float acumulador=0;
//		for (Float element : lineas.values()) {
//			acumulador+=element;
//		}
		return acumulador;
	}

}
