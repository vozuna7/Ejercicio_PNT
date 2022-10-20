package domain;

public class Fruta extends Producto{
    private String unidadDeVenta;

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// " +
                "Precio: $" + this.getPrecio() + " /// " +
                "Unidad de venta: " + unidadDeVenta;
    }
}
