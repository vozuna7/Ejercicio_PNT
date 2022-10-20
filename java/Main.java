import domain.Bebida;
import domain.Fruta;
import domain.LiquidoHigiene;
import domain.Producto;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Bebida cocaColaZero = new Bebida();
        cocaColaZero.setNombre("Coca-Cola Zero");
        cocaColaZero.setCapacidad("1.5");
        cocaColaZero.setPrecio(20);

        Bebida cocaCola = new Bebida();
        cocaCola.setNombre("Coca-Cola");
        cocaCola.setCapacidad("1.5");
        cocaCola.setPrecio(18);

        LiquidoHigiene shampooSedal = new LiquidoHigiene();
        shampooSedal.setNombre("Shampoo Sedal");
        shampooSedal.setCapacidad("500 ml");
        shampooSedal.setPrecio(19);

        Fruta frutilla = new Fruta();
        frutilla.setNombre("Frutillas");
        frutilla.setPrecio(64);
        frutilla.setUnidadDeVenta("Kilo");

        List<Producto> productos = new ArrayList<>();
        productos.addAll(Arrays.asList(cocaCola,cocaColaZero,frutilla,shampooSedal));

        productos.forEach(producto -> System.out.println(producto));

        System.out.println("=============================");

        Collections.sort(productos);

        System.out.println("Producto más caro: " + productos.get(productos.size()-1).getNombre());
        System.out.println("Producto más barato: " + productos.get(0).getNombre());
    }
}
