/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerotriangular;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class NumeroTriangular {

    /**
     * Se dice que un número n es triangular se
     * puede expresar como la suma de los j primeros números.
     * Determinar si un número n es triangular o no.
     */
    public static void main(String[] args) {
        System.out.println("Es triangular? = " + numeroTriangular(10));
    }

    public static boolean numeroTriangular(int n) {

        int i = 1;              //1
        int suma = 0;           //1

        while (suma < n) {      //1 //n
            suma = suma + i;        //2
            i++;                    //2
        }

        if (suma == n) {        //max( 1 + 1)
            return true;
        }
        
        return false;           // 1
    }
    
    // 4 + n(4) + 2
    // 6 + 6n
    // O (n)

}
