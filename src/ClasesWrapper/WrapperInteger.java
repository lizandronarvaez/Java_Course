package Java_Curso.src.ClasesWrapper;

public class WrapperInteger {

    public static void main(String[] args) {

        // Formas de declaras tipo de datos
        Integer IObjeto = Integer.valueOf(1993);
        Integer IObjeto2 = 1993;
        int IObjeto3 = 1993;

        // Formar de reasignar valores a una variable
        int numero = IObjeto;
        int numero2 = IObjeto.intValue();

        // Transformar String a entero
        String anioNacimiento = "1998";
        int intAnioNacimiento = Integer.valueOf(anioNacimiento);

        // Tranforma a short
        Short shorObjeto= IObjeto.shortValue();

        // Tranforma a byte
        Byte byteObjeto = IObjeto.byteValue();

        // Transforma a Long
        Long longObjeto = IObjeto.longValue();

        // Salida de datos
        System.out.println(shorObjeto);
        System.out.println(byteObjeto);
        System.out.println(longObjeto);
    }
}
