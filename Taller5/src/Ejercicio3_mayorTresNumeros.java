
import java.util.Scanner;

/**
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author sebas
 */
public class Ejercicio3_mayorTresNumeros {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sca = new Scanner (System.in);
        System.out.println("Ingrese 3 números: ");
        a = sca.nextInt();
        b = sca.nextInt();
        c = sca.nextInt();
               if (a == b && b == c) {
            System.out.println("Los tres números son iguales.");
        } else {
            int mayor;
            if (a > b && a > c) {
                mayor = a;
            } else if (b > a && b > c) {
                mayor = b;
            } else {
                mayor = c;
            }

            System.out.println("El mayor es: " + mayor);
        }
    }
    
}
/***
 * Ingrese 3 números: 
2 7 4
El mayor es: 7
BUILD SUCCESSFUL (total time: 12 seconds)
 */
