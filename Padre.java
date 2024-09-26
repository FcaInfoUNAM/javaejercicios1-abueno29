Class 1 PADRE
package Exercises;

public class Padre {
    String apellido;

    public Padre(String apellido) {
        this.apellido = apellido;
    }

    // Método test() que realiza la prueba de paternidad
    public Boolean test() {
        // Crear el hijo con el nombre Juan y el apellido del padre
        Hijo hijo = new Hijo("Juan", this.apellido);

        // Crear el objeto EspirituSanto con el apellido del padre y el apellidoReal 'Lopez'
        EspirituSanto es = new EspirituSanto(hijo.nombre, hijo.apellido, "Lopez");

        // Llamar a la función pruebaPaternidad y retornar el resultado
        return es.pruebaPaternidad();
    }

    public static void main(String[] args) {
        // Crear un objeto Padre con el apellido "Lopez"
        Padre padre = new Padre("Lopez");

        // Llamar al método test() para verificar la paternidad
        Boolean resultado = padre.test();

        // Imprimir el resultado de la prueba de paternidad
        if (resultado) {
            System.out.println("La prueba de paternidad es positiva.");
        } else {
            System.out.println("La prueba de paternidad es negativa.");
        }
    }
}
Class  2 HIJO
package Exercises;

public class Hijo extends Padre {
    String nombre;

    public Hijo(String nombre, String apellido) {
        super(apellido); // Llamar al constructor de la clase Padre
        this.nombre = nombre;
    }
}
Class Espiritu Santo
package Exercises;

public class EspirituSanto extends Hijo {
    String apellidoReal;

    public EspirituSanto(String nombre, String apellido, String apellidoReal) {
        super(nombre, apellido); // Llamar al constructor de la clase Hijo
        this.apellidoReal = apellidoReal;
    }

    // Método para realizar la prueba de paternidad
    public Boolean pruebaPaternidad() {
        // Verificar si el apellido del padre coincide con el apellido real
        return this.apellido.equals(this.apellidoReal);
    }
}
