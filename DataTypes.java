package Exercises;

public class DataTypes {
    public String cadena;
    public int entero;
    public float flotante;
    public char caracter;
    public boolean boleano;

    // Constructor que inicializa los atributos
    public DataTypes() {
        this.cadena = "Hola Mundo";
        this.entero = 10;
        this.flotante = 5.9f;
        this.caracter = 'A';
        this.boleano = true;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de DataTypes
        DataTypes data = new DataTypes();

        // Imprimir los valores inicializados
        System.out.println("Cadena: " + data.cadena);
        System.out.println("Entero: " + data.entero);
        System.out.println("Flotante: " + data.flotante);
        System.out.println("Caracter: " + data.caracter);
        System.out.println("Booleano: " + data.boleano);
    }
}
