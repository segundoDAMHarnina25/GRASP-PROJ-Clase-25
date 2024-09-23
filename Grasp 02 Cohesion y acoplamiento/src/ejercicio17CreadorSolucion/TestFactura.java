package ejercicio17CreadorSolucion;

import org.junit.jupiter.api.Test;

class TestFactura {

	@Test
	void test() {
		String nombre = "Crispulo";
		Cliente cliente = new Cliente(nombre);
		Pedido miPedido = new Pedido("1", "fecha", cliente);
		miPedido.addLinea("tornillo grande", 8.5f);
		miPedido.addLinea("arandela grande", 6.5f);
		miPedido.addLinea("destornillador", 9.5f);
//		Factura factura=miPedido.getFactura();
		Factura factura = new GeneradorFactura(miPedido).getFactura();
		GeneradorEstaticoFactura generadorEstaticoFactura = new GeneradorEstaticoFactura() {
		};
		Factura facturaDos = generadorEstaticoFactura.getFactura(miPedido);
		Factura factura2 = GeneradorRareteFactura.getFactura(miPedido);
	}

}
