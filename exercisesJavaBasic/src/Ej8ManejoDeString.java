public class Ej8ManejoDeString {
    public static void main(String[] args) {

        //Ejercicio 8:
        // ***** Métodos más importantes para uso de String ******

        // Colocar doble comillas dentro de un String se usa \"
        System.out.println("Manejo de \"String\"");

        // Comparar el valor de dos String se usa el equals().
        String string1 = "Hola Yele"; //Se instancia un objeto String de forma literal (simple)
        String string2 = new String ("Hola Yele"); //Se puede instanciar también con el operador new
        String string3 = "Hola Yele"; //Aunque el nombre de variable es diferente, tiene el mismo "valor" (texto)
        // que string1 por lo que son iguales en referencia y valor.

        // Con el signo == compara si es el mismo objeto (si apunta a la misma referencia).
        System.out.println("¿Son el mismo objeto? " + (string1 == string2)); //False

        //boolean equals(String b): Compara si son iguales por valor
        System.out.println("¿Tienen el mismo valor? " + string1.equals(string2)); //True

        // Ejemplo:
        System.out.println("¿Son el mimo objeto? " + (string1 == string3)); //True
        System.out.println("¿Tienen el mismo valor? " + string1.equals(string3)); //True

        //Ejemplo 2:
        String curso = "Programación Java";
        String curso2 = new String("Programación java");

        System.out.println("¿Es igual " + curso + " y " + curso2 + "?: " + curso.equals(curso2)); //false
        // boolean equalsIgnoreCase(String b): compara si son iguales sin importar si tienen mayúsculas o minúsculas
        System.out.println("¿Es igual con ignorecase " + curso + " y " + curso2 + "?: " + curso.equalsIgnoreCase(curso2)); //true

        //lenght(): Para saber la cantidad de caracteres
        System.out.println("Con lenght(): Hola Yele tiene " + string1.length() + " caracteres");

        // toUpperCase(): Convierte en mayúsculas
        System.out.println(string1.toUpperCase() + " con toUpperCase");

        // toLowerCase(): Convierte en mayúsculas
        System.out.println(string1.toLowerCase() + " con toLowerCase");

     /* • int compareTo(String b): Compara contra la cadena del argumento, devolviendo:
			-Un valor negativo si la cadena es anterior a b
			- cero (0) si la cadena es igual a b
			- un valor positivo si la cadena es posterior a b. */
        System.out.println("string1.compareTo(string2) = " + string1.compareTo(string2)); //es parecido al equal

        //• char charAt(int posición): Extrae un carácter en la posición indicada.
        System.out.println("Usando CharAt con string1 = " + string1.charAt(0));
        System.out.println("Usando CharAt con string1 = " + string1.charAt(3));
        System.out.println("Usando CharAt con string1 = " + string1.charAt(string1.length()-1));

        //• String substring (int a, int b): Extrae la sub-cadena entre las posiciones a y b. */
        System.out.println("Yele con substring = " + string1.substring(1,7));

        //• String substring (int desde): Extrae la sub-cadena desde la posición indicada.
        System.out.println("Yele con substring = " + string1.substring(5));

        // Concatenar String con método
        String alumna = "Yeleida estudia";
        String detalle = alumna.concat(" ".concat(curso));//se pueden usar multiples concat
        System.out.println("detalle = " + detalle);

        // Concatenar con expresiones lambda o funciones anónimas
        // asi se modifica el string original
        String resultado = alumna.transform(a -> {
            return a + " " + curso;
        });
        System.out.println("resultado = " + resultado);
        resultado.replace("a","A");
        System.out.println("resultado = " + resultado); //no pasa nada, no realiza cambio a menos que se asigne a una variable nueva
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);

        //Otro Ejemplo:
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"A\") = " + trabalenguas.replace("a", "A"));

        //• int indexOf(String cadena): indica en que posición se encuentra el carácter (o cadena) indicado por primera vez, buscando desde el principio.
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));

        //• int lastIndexOf(String cadena): indica en que posición se encuentra el carácter (o cadena) indicado por primera vez, buscando desde el final.
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));

        // boolean contains(): regresa un boolean si contiene o no ese char o String
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); //true

        //• boolean startWith(String prefijo): Dice si la cadena comienza con el prefijo indicado.
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); //false

        //• boolean endsWith(String sufijo): Dice si la cadena termina con el sufijo indicado.
        System.out.println("trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas")); //true

        //• String trim(): Crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim());

        //Convertir un String en un arreglo
        //• char[] to CharArray(): Convierte la cadena en un arreglo de caracteres.
        System.out.println("trabalenguas = " + trabalenguas.toCharArray()); //De esta manera imprime la referencia
        //Se debe crear un arreglo de tipo char y con un for mostrar
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length; //no lleva paréntesis porque aquí es un atributo o propiedad del arreglo y no un método.
        System.out.println("largo = " + largo);
        for (int contador = 0; contador<largo; contador++){
            System.out.println(arreglo[contador]);
            //Si se quiere imprimir horizontalmente se debe quitar el salto de línea
        }

        // • String[] split(String patron): Divide la cadena en varias subcadenas utilizando el patrón (letra, símbolo) indicado como separador.
        System.out.println("trabalenguas = " + trabalenguas.split("a")); // asi imprime la referencia, se tiene que crear un arreglo
        String[] arreglo2 = trabalenguas.split("a");

        for (int contador2=0; contador2<arreglo2.length; contador2++){
            System.out.println(arreglo2[contador2]); //muestra la división del String siendo la "a" el separador.
        }
        //.split toma expresiones regulares, no toma el punto "." como símbolo, para que lo tome se debe usar "\\."
        // o se coloca entre corchetes [.]

        System.out.print("\n"); //salto de línea

        //Aplicando los métodos anteriores con extensiones de archivos. Ejemplo:
        String archivo = "alguna_imagen.jpeg";
        System.out.println("archivo = " + archivo);
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(14) = " + archivo.substring(archivo.length()-4)); // Si tiene 2 letras no funciona
        //para que tome la extensión del archivo de manera automática se puede hacer lo siguiente:
        //usar indexOf para indicar la posición del punto.
        int j = archivo.indexOf(".");
        System.out.println("archivo.indexOf(\".\") = " + archivo.substring(j+1));

        //Si el nombre de archivo tiene más de un punto, el indexOf no sirve.
        String archivo2 = "alguna.imagen.docx";
        int k = archivo2.indexOf(".");
        System.out.println("archivo2.substring(\".\") = " + archivo2.substring(k+1));
        //Se debe usar lastIndexOf
        int l = archivo2.lastIndexOf(".");
        System.out.println("archivo2 = " + archivo2.substring(l+1)); //FUNCIONA!!

        System.out.print("\n");
        //Concatenar con Stringbuilder: Permite crear un String y anexar cadenas con el método append pero se debe
        //crear el objeto antes y con .toString lo genera para imprimir en pantalla
        //Test de rendimiento de concatenación de String
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(a);

        for (int i=0; i<500; i++){
            // realizando el test con concat
            //** c = c.concat(a).concat(b).concat("\n"); //tardó 4 milisegundos con 500 loops
            //** c += a + b + "\n"; //tardó 4 milisegundos con 500 loops
            //** sb.append(a).append(b).append("\n"); //tardó 0 milisegundos con 500 loops
        }
        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio + " milisegundo(s)");
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
