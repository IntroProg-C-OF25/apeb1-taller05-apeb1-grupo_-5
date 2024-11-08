
import java.util.Scanner;

/**
 * Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace
 * un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se
 * hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un
 * solución que pida como datos de entrada el número de días y el precio diario
 * de la habitación y luego calcule e imprima el subtotal por pagar, el
 * descuento y el total por pagar.
 *
 * @author sebas
 */
public class Ejercicio13_sisReservaHotel {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int nDias;
        double pdiario, sTotal, descuento, montoDescuento, total;

        System.out.println("Ingrese el número de días de hospedaje: ");
        nDias = sca.nextInt();
        System.out.println("Ingrese el precio de la habitación: ");
        pdiario = sca.nextDouble();
        sTotal = nDias * pdiario;
        descuento = 0;
        if (nDias > 15) {
            descuento = 0.20;
        } else if (nDias > 10) {
            descuento = 0.15;
        } else if (nDias > 5) {
            descuento = 0.10;
        }
        montoDescuento = sTotal * descuento;
        total = sTotal - montoDescuento;
        System.out.println("\nResumen de la Reserva:");
        System.out.println("Subtotal: $" + String.format("%.2f", sTotal));
        System.out.println("Descuento: $" + String.format("%.2f", montoDescuento));
        System.out.println("Total por pagar: $" + String.format("%.2f", total));
    }
}
/***
 * Ingrese el número de días de hospedaje: 
20
Ingrese el precio de la habitación: 
40

Resumen de la Reserva:
Subtotal: $800,00
Descuento: $160,00
Total por pagar: $640,00
BUILD SUCCESSFUL (total time: 10 seconds)

 */