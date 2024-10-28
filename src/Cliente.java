import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados = new ArrayList<>();
    private List<Integer> cantidadesCompradas = new ArrayList<>();

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.reducirStock(cantidad)) {
            productosComprados.add(producto);
            cantidadesCompradas.add(cantidad);
            System.out.println(nombre + " ha comprado " + cantidad + " unidad(es) de " + producto.getNombre());
        } else {
            System.out.println("No hay suficiente stock de " + producto.getNombre() + " para " + nombre);
        }
    }

    public void mostrarCompra() {
        System.out.println("Resumen de compra de " + nombre + ":");
        double totalCompra = 0;
        for (int i = 0; i < productosComprados.size(); i++) {
            Producto producto = productosComprados.get(i);
            int cantidad = cantidadesCompradas.get(i);
            double precioVenta = ((Vendible) producto).calcularPrecioVenta(cantidad);
            totalCompra += precioVenta;
            producto.MostrarDetalles();
            System.out.println("Cantidad comprada: " + cantidad + ", Precio total: $" + precioVenta);
        }
        System.out.println("Total de la compra: $" + totalCompra);
    }
}

