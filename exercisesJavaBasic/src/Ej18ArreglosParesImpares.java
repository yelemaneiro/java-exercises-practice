import java.util.Scanner;

public class Ej18ArreglosParesImpares {
    public static void main(String[] args) {

        //Ejercicio 18: ingresar 10 números en cualquier orden y luego
        //mostrar los pares en un arreglo y los impares en otro

        //Se crean 3 arreglos, uno con todos los números desordenados solicitados
        //al usuario por consola, y en los otros dos se guardarán
        // los números pares y los impares respectivamente.
        int[] desordenado, pares, impares;
        int totalPares = 0, totalImpares = 0;
        desordenado = new int[10];

        //Se solicitan por consola ingresar los 10 números
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 10 números: ");

        // Se llena el arreglo con los números ingresados
        for (int i = 0; i < desordenado.length; i++){
            desordenado [i] = teclado.nextInt();
        }

        //Con las variables auxiliares se hace un for para asignar cuantos números de
        //los ingresados son pares y cuantos impares para designar el tamaño de
        //los arreglos pares e impares
        for (int i = 0; i < desordenado.length; i++){
            if (desordenado[i]%2 == 0){
                totalPares++;
            }else{
                totalImpares++;
            }
        }


        pares = new int[totalPares];
        impares = new int[totalImpares];

        //Se usan 2 variables auxiliares para incrementar cada arreglo independientemente
        int j = 0;
        int k = 0;

        //Se hace una iteración para asignar los números pares e impares a cada arreglo
        //según corresponda
        for (int i = 0; i < desordenado.length; i++){
            if (desordenado[i] % 2 == 0){
                pares[j++] = desordenado[i];
            }else{
                impares[k++] = desordenado[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }
        System.out.println();

    }
}
