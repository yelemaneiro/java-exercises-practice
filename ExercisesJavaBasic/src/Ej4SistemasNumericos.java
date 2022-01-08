public class Ej4SistemasNumericos {
    public static void main(String[] args) {

        //Ejercicio 4: conversión de números

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        //Convertir un número decimal en binario (pasándolo a String)
        System.out.println("El número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        //Representar números binarios en Java
        //Se coloca 0b antes del número para que el sistema lo tome como binario
        int numeroBinario = 0b111110100; // Lo interpreta como binario pero lo muestra como decimal (500)
        System.out.println("numeroBinario = " + numeroBinario);

        //Convertir un número decimal en octal (pasándolo a String con método)
        System.out.println("El número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        //Representar sistema octal en Java
        //Se coloca 0 antes del número para que el sistema lo tome como octal
        int numeroOctal = 0764; // Lo interpreta como octal, pero lo muestra como decimal (500)
        System.out.println("numeroOctal = " + numeroOctal);

        //Convertir un número decimal en hexadecimal (pasándolo a String con método)
        System.out.println("El número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        //Representar sistema hexadecimal en Java
        //Se coloca 0x antes del número para que el sistema lo tome como hexadecimal
        int numeroHexadecimal = 0x1f4; // Lo interpreta como hexadecimal, pero lo muestra como decimal (500)
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }
}
