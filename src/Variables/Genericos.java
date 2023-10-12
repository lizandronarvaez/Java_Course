package Java_Curso.src.Variables;

public class Genericos<T, K> {
    private T generico1;
    private K generico2;

    public Genericos(T generico1, K generico2) {
        this.generico1 = generico1;
        this.generico2 = generico2;
    }

    public T getGenericOne() {
        return generico1;
    }

    public K getGenericTwo() {
        return generico2;
    }
}
