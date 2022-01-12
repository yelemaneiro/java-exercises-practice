import java.util.Scanner;

public class Ej20SumarCantidadHastaUnNumero {
    public static void main(String[] args) {

        //Ejercicio 20:
        // Realizar la suma del 1 al número que se indique, este debe ser mayor que 1.

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese un número mayor que 1: ");
        int num;

        do {
            num = sn.nextInt();
            if (num <=1){
                System.out.println("No has ingresado un número correcto, vuelve a intentarlo");
            }
        }while (num <=1);
        int suma = 0;

        for (int i = 0; i <=num; i++){
            suma += i;
        }
        System.out.println("La suma del 1 al número ingresado es: " + suma);

    }
}
