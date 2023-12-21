/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double total = 0;
        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("Ingrese las ventas diarias de: %s\n",
                    vendedores[i]);

            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = entrada.nextDouble();

            }
        }
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                total = total + ventas[i][j];

            }

        }
        System.out.printf("Vendedor(a)%s\nVendedor(a)%s\nHa realizado un "
                + "total de: %.2f en ventas"
                ,vendedores[0],vendedores[1],total);
    }

}
