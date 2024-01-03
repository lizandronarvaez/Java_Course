package src.Variables;

import javax.swing.JOptionPane;

public class EntradaDatosJOptionPane {
    public static void main(String[] args) {
        int numero;
        String mensaje;
        try {
            // Conversion de string a numero
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
            //Entrada de texto
            mensaje = JOptionPane.showInputDialog(null, "Escribe un mensaje: ");
            
            JOptionPane.showMessageDialog(null, "El numero introducido es: " + numero);
            JOptionPane.showMessageDialog(null, "El mensaje introducido es: " + mensaje);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero entero");
            // Esto es un metodo main abrevido que actua para que la clase main se ejecute de nuevo
            main(args);
            System.exit(0);
        }
    }
}
