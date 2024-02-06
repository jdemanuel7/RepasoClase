package Trabajo;
public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();

        tiendaMascotas.agregarMascota("Lucia", 17, "Perro");
        tiendaMascotas.agregarMascota("Lucia", 17, "Perro");

        tiendaMascotas.venderMascota("Lucia");


        tiendaMascotas.inventarioTienda();
    }
}

