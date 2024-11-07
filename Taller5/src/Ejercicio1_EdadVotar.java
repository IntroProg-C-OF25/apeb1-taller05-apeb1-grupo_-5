
import java.util.Scanner;

/***
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author sebas
 */
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner sca =new Scanner (System.in);
        System.out.print("Ingrese la edad: ");
        edad = sca.nextInt();
        if (edad >= 18)
            System.out.println("Si puede votar");
        else 
            System.out.println("No puede votar");
        
    }
}
/***
 * run:
Ingrese la edad: 54
Si puede votar
BUILD SUCCESSFUL (total time: 23 minutes 45 seconds)
 */
