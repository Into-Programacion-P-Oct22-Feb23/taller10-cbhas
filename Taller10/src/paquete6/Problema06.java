package paquete6;

/*
 * @author ALISrj21 & cbhas
 */

public class Problema06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                  {"Carrie Burton", "Lauren Rice"},
                                  {"Emma Escobar", "Lori Flores"},
                                  {"Steven West", "Toni Martin"}};
        String mensaje = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j].length() == 11) {
                    mensaje = String.format("%s%s\n",
                            mensaje,
                            estudiantes[i][j]);

                }

            }

        }
        System.out.print(mensaje);

    }

}