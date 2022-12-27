package paquete4;

import java.util.Scanner;
import java.util.Locale;

/*
 * @author ALISrj21 & cbhas
 */

public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] datos = new double[2][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.println("Ingrese el valor:");
                datos[i][j] = entrada.nextDouble();

            }

        }
        System.out.println("\nLos valores ingresados, son:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%.2f\n", datos[i][j]);
            }
        }
    }
}