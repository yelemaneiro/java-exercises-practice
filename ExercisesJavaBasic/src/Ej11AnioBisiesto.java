import java.util.Scanner;

public class Ej11AnioBisiesto {
    public static void main(String[] args) {

        //Ejercicio 11: Decir cuantos días tienen los meses del año e indicar si el año es bisiesto o no

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número del mes del 1 al 12:");
        int mes = teclado.nextInt();
        int numeroDias = 0;
        System.out.println("Ingrese el año (YYYY):");
        int anio = teclado.nextInt();
        boolean esBisiesto = false;

        //Se puede realizar también con el Swich Case
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDias = 30;
        }else if(mes == 2){
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0) ) ){
                numeroDias = 29;
                esBisiesto = true;
            }else{
                numeroDias = 28;
            }
        }
        System.out.println("El mes " + mes + " tiene " + numeroDias + " días");

        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto");
        }else {
            System.out.println("El año " + anio + " no es bisiesto");
        }






    }
}
