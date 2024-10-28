public class Laptop extends Producto implements Vendible {
    String Procesador;
    int memoriaRam;



    public Laptop(String nombre, String marca, int precio, int cantidadStock, String procesador, int memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        Procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void MostrarDetalles() {
        System.out.println("Nombre de la Laptop"+getNombre()+"Marca Laptop"+getMarca()+"Precio Laptop"+getPrecio()+"Cantidad"+getCantidadStock()+"Procesador de la laptop"+getProcesador()+"Memoria Ram de la laptop"+getMemoriaRam());
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
