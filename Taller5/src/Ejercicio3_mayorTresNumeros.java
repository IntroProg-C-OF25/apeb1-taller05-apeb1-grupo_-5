
import java.util.Scanner;

/**
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author sebas
 */
public class Ejercicio3_mayorTresNumeros {
    public static void main(String[] args) {
        int a, b, c, mayor;
        Scanner sca = new Scanner (System.in);
        System.out.println("Ingrese 3 números: ");
        a = sca.nextInt();
        b = sca.nextInt();
        c = sca.nextInt();
        mayor = (a>b) || (b>c) ? a : b : c;

    }
    
}
