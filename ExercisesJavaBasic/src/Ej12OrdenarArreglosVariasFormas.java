import java.util.Arrays;

public class Ej12OrdenarArreglosVariasFormas {
    public static void main(String[] args) {

        //Ejercicio 12: Ordenar arreglos

        String[] productos = new String[7];
        productos[0] ="Macbook Pro";
        productos[1] ="Samsung Galaxy";
        productos[2] ="Iphone 12";
        productos[3] ="Escritorio";
        productos[4] ="Puerta";
        productos[5] ="Bicicleta";
        productos[6] ="Reloj inteligente";

        //Arrays.sort ordena en orden alfabético o de menor a mayor
        //Se debe ordenar antes de iterar o mostrar los elementos
        Arrays.sort(productos);
        int total = productos.length; //para conocer la cantidad de elementos del arreglo antes de iterar

        //Mostrando elementos del arreglo con FOR en orden ascendente
        System.out.println("=== Con For ==="); //Separador
        for (int i =0; i<total; i++){
            System.out.println("Para índice " + i + " = " + productos[i]);
        }

        //Mostrar el arreglo ordenado a la inversa (de mayor a menor) en orden descendente Hay 2 formas;
        //Forma 1:
        System.out.println("=== Con For a la inversa 1 ==="); //Separador
        for (int i =0; i<total; i++){
            System.out.println("Para í = " + (total-1-i) + " valor = " + productos[total-1-i]);
        }

        //Forma 2:
        System.out.println("=== Con For a la inversa 2 ==="); //Separador
        for (int i =total-1; i>=0; i--){
            System.out.println("Para í = " + i + " valor = " + productos[i]);
        }

        //Mostrando elementos del arreglo con FOR EACH
        System.out.println("=== Con For Each ==="); //Separador
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        //Mostrando elementos del arreglo con WHILE
        System.out.println("=== Con While ==="); //Separador
        int i =0;
        while (i<total){
            System.out.println("Para índice " + i + " = " + productos[i]);
            i++;
        }

        //Mostrando elementos del arreglo con DO WHILE
        System.out.println("=== Con Do While ==="); //Separador
        int j =0;
        do {
            System.out.println("Para índice " + j + " = " + productos[j]);
            j++;
        }while (j<total);

        //Llenar un arreglo de forma dinámica con FOR
        System.out.println("=== Llenando arreglo con For ==="); //Separador
        int[] numeros = new int[10];
        int totalnum = numeros.length;
        for (int k =0; k<totalnum; k++){
            numeros[k] = k*4;
        }

        //Para mostrar el arreglo lleno
        for (int k =0; k<totalnum; k++){
            System.out.println("Para índice " + k + " = " + numeros[k]);
        }





    }
}
