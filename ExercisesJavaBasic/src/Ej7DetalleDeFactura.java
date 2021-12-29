import java.util.Scanner;

public class Ej7DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripción de su factura:");
        String descripcion = scanner.nextLine();

        System.out.println("Ingrese el precio del 1er producto:");
        double producto1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del 2do producto:");
        double producto2 = scanner.nextDouble();

        double sumaProductos = producto1 + producto2;
        final double PORCENTAJE = 0.19;
        double impuesto = sumaProductos * PORCENTAJE;
        double total = sumaProductos + impuesto;
        String mensajeFinal = "La factura " + descripcion + " tiene un total bruto de "
                + sumaProductos + ", con un impuesto de " + impuesto
                + " y el monto final con impuesto es de " + total;

        System.out.println(mensajeFinal);

    }
}
