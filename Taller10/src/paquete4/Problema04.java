/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        int contador = 0;
        double[][] datos = new double[2][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese el valor en la posicion: "
                        + "[%d][%d]\n",
                        i, j);
                datos[i][j] = entrada.nextInt();
                if (datos[i][j] < 1000 || datos[i][j] > 1199) {
                    datos[i][j] = 10;

                }
                if (datos[i][j] == 10) {
                    contador++;

                }
                cadena = String.format("%s%.2f\n ",
                        cadena, datos[i][j]);
            }
        }
        System.out.printf("Arreglo: %sValores fuera de rango : %d",
                 cadena, contador);
    }
}
