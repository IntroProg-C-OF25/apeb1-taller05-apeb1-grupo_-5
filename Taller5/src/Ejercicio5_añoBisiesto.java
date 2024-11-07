
import java.util.Scanner;

/**
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author sebas
 */
public class Ejercicio5_añoBisiesto {
    public static void main(String[] args) {
        int año;
        Scanner sca = new Scanner (System.in);
        System.out.print("Ingrese el año: ");
        año = sca.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto. ¡Un año especial!");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
    
}
/***
 * run:
Ingrese el año: 2020
El año 2020 es bisiesto. ¡Un año especial!
BUILD SUCCESSFUL (total time: 5 seconds)

 */