package src.POO.GenericosClases;

public class EjemploGenericos {
    public static void main(String[] args) {

        Camion<Animales> transporteAnimales = new Camion<>(4);
        transporteAnimales.addObject(new Animales("Firulais", "Perro"));
        transporteAnimales.addObject(new Animales("Rayo", "Galgo"));
        transporteAnimales.addObject(new Animales("Rey", "Caballo"));
        transporteAnimales.addObject(new Animales("Viena", "Vaca"));
        transporteAnimales.addObject(new Animales("Cielo", "Elefante"));

        imprimirObjetos(transporteAnimales);

        Camion<Coches> transporteCoches = new Camion<>(4);
        transporteCoches.addObject(new Coches("Nissan", "Qashqai"));
        transporteCoches.addObject(new Coches("Opel", "Insignia"));
        transporteCoches.addObject(new Coches("Volvo", "S60"));
        transporteCoches.addObject(new Coches("Toyota", "Corolla"));

        imprimirObjetos(transporteCoches);
    }

    public static <T> void imprimirObjetos(Camion<T> camion) {
        System.out.println();
        for (T c : camion) {
            if (c instanceof Animales) {
                System.out.println(((Animales) c).getNombre() + " Tipo: " + ((Animales) c).getTipo());
            }
            if (c instanceof Coches) {
                System.out.println(((Coches) c).getMarca() + " Modelo: " + ((Coches) c).getModelo());
            }
        }
    }
}
