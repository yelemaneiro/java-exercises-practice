import java.util.Scanner;

public class Ej16ArregloBuscarNumero {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        Scanner teclado = new Scanner(System.in);

        //Se solicita al usuario ingresar 10 números para llenar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número: ");
            arreglo[i] = teclado.nextInt();
        }

        //Se pide ingresar el número que se desea buscar
        System.out.println("\n\rIngrese un número a buscar: ");
        int num = teclado.nextInt();
        int i = 0;

        //Se hace la comparación del número a buscar con cada número del arreglo
        while (i < arreglo.length && arreglo[i] != num) {
            i++;
        }

        if (i == arreglo.length) {
            System.out.println("Número no encontrado");
        } else if (arreglo[i] == num) {
            System.out.println("Número encontrado en la posición " + i);
        }


    }
}
