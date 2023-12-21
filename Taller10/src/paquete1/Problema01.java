/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma = 0;
        double promedio;
        String cadena = "";
        double[][] arreglonotas = {{9, 10, 7, 8}, {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedios = new double[3];
        
        for (int i = 0; i < arreglonotas.length; i++) {
            suma = 0;
            for (int j = 0; j < arreglonotas[i].length; j++) {
                suma = suma + arreglonotas[i][j];
                promedio = suma / 4;
                promedios[i] = promedio;
            }

        }
        for (int i = 0; i < promedios.length; i++) {
            cadena = String.format("%sEstudiante: %s tiene un promedio"
                        + " de: %.2f\n", cadena, estudiantes[i], promedios[i]);
            
        }
        System.out.printf("%s", cadena);
    }

}
