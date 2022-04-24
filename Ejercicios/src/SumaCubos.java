/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class SumaCubos {

    /**
     * 1.	Dado un número n, encuentra dos pares que puedan representar el número
     * como la suma de dos cubos. En otras palabras, encuentre dos pares (a, b)
     * y (c, d) de tal manera que dado el número n puede ser expresado como: n =
     * a^3 + b^3 = c^3 + d^3
     */
    public static void main(String[] args) {
        sumaCubos(13832);
    }

    public static void sumaCubos(int n) {

        int a = 0, b = 0, c = 0, d = 0, aux;

        double raizCubica = Math.cbrt(n);
        
        a = (int) raizCubica;
        
        raizCubica = Math.pow(a, 3);
        
        b = (int) raizCubica;


        if (n != b) {
            aux = n - b;
            raizCubica = Math.cbrt(aux);
            b = (int) raizCubica;
        }
        int i = 1;
        
        while (c ==0 && d == 0) {            
            c = a - i;
            raizCubica = Math.pow(c, 3);
            c = (int) raizCubica;
            d = n - c;
            raizCubica = Math.cbrt(d);
            d = (int) raizCubica;
            raizCubica = Math.pow(d, 3);
            d = (int) raizCubica;
            
            if (n == (c+d)) {
                raizCubica = Math.cbrt(c);
                c = (int) raizCubica;
                raizCubica = Math.cbrt(d);
                d = (int) raizCubica;
            }else{
                c = 0;
                d = 0;
                i++;
            }
        }

        System.out.println("(" + b + "," + a + ") y (" + d + "," + c + ")");

    }

}
