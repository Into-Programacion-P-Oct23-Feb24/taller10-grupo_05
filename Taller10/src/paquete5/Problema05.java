/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String inicial;
        String cadena = "";
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                inicial = estudiantes[i][j];
                inicial = estudiantes[i][j].substring(0, 1);
                switch (inicial.toUpperCase()) {
                    case "S":

                    case "T":

                    case "P":
                        cadena = String.format("%s%s\n",
                                 cadena, estudiantes[i][j]);
                    default:
                        break;

                }
            }
        }
        System.out.printf("%s", cadena);

    }
}
