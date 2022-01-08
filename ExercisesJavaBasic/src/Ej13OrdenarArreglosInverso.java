import java.util.Arrays;
import java.util.Collections;

public class Ej13OrdenarArreglosInverso {
    public static void main(String[] args) {

        //Ejercicio 13: Ordenar arreglos parte 2

        String[] productos = {"Macbook Pro", "Samsung Galaxy", "Iphone 12",
                "Escritorio", "Puerta", "Bicicleta", "Reloj inteligente"};

        Arrays.sort(productos);
        int total = productos.length;

        //Mostrando elementos del arreglo con FOR en orden ascendente
        System.out.println("=== Con For ==="); //Separador
        for (int i =0; i<total; i++){
            System.out.println("Para índice " + i + " = " + productos[i]);
        }

        //Modificando el contenido del arreglo
        //Mostrando elementos del arreglo con FOR en orden descendente
        //Se declaran las variables que guardaran el contenido de la posición del array
        //Solo se debe modificar hasta la mitad (i<total/2) sino el array vuelve a ser el original
        for (int i =0; i<total/2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso; //En la posición actual se coloca el inverso.
            productos[total-1-i] = actual; //En la posición inversa se coloca el actual.
        }
        System.out.println(" ");

        System.out.println("=== Mostrando modificado ==="); //Separador
        for (int i =0; i<total; i++){
            System.out.println("Para índice " + i + " = " + productos[i]);
        }

        //Usando el api de colección de Java para ordenamiento inverso
        Collections.reverse(Arrays.asList(productos));

        System.out.println("===Con colección de Java===");
        for (int i =0; i<total; i++){
            System.out.println("Para índice " + i + " = " + productos[i]);
        }

    }
}
