import java.util.Scanner;

public class Ej9LoginOperadoresLogicos {
    public static void main(String[] args) {

        //Ejercicio 9: Manera sencilla de realizar un login usando if y operadores lógicos
        String username = "yele";
        String password = "123456";

        String username2 = "admin";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password: ");
        String pass = scanner.nextLine();

        boolean esAutenticado = false;

        if ( (username.equals(usuario) && password.equals(pass)) ||
                (username2.equals(usuario) && password2.equals(pass)) ){
            esAutenticado = true;
        }else{
            System.out.println("username o password incorrectos!");
        }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticación");
        }

    }
}
