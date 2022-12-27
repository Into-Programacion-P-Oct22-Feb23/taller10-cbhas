package paquete1;

/*
 * @author ALISrj21 & cbhas
 */

public class Problema01 {

    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] sumaNotas = new double[3];

        double suma = 0;
        String reporte = "";

        for (int i = 0; i < notas.length; i++) {
            suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];

            }
            sumaNotas[i] = suma / notas[i].length; // 
        }

        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante: %s tiene un proemdio de "
                    + "%.2f\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i]);
        }

        System.out.printf("%s\n", reporte);

    }
}