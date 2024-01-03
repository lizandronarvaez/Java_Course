package src.Matrices;

public class ExampleMatrices2 {

    public static void main(String[] args) {

        // [filas][columnas]
        String[][] cursos = new String[3][2];

        cursos[0][0] = "Java";
        cursos[0][1] = "Css";
        cursos[1][0] = "Boostrap";
        cursos[1][1] = "Tailwins";
        cursos[2][0] = "JavaScript";
        cursos[2][1] = "SpringBoot";

        System.out.println("Iterando con for: ");
        System.out.println("");
        for (int i = 0; i < cursos.length; i++) {
            for (int j = 0; j < cursos[i].length; j++) {
                System.out.print(cursos[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Iterando con un forEach: ");
        System.out.println("");
        for (String[] curso : cursos) {
            for (String nombre : curso) {
                System.out.print(nombre + "\t");
            }
            System.out.println("");
        }
    }
}
