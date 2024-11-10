
import java.util.Scanner;

public class Ejercicio4_DescuentoEnCompras {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario el precio original del producto
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();
        // Declarar la variable para almacenar el precio final
        double precioFinal;
        // Calcular el precio final en base al descuento
        if (precioOriginal > 100) {
            // Aplicar el descuento del 10%
            precioFinal = precioOriginal * 0.90;
        } else {
            // No hay descuento
            precioFinal = precioOriginal;
        }
        // Mostrar el precio final
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
}
/***
 * run-single:
 *Ingrese el precio original del producto: 146
 *El precio final del producto es: $131.4
 *BUILD SUCCESSFUL (total time: 6 seconds)
*/

