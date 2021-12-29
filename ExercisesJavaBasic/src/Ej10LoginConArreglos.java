import java.util.Scanner;

public class Ej10LoginConArreglos {
    public static void main(String[] args) {

        //Manera sencilla de realizar un login usando For y arreglos
        //*****Forma 1 de definir un arreglo:
     /* String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames [0] = "yele";
        passwords [0] = "123456";
        usernames [1] = "admin";
        passwords [1] = "123456";
        usernames [2] = "maria";
        passwords [2] = "123456"; */

        //*****Forma 2 de definir un arreglo: (de manera directa)
        String[] usernames = {"yele", "admin", "maria"};
        String[] passwords = {"123456", "12345", "1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(usuario) && passwords[i].equals(pass)) {
                esAutenticado = true;
                break; //se coloca para que no siga iterando si es true
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("username o password incorrectos!");
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
