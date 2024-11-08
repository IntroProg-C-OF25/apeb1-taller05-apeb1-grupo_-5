
import java.util.Scanner;

/**
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author sebas
 */
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        int calificacion;
        System.out.println("Ingrese la nota: ");
        calificacion = sca.nextInt();
        char letra;
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        } else if (calificacion >= 0 && calificacion < 60) {
            letra = 'F';
        } else {
            System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
            return;
        }
        System.out.println("La calificación en letra es: " + letra);
    }
}
/***
 * Ingrese la nota: 
70
La calificación en letra es: C
BUILD SUCCESSFUL (total time: 3 seconds)
 */
