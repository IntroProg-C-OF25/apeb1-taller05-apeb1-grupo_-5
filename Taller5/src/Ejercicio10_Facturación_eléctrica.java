
import java.util.Scanner;

public class Ejercicio10_Facturación_eléctrica {

    public static void main(String[] args) {
        double vpluz, costokxh, kconsumidos, edad_u, valorbase, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DEL COSTO DE KILOVATIO POR HORA: ");
        costokxh = teclado.nextDouble();
        System.out.print("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS: ");
        kconsumidos = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edad_u = teclado.nextDouble();
        valorbase = costokxh * kconsumidos;
        if (edad_u > 65) {
            valorbase = (costokxh * kconsumidos) * (0.9);
            vpluz = valorbase;
            System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + vpluz);
        } else {
            vpluz = valorbase;
            System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + valorbase);
        }
    }
}
/***
 * run-single:
INGRESE EL VALOR DEL COSTO DE KILOVATIO POR HORA: 50
INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS: 40
INGRESE LA EDAD DEL USUARIO: 30
EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ 2000.0
BUILD SUCCESSFUL (total time: 15 seconds)
 */