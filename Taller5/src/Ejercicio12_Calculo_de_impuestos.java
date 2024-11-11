import java.util.Scanner;
public class Ejercicio12_Calculo_de_impuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del automóvil: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): ");
        String origen = scanner.nextLine();
        System.out.print("Ingrese el costo del automóvil: ");
        double costo = scanner.nextDouble();
        double impuesto;
        double precioVenta;
        
        switch (origen.toLowerCase()) {
            case "alemania":
                impuesto = costo * 0.20;
                break;
            case "japón":
            case "japon":
                impuesto = costo * 0.30;
                break;
            case "italia":
                impuesto = costo * 0.15;
                break;
            case "usa":
                impuesto = costo * 0.08;
                break;
            default:
                System.out.println("Origen no válido. No se puede calcular el impuesto.");
                return;
        }
        
        precioVenta = costo + impuesto;
        System.out.printf("Automóvil: %s%n", marca);
        System.out.printf("Origen: %s%n", origen);
        System.out.printf("Costo: $%.2f%n", costo);
        System.out.printf("Impuesto a pagar: $%.2f%n", impuesto);
        System.out.printf("Precio de venta (incluido el impuesto): $%.2f%n", precioVenta);
        
    }
}


    

