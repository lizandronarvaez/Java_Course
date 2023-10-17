package Java_Curso.src.String;

public class StringConcatenar_2 {
    public static void main(String[] args) {

        // Crear string de forma directa
        String curso = "Curso Java";
        String alumno = "Lizandro Narváez";
        // Concateacion de string
        String detalleCurso = curso + " " + alumno;
        String detalleCurso2 = curso.concat(" ").concat(alumno);
        // Sout
        System.out.println(detalleCurso);
        System.out.println(detalleCurso2);

    }
}
