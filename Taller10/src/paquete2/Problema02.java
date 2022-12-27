package paquete2;

import java.util.Scanner;
import java.util.Locale;

/*
 * @author ALISrj21 & cbhas
 */

public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[][] ventas = new int[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int suma = 0;

        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese el número de venta del día: ");
                ventas[i][j] = entrada.nextInt();

                suma = suma + ventas[i][j];

            }

        }
        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("Vendedor(a) %s\n", vendedores[i]);

        }
        System.out.printf("Ha realizado un total de %d en ventas.\n", suma);

    }
}