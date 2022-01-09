import java.util.Scanner;

public class Ej21HastaIngresarUnNumero {
    public static void main(String[] args) {

        //Ejercicio 21: Crear un programa que nos permita ingresar números hasta que se ingrese un 5.

        Scanner sn = new Scanner(System.in);
        System.out.println("Ingresa un número hasta encontrar el correcto:");
        int numero = sn.nextInt();

        int contador = 1;

        while (numero != 5){
            System.out.println("Vuelve a intentarlo. Ingresaste: " + numero);
            contador++;
            numero = sn.nextInt();
        }
        System.out.println("Número encontrado. Era el: " + numero);
        System.out.println("Lo intentaste " + contador + " veces.");


    }
}
