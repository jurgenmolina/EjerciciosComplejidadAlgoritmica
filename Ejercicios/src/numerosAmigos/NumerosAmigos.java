/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class NumerosAmigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(Arrays.deepToString(calcularNumerosAmistosos(1000,1500))); //cantidad de numeros amigables
    }

    public static int[][] calcularNumerosAmistosos(int min , int max) {

        int aux;
        int sumaM;
        int m = min, n;
        int i = 0;

        int[][] numerosAmistosos = new int[5][2];
        

        while (m <= max) {

            aux = 1;
            n = 0;
            
            while (aux < m) {
                if ((m % aux) == 0) {
                    n = n + aux;
                }
                aux++;
            }
            

            aux = 1;
            sumaM = 0;

            while (aux < n) {

                if ((n % aux) == 0) {
                    sumaM = sumaM + aux;
                }
                aux++;

            }
            
            if (m == sumaM && m != n) {
                numerosAmistosos[i][0] = m;
                numerosAmistosos[i][1] = n;
                i++;
            }
            
            m++;
        }

        return numerosAmistosos;
    }

}
