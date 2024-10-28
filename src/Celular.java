public class Celular extends Producto implements Vendible{

    int CapacidadBateria;
    Double CamaraResolucion;

    public Celular() {
    }

    public Celular(String nombre, String marca, int precio, int cantidadStock, int capacidadBateria, Double camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        CapacidadBateria = capacidadBateria;
        CamaraResolucion = camaraResolucion;
    }


    public int getCapacidadBateria() {
        return CapacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        CapacidadBateria = capacidadBateria;
    }

    public Double getCamaraResolucion() {
        return CamaraResolucion;
    }

    public void setCamaraResolucion(Double camaraResolucion) {
        CamaraResolucion = camaraResolucion;
    }

    @Override
    public void MostrarDetalles() {
        System.out.println("Nombre de la Laptop"+getNombre()+"Marca Laptop"+getMarca()+"Precio Laptop"+getPrecio()+"Cantidad"+getCantidadStock()+"Capacidad de la Bateria"+getCapacidadBateria()+"Camara Resolucion"+getCamaraResolucion());
    }



    @Override
    public double calcularPrecioVenta(int cantidad) {
        int total = (int) (cantidad *getPrecio());
        if(cantidad>5){
            double descuento = total*0.10;
            total = (int) (total-descuento);
        }
        return total;
    }
}
