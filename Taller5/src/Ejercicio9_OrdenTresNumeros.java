
import java.util.Scanner;

/**
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden
 * ascendente.
 *
 * @author sebas
 */
public class Ejercicio9_OrdenTresNumeros {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int numero1, numero2, numero3, temp;
        System.out.print("Ingrese el primer número: ");
        numero1 = sca.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = sca.nextInt();
        System.out.print("Ingrese el tercer número: ");
        numero3 = sca.nextInt();
        if (numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero1 > numero3) {
            temp = numero1;
            numero1 = numero3;
            numero3 = temp;
        }

        if (numero2 > numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        System.out.println("El orden de los números es: " + numero1 + ", " + numero2 + ", " + numero3);

    }

}
/***
 * Ingrese el primer número: 31
Ingrese el segundo número: 45
Ingrese el tercer número: 3
El orden de los números es: 3, 31, 45
BUILD SUCCESSFUL (total time: 5 seconds)
 */