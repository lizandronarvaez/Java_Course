package src.Variables;
public class PrimitivosFloat {
    public static void main(String[] args) {
        
        // Double
        double numeroDouble = 1.7976931348623157E308;
        System.out.println(numeroDouble);
        System.out.println("Tipo byte corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor maximo de byte: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de byte: " + Double.MIN_VALUE);
        System.out.println("");

        // Float
        float numeroFloat = 3.4028235E38F;
        System.out.println(numeroFloat);
        System.out.println("Tipo byte corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor maximo de byte: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de byte: " + Float.MIN_VALUE);
    }
}
