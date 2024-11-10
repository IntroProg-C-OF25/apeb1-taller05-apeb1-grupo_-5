import java.util.Scanner;

public class Ejercicio6_CategoriaDeEdad {
    public static void main(String[] args) {
        System.out.println("18");
        int edad;
        Scanner sca =new Scanner (System.in);
        System.out.print("Ingrese la edad: ");
        edad = sca.nextInt();
        if (edad >= 18)
            System.out.println("Es adulto ");
        else if (edad >= 13 && edad <= 17) 
            System.out.println("Es adolecente ");
        else if (edad >= 0 && edad <= 12)
            System.out.println("Es un niño ");
    }
}
/***
 * run-single:
 *18
 *Ingrese la edad: 88
 *Es adulto 
 *BUILD SUCCESSFUL (total time: 6 seconds)
 */

/***
 * run-single:
 *18
 *Ingrese la edad: 13
 *Es adolecente 
 *BUILD SUCCESSFUL (total time: 7 seconds)
 */

/***
 * 
 */