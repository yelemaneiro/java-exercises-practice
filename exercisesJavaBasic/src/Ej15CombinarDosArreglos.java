public class Ej15CombinarDosArreglos {
    public static void main(String[] args) {

        //Ejercicio 15: Combinar 2 arreglos en uno.

        //Se declaran 3 arreglos, 2 iguales y el otro que pueda contener
        //los elementos de dos primeros.
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Se completan de manera dinámica los dos primeros arreglos.
        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++){
            b[i] = (i + 1)*5;
        }

        //Se utiliza una variable auxiliar iniciada en 0 para agregar un número
        //de cada arreglo al 3er arreglo. Se coloca post incremento para que
        //primero asigne y luego aumente, de esa manera se pasa un elemento de
        //cada arreglo en cada iteración.
        int aux = 0;
        for (int i = 0; i < 10; i++){
            c [aux++] = a[i];
            c [aux++] = b[i];
        }

        //Se imprimen los elementos del 3er arreglo en la consola
        for (int i = 0; i < c.length; i++){
            System.out.println( i + ": " + c[i]);
        }


    }
}
