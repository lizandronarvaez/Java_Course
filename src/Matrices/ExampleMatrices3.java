package Java_Curso.src.Matrices;

public class ExampleMatrices3 {
    public static void main(String[] args) {

        String[][] cursos = { { "Java", "SpringBoot", "Security" }, { "JavaScript", "Nodejs", "NestJs" } };

        for (String[] curso : cursos) {
            for (String nombre : curso) {

                System.out.print(nombre+"\t");
            }
            System.out.println(" ");
        }
    }
}
