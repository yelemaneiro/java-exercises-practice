public class Ej2Variables {
    public static void main(String[] args) {

        //Ejercicio 2: usando variables y aplicando métodos a variables
        String saludar = "Hola mundo";
        System.out.println(saludar);

        // convertirlo a mayúsculas con método
        System.out.println("saludar con toUpperCase() = " + saludar.toUpperCase());

        // variables primitivas
        int numero = 10;
        System.out.println("numero = " + numero);

        //contexto de una variable: solo existen dentro de llaves que las rodean
        //a menos que se inicialicen antes. No se puede usar una variable sin tener asignado un valor.
        boolean valor = true;
        if (valor) {
            System.out.println("numero = " + numero);
        }

        /*Reglas de variables:
        - Se pueden definir sin asignar valor.
        - Para poder usar una variable debe tener asignado un valor.
        - Los nombres de variable no pueden ser una palabra reservada del lenguaje.
        - Los nombres de variables no pueden comenzar con un número,
        - Aunque si permite iniciar con guión bajo o símbolo de dólar,
          por convención se usa camelCase, inicia con una letra en minúscula
          y la siguiente Mayúscula si es palabra compuesta.
        - Se debe evitar el uso de ñ, acentos y caracteres especiales en los nombres de variables.
        */





    }
}
