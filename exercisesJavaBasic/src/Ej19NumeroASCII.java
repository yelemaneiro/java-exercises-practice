import java.util.Scanner;

public class Ej19NumeroASCII {
    public static void main(String[] args) {
        //Ejercicio 19: Lee un número por teclado y muestra por consola,
        // Indicar el carácter al que pertenece en la tabla ASCII.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int numero = teclado.nextInt();
        char character = (char)numero;

        System.out.println("El número " + numero + " corresponde al caracter '" + character + "' en la tabla ASCII");
    }
}
