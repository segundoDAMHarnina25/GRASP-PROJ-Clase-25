package ejerciciosCohesion;

import java.util.ArrayList;
import java.util.List;

public class GestorDePedidos02 {

    private List<Producto> productos;
    private Cliente cliente;
    private double total;

    public GestorDePedidos02(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.total = 0.0;
    }

    // Agregar un producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    // Calcular el total del pedido
    public double calcularTotal() {
        return total;
    }

    // Generar el resumen del pedido
    public String generarResumen() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Cliente: ").append(cliente.getNombre()).append("\n");
        resumen.append("Productos:\n");

        for (Producto producto : productos) {
            resumen.append("- ").append(producto.getNombre()).append(": $")
                   .append(producto.getPrecio()).append("\n");
        }

        resumen.append("Total: $").append(calcularTotal());
        return resumen.toString();
    }

    // Vaciar el pedido
    public void vaciarPedido() {
        productos.clear();
        total = 0.0;
    }
}

