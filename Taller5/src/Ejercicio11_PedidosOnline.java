
import java.util.Scanner;

/**
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de
 * un artículo del cual se tiene la descripción, la cantidad que se requiere y
 * el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un
 * descuento de 15%.
 *
 * @author sebas
 */
public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in); 
        int cantidad;
        double pUnitario, cTotal;
        System.out.print("Ingrese la descripción del articulo: ");
        String descrip = sca.nextLine();
        System.out.print("Ingrese la cantidad requerida: ");
        cantidad = sca.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        pUnitario = sca.nextDouble();
        
        cTotal = cantidad * pUnitario;
        if (cantidad > 50) {
            cTotal *= 0.85;

        }
        System.out.println("\nDetalles del Pedido:");
        System.out.println("Artículo: " + descrip);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + pUnitario);
        System.out.println("Costo total: $" + String.format("%.2f", cTotal));

    }
}
/***
 * Ingrese la descripción del articulo: Pan
Ingrese la cantidad requerida: 10
Ingrese el precio unitario: 0,20

Detalles del Pedido:
Artículo: Pan
Cantidad: 10
Precio unitario: $0.2
Costo total: $2,00
 */
