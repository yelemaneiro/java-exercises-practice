import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6ScannerConSistemasNumericos {
    public static void main(String[] args) {

        //Usando entrada de datos por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");

        //** Manejo de excepciones **
        //Si en vez de número se ingresa una letra o palabra causara error por Excepción
        //que se puede manejar con un try and catch

        int numeroDecimal =0;
        try {
            numeroDecimal = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "El número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nEl número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nEl número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);

    }
}
