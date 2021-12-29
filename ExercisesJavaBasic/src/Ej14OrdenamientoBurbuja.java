public class Ej14OrdenamientoBurbuja {
    public static void main(String[] args) {
        String[] productos = {"Macbook Pro", "Xiaomi Redmi Note 10", "Iphone 12",
                "Escritorio", "Puerta", "Bicicleta", "Reloj inteligente"};

        int total = productos.length;
        //Se utilizan 2 For para que se comparen todos los elementos
        for (int i=0; i<total; i++){
            for (int j=0; j<total; j++){
                if (productos[i].compareTo(productos[j]) <0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
            }
        }

        for (int i =0; i<total; i++){
            System.out.println("Para índice " + i + " = " + productos[i]);
        }

    }
}