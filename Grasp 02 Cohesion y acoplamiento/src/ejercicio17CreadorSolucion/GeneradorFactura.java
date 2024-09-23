package ejercicio17CreadorSolucion;

public class GeneradorFactura {
	public Pedido pedido;
	
	
	public GeneradorFactura(Pedido pedido) {
		super();
		this.pedido = pedido;
	}


	public Factura getFactura() {
		Factura factura=new Factura();
		factura.cliente=pedido.cliente;
		factura.id_Factura=pedido.idPedido;
		factura.total=pedido.calculaTotal();
		return factura;
	}

}
