public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Laptop Gamer", "ASUS", 500000, 10, "Intel i7", 16);
        Celular celular1 = new Celular("Galaxy S21", "Samsung", 800000, 15, 4500, 64.0);

        Cliente cliente1 = new Cliente("Miguel Angel Blanco", "migueblanci28@gmail.com");
        Cliente cliente2 = new Cliente("Maria Lopez", "maria013L@gmail.com");

        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 2);
        cliente2.comprarProducto(laptop1, 7); // Aplicará descuento
        cliente2.comprarProducto(celular1, 9); // Aplicara descuento

        laptop1.calcularPrecioVenta(3);

        System.out.println("\n--- Resumen de Compras ---");
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();

        // Mostrar inventario actualizado
        System.out.println("\n--- Inventario Actualizado ---");
        laptop1.MostrarDetalles();
        celular1.MostrarDetalles();

    }
}