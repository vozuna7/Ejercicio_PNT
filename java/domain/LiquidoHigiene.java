package domain;

public class LiquidoHigiene extends Producto{
    private String capacidad;


    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// " +
                "Capacidad: " + capacidad + " /// " +
                "Precio: $" + this.getPrecio();
    }
}
