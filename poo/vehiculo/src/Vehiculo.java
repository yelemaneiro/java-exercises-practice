public class Vehiculo {

    private String fabricante;
    private String modelo;
    private String color = "Gris";
    private double cilindrada;
    private int capacidadTanque = 40; //40 litros

    //constructor vacío o por defecto cuando no se declara (no tiene argumentos)
    public Vehiculo() {
    }

    //Constructor 2 - aplicando sobrecarga de constructores
    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Constructor 3
    public Vehiculo(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    //Constructor 4
    public Vehiculo(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo,color);
        this.cilindrada = cilindrada;
    }

    public Vehiculo(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    //Creando métodos
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("vehiculo.fabricante = " + this.fabricante);
        sb.append("\nvehiculo.modelo = " + this.modelo);
        sb.append("\nvehiculo.color = " + this.color);
        sb.append("\nvehiculo.cilindrada = " + this.cilindrada);
        return sb.toString();
    }

    public String acelerar (int rpm){
        return "el auto "+ fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return fabricante + " "+ modelo + " frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n " + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(capacidadTanque*porcentajeGasolina);
    }

    //Sobrecarga de método - Polimorfismo (mismo método pero con distintos argumentos)
    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(capacidadTanque*(porcentajeGasolina/100f));
    }

    //Sobreescritura de métodos padres (herencia)
    @Override
    public boolean equals(Object obj) {
        //Se hace un cast para señalar que el objeto recibido es de la clase vehículo
        // y pueda compararlo con otro objeto de la misma clase (vehiculo)
        Vehiculo v = (Vehiculo) obj;
        //Se modifica para que retorne la comparación de lo que se quiere
        //fabricante es de tipo string y los strings se comparan con equals
        return (this.fabricante.equals(v.getFabricante()) && this.modelo.equals(v.getModelo()));
    }
}
