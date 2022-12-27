package paquete5;

/*
 * @author ALISrj21 & cbhas
 */

public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                  {"Carrie Burton", "Lauren Rice"},
                                  {"Emma Escobar", "Lori Flores"},
                                  {"Steven West", "Toni Martin"}};
        String inicial;
        String mensaje = "";
        char inicialLetra;

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                inicialLetra = estudiantes[i][j].charAt(0);

                inicial = String.valueOf(inicialLetra);
                switch (inicial) {
                    case "S":
                    case "T":
                    case "P":
                        mensaje = String.format("%s%s\n", mensaje, estudiantes[i][j]);
                        break;
                }
            }

        }
        System.out.print(mensaje);

    }

}