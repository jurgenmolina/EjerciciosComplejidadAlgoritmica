/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrearL3;

import java.util.ArrayList;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
     public static ArrayList<Integer> recursiveIntersection(int[] A, int[] B, 
             int lengthA, int lengthB, int i, int j, ArrayList<Integer> l) {
        if (i < lengthA) {
            if (j < lengthB) {
                if (A[i] == B[j]) {
                    l.add(B[j]);
                }
                return recursiveIntersection(A, B, lengthA, lengthB, i, j + 1, l);
            }
            j = 0;
            recursiveIntersection(A, B, lengthA, lengthB, i + 1, j, l);
        }
        return l;
    }
    
}
