
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numDia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el numero de dia: ");
        numDia = teclado.nextInt();
        //Estructura de control de seleccion multiple
        //EN CADO DE <=> SWITCH
        switch (numDia) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
        }

    }

}
