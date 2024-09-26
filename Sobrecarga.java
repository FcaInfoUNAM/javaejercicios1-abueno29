package Ceremonias;

public class Sobrecarga {
    String nombre;
    String materia;
    int calificacion;

    // Constructor de Sobrecarga
    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Método reprobar en Sobrecarga
    public String reprobar() {
        if (this.calificacion > 5) {
            return "Verdadero";
        } else {
            return "Falso";
        }
    }

    //Clase Profesor que extiende Sobrecarga
    class Profesor extends Sobrecarga {
        // Constructor de Profesor
        public Profesor(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        // Método reprobar en Profesor
      
        public String reprobar() {
            if (this.calificacion > 5) {
                return ">:) Sacaste " + this.calificacion + " en " + this.materia;
            } else {
                return ":(";
            }
        }
    }
//Clase AntiguoAlumno que extiende Sobrecarga//
    class AntiguoAlumno extends Sobrecarga {
        // Constructor de AntiguoAlumno
        public AntiguoAlumno(String nombre, String materia, int calificacion) {
            super(nombre, materia, calificacion);
        }

        // Método reprobar en AntiguoAlumno
      
        public String reprobar() {
            if (this.calificacion > 5) {
                return ":) Calificación aprobatoria: " + this.calificacion;
            } else {
                return ":(";
            }
        }
    }

    public static void main(String[] args) {
        // Crear instancias de Profesor y AntiguoAlumno
        Sobrecarga sobrecarga = new Sobrecarga("Juan", "Matemáticas", 8);
        Profesor profesor = sobrecarga.new Profesor("Juan", "Matemáticas", 8);
        AntiguoAlumno antiguoAlumno = sobrecarga.new AntiguoAlumno("Pedro", "Historia", 5);

        // Probar los métodos
        System.out.println(profesor.reprobar()); // Debe mostrar mensaje para calificación > 5
        System.out.println(antiguoAlumno.reprobar()); // Debe mostrar mensaje para calificación <= 5
    }
}
