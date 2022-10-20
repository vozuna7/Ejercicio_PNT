package domain;

public class Bebida extends Producto {

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
                "Litros: " + capacidad + " /// " +
                "Precio: $" + this.getPrecio();
    }


}


