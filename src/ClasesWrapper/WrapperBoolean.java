package src.ClasesWrapper;

public class WrapperBoolean {

    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1993;
        num2 = 1993;

        boolean primitivoBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;
        // sout
        System.out.println(primitivoBoolean);
        System.out.println(objetoBoolean);
        System.out.println(objetoBoolean2);

        System.out.println("Comparador dos objetos: Es igual? " + (objetoBoolean == objetoBoolean2));
        System.out.println(objetoBoolean.equals(objetoBoolean2));
        System.out.println("Son iguales ?: " + (objetoBoolean == objetoBoolean3));
        System.out.println("Son iguales ?: " + (objetoBoolean2 == objetoBoolean3));

    }
}
