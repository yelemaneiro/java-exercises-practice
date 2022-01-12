import java.util.Scanner;

public class Ej17ArregloNotasAlumnos {
    public static void main(String[] args) {

        //Ejercicio 17: Usando arreglos realice un sistema de notas de 7 alumnos
        // y muestre el promedio según su id o posición

        double [] claseMatematicas, claseHistoria, claseLenguaje;
        claseMatematicas = new double [7];
        claseHistoria = new double [7];
        claseLenguaje = new double [7];

        double sumaNotaMatematicas = 0, sumaNotaHistoria = 0, sumaNotaLenguaje = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese 07 notas de estudiantes para matemáticas:");
        for (int i=0; i<claseMatematicas.length; i++){
            claseMatematicas [i] = teclado.nextDouble();
        }

        System.out.println("Ingrese 07 notas de estudiantes para Historia:");
        for (int i=0; i<claseHistoria.length; i++){
            claseHistoria [i] = teclado.nextDouble();
        }

        System.out.println("Ingrese 07 notas de estudiantes para Lenguaje:");
        for (int i=0; i<claseLenguaje.length; i++){
            claseLenguaje [i] = teclado.nextDouble();
        }

        for (int i = 0; i<7; i++){
            sumaNotaMatematicas += claseMatematicas[i];
            sumaNotaHistoria += claseHistoria[i];
            sumaNotaLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumaNotaMatematicas/claseMatematicas.length;
        double promedioHistoria = sumaNotaHistoria/claseHistoria.length;
        double promedioLenguaje = sumaNotaLenguaje/claseLenguaje.length;

        System.out.println("promedio Clase Matemática = " + promedioMatematicas);
        System.out.println("promedio Clase Historia = " + promedioHistoria);
        System.out.println("promedio Clase Lenguaje = " + promedioLenguaje);
        System.out.println("Promedio total de las clases: " + (promedioMatematicas+promedioHistoria+promedioLenguaje)/3);

        System.out.println("Ingrese el id del alumno del 0-6:");
        int id = teclado.nextInt();
        double promedioAlumno = (claseHistoria[id]+ claseMatematicas[id] + claseLenguaje[id])/3;
        System.out.println("Promedio del alumno nro. " + id + ": " + promedioAlumno);


    }
}
