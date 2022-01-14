public class EjemploVehiculo {
    public static void main(String[] args) {

        Vehiculo subaru = new Vehiculo("Subaru", "Impreza");
        subaru.setColor("Blanco");
        subaru.setCilindrada(2.0);

        Vehiculo mazda = new Vehiculo("Mazda", "BT-58","Rojo", 3.0);

        Vehiculo nissan = new Vehiculo("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        Vehiculo nissan2 = new Vehiculo("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        //Para verificar que 2 objetos aunque tengan la misma información son diferentes
        //Esto también es referencia para sobreescritura de método en la clase vehículo
        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales usando equals? " + (nissan.equals(nissan2)));
        System.out.println();

        //detalle retorna un string por eso hay que imprimirlo.
        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(nissan.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,0.6f));
        System.out.println("Kilometros por litro " + subaru.calcularConsumo(300,60));
        System.out.println("Kilometros por litro " + nissan.calcularConsumo(300,60));



    }
}
