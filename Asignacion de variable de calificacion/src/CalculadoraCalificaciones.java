//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculadoraCalificaciones {

    /**
     * Asigna una letra de calificación basada en un promedio numérico.
     *
     * @param promedio El promedio numérico del participante.
     * @return La calificación en letra (A, B, C, D, F).
     */
    public char asignarCalificacion(double promedio) {
        char calificacion;

        if (promedio >= 90) {
            calificacion = 'A';
        } else if (promedio >= 80) {
            calificacion = 'B';
        } else if (promedio >= 70) {
            calificacion = 'C';
        } else if (promedio >= 60) {
            calificacion = 'D';
        } else {
            calificacion = 'F'; // Menor o igual a 50
        }

        return calificacion;
    }

    public static void main(String[] args) {
        CalculadoraCalificaciones calculadora = new CalculadoraCalificaciones();

        // Ejemplos de uso
        double promedio1 = 95.5;
        char calif1 = calculadora.asignarCalificacion(promedio1);
        System.out.println("Promedio: " + promedio1 + ", Calificación: " + calif1); // Salida: A

        double promedio2 = 72.0;
        char calif2 = calculadora.asignarCalificacion(promedio2);
        System.out.println("Promedio: " + promedio2 + ", Calificación: " + calif2); // Salida: C

        double promedio3 = 45.0;
        char calif3 = calculadora.asignarCalificacion(promedio3);
        System.out.println("Promedio: " + promedio3 + ", Calificación: " + calif3); // Salida: F
    }
}