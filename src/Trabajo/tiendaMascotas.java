package Trabajo;

public class tiendaMascotas {
    Mascota[] inventario;
    int cantidadMascotas;
    public tiendaMascotas(){
        this.inventario= new Mascota[100];
        this.cantidadMascotas=0;
    }
 public void agregarMascota(String nombre, int edad,String tipoAnimal){
        Mascota mascota = new Mascota(nombre,edad,tipoAnimal);
        inventario[cantidadMascotas]=mascota;
        cantidadMascotas++;
     System.out.println("la mascota" +nombre+ "ha sido añadida");
 }
 public void venderMascota(String nombre){
     for (int i = 0; i < cantidadMascotas; i++) {
         if (inventario[i].getNombre().equals(nombre)){
             System.out.println("la mascota"+inventario[i].getNombre().equals(nombre)+"Ha sido vendida, mala suerte");
             inventario[i]= null;
             for (int j = 0; j < cantidadMascotas; j++) {
                 inventario[j]= inventario[j+1];
             }
             cantidadMascotas--;
         }

     }
     System.out.println("La mascota "+nombre+"no se encuentra");


 }
 public void inventarioTienda(){
     System.out.println("Inventario de la tienda:");
     for (int i = 0; i < cantidadMascotas; i++) {
         Mascota mascota = inventario[i];
         System.out.println("Nombre: " + mascota.getNombre() + ", Edad: " + mascota.getEdad() + ", Tipo: " + mascota.getTipoAnimal());
     }
 }

}



