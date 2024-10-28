abstract class Producto {
   protected String Nombre;
    protected String Marca;
    protected int Precio;
   protected int CantidadStock;

    public Producto() {
    }

    public Producto(String nombre, String marca, int precio, int cantidadStock) {
        Nombre = nombre;
        Marca = marca;
        Precio = precio;
        CantidadStock = cantidadStock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        CantidadStock = cantidadStock;
    }

    public abstract void  MostrarDetalles();

    public boolean reducirStock(int cantidad) {
        if (CantidadStock >= cantidad) {
            CantidadStock -= cantidad;
            return true;
        }
        return false;
    }

}
