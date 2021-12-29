public class Ej3VariablesPrimitivas {
    public static void main(String[] args) {

        // información de los números primitivos
        System.out.println(" ");
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("valor max de un byte " + Byte.MAX_VALUE);
        System.out.println("valor min de un byte " + Byte.MIN_VALUE);
        System.out.println(" ");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("valor max de un short " + Short.MAX_VALUE);
        System.out.println("valor min de un short " + Short.MIN_VALUE);
        System.out.println(" ");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("valor max de un int " + Integer.MAX_VALUE);
        System.out.println("valor min de un int " + Integer.MIN_VALUE);
        System.out.println(" ");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("valor max de un long " + Long.MAX_VALUE);
        System.out.println("valor min de un long " + Long.MIN_VALUE);
        System.out.println(" ");

        float realFloat = 2.12e3f; // <--Esto es notación científica es = 2120.0;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("valor max de un float " + Float.MAX_VALUE);
        System.out.println("valor min de un float " + Float.MIN_VALUE);
        System.out.println(" ");

        double realDouble = 1234567890;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("valor max de un double " + Double.MAX_VALUE);
        System.out.println("valor min de un double " + Double.MIN_VALUE);
        System.out.println(" ");

        char caracter = 'a';
        System.out.println("caracter = " + caracter);
        char caracter2 = '\u0040';
        System.out.println("caracter2 = " + caracter2);
        char caracter3 = 64;
        System.out.println("caracter3 = " + caracter3);
        System.out.println("tipo char corresponde en bytes a " + Character.BYTES);
        System.out.println("tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("valor max de un char " + Character.MAX_VALUE);
        System.out.println("valor min de un char " + Character.MIN_VALUE);


    }
}
