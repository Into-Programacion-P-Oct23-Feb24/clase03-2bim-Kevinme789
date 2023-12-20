/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int suma = 0;
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++) {
                // Con el ciclo for va ir por cada fila y columna hasta que 
                // la condicion puesta ya no se cumpla, con el if solo estoy
                // tomando en cuanto los elementos que se encuentren en la misma
                // columna y fila asi solamente sumando los elementos que deseamos
                if (c == f) {
                    suma = suma + arreglo[f][c];
                }

            }
        }
        System.out.printf("%d\n", suma);
    }
}
