package ejercicio17CreadorSolucion;

public class GeneradorRareteFactura {
	public static Factura getFactura(Pedido pedido) {
		Factura factura = new Factura();
		factura.cliente = pedido.cliente;
		factura.id_Factura = pedido.idPedido;
		factura.total = pedido.calculaTotal();
		return factura;
	}
}
