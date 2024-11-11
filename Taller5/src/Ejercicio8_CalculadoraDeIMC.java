
import java.util.Scanner;

public class Ejercicio8_CalculadoraDeIMC {

    public static void main(String[] args) {
        double pesokg, altura, peso;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE SU PESO EN KILOGRAMOS: ");
        pesokg = tcl.nextDouble();
        System.out.print("INGRESE SU ESTATURA: ");
        altura = tcl.nextDouble();
        peso = (pesokg / (altura * altura));
        if (peso > 0 && peso <= 18) {
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN BAJO PESO");
        } else if (peso > 18.5 && peso <= 25) {
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN UN PESO NORMAL");
        }
        if (peso > 25 && peso <= 30) {
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN SOBREPESO");
        }
        if (peso > 30 && peso <= 35) {
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN OBESIDAD LEVE");
        }
        if (peso > 35 && peso <= 40) {
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN OBESIDAD MODERADA");
        }
        if (peso > 40 && peso <= 100) {
            System.out.println("EL IMC DE LA PERSONA SE ENCUENTRA EN OBESIDAD MORBIDA");
        }

    }

}

/***
 * run-single:
INGRESE SU PESO EN KILOGRAMOS: 70
INGRESE SU ESTATURA: 175
EL IMC DE LA PERSONA SE ENCUENTRA EN BAJO PESO
BUILD SUCCESSFUL (total time: 8 seconds)
 */