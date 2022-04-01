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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Es triangular? = " + numeroTriangular(1));
    }

    public static boolean numeroTriangular(int n) {

        int i = 1; //2 ******* 3 ** 4 ** 5
        int suma = 0; // 1 *** 3 ** 6 ** 10

        while (suma < n) {
            suma = suma + i;
            i++;
        }

        if (suma == n) {
            return true;
        }
        
        return false;
    }

}
