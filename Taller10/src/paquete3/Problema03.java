package paquete3;

/*
 * @author ALISrj21 & cbhas
 */

public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas.length; j++) {
                if (notasCuantitativas[i][j] >= 0 && notasCuantitativas[i][j] <= 2.9) {
                    notasCualitativas[i][j] = "Insuficiente";

                } else {
                    if (notasCuantitativas[i][j] >= 3 && notasCuantitativas[i][j] <= 4.9) {
                        notasCualitativas[i][j] = "Regular";

                    } else {
                        if (notasCuantitativas[i][j] >= 5 && notasCuantitativas[i][j] <= 7.9) {
                            notasCualitativas[i][j] = "Buena";

                        } else {
                            if (notasCuantitativas[i][j] >= 8 && notasCuantitativas[i][j] <= 9.5) {
                                notasCualitativas[i][j] = "Muy Buena";

                            } else {
                                notasCualitativas[i][j] = "Sobresaliente";

                            }

                        }

                    }

                }
            }

        }
        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas.length; j++) {
                System.out.println(notasCualitativas[i][j]);
            }
        }
    }
}