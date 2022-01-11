import javax.swing.*;

public class Ej22ContarVocalesEnFrase {
    public static void main(String[] args) {

        //Ejercicio 22: Contar cuantas vocales tiene una frase ingresada por el usuario.
        //usando JOptionPane

        String frase = JOptionPane.showInputDialog(null, "Escriba una frase:","Inicio",JOptionPane.INFORMATION_MESSAGE);
        //Se obliga a que el texto este en minuscula para evitar errores con las vocales del arreglo
        frase = frase.toLowerCase();

        char [] vocales = {'a','e','i','o','u'};
        char caracterActual;
        int contadorVocales = 0;
        boolean esVocal;

        for (int i = 0; i<frase.length(); i++){
            caracterActual = frase.charAt(i);
            //Se inicializa aqui la variable para que pueda entrar en el 2do for a revisar las vocales y reiniciarse
            //También se puede hacer usando if si son pocas las letras a comprobar y se omite el 2do for
            //en ese caso no se necesita la variable boolean
            esVocal = false;

            for (int j = 0; j<vocales.length && !esVocal; j++){
                if (vocales[j] ==caracterActual){
                    contadorVocales++;
                    esVocal = true;
                }
            }

        }

        JOptionPane.showMessageDialog(null, "La frase tiene " + contadorVocales+" vocales.","Resultado",JOptionPane.INFORMATION_MESSAGE);


    }
}
