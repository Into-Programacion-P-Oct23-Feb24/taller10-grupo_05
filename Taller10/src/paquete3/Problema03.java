
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        double promedio;
        double suma = 0;
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        for (int i = 0; i < notasCuantitativas.length; i++) {
            suma = 0;
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                if (notasCuantitativas[i][j] >= 0 && 
                        notasCuantitativas[i][j] <= 2.9) {
                    notasCualitativas[i][j] = "Insuficiente";
                } else {
                    if (notasCuantitativas[i][j] >= 3 && 
                            notasCuantitativas[i][j] <= 4.9) {
                        notasCualitativas[i][j] = "Regular";
                    } else {
                        if (notasCuantitativas[i][j] >= 5 && 
                                notasCuantitativas[i][j] <= 7.9) {
                            notasCualitativas[i][j] = "Buena";
                        } else {
                            if (notasCuantitativas[i][j] >= 8 && 
                                    notasCuantitativas[i][j] <= 9.5) {
                                notasCualitativas[i][j] = "Muy Buena";
                            } else {
                                if (notasCuantitativas[i][j] >= 9.6 && 
                                        notasCuantitativas[i][j] <= 10) {
                                    notasCualitativas[i][j] = "Sobresaliente";
                                }
                            }
                        }
                    }
                }
                System.out.printf("La nota: %.2f es: %s\n"
                    ,notasCuantitativas[i][j],notasCualitativas[i][j]);
            }
            
        }
    }
}
