import javax.swing.*;

public class Ej5JOptionPaneConSistemasNumericos {
    public static void main(String[] args) {

        //Ejercicio 5: Usando entrada de datos por ventana JOptionPane recibe un String,
        // si se desea usar un número, debe castearse para convertirlo al tipo de dato
        // o usar variables y luego hacer la conversión.
        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un número entero:");

        //** Manejo de excepciones **
        //Si en vez de número se ingresa una letra o palabra causara error por Excepción
        //que se puede manejar con un try and catch

        int numeroDecimal =0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "El número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nEl número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nEl número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
