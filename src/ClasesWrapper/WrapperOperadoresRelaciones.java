package Java_Curso.src.ClasesWrapper;

public class WrapperOperadoresRelaciones {

    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1999);
        Integer num2 = 1993;

        Boolean isEqual = num1.intValue() == num2.intValue();
        Boolean isEqual2 = num1 > num2;

        // sout
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Son iguales? " + isEqual);
        System.out.println("Es mayor? " + isEqual2);
    }
}
