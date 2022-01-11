import javax.swing.*;

public class Ej23QuitarEspacios {
    public static void main(String[] args) {

        //Eliminar los espacios de una frase ingresada por el usuario.
        String frase = JOptionPane.showInputDialog(null, "Escriba una frase:","Inicio",JOptionPane.INFORMATION_MESSAGE);

        char caracterActual;
        String fraseSinEspacios = "";

        for (int i = 0; i<frase.length(); i++) {
            caracterActual = frase.charAt(i);

            if (caracterActual !=' '){
                fraseSinEspacios += caracterActual;            }
        }
        JOptionPane.showMessageDialog(null, "Sin espacios es: " + fraseSinEspacios,"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }
}
