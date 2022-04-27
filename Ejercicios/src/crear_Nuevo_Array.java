/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class crear_Nuevo_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array1[] = {25, 14, 78, 56, 17, 33,55,98};
        int array2[] = {22, 33, 48, 60, 17, 55 , 23, 2};
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        l = recursiveIntersectionJurgen(array1, array2, 0, 0, l);
        
        
        l.forEach(System.out::println);

            
    }
    
    public static int [] crearL3(int array1[], int array2[]){
        
        int n = array1.length + array2.length;
        
        int[] array3 = new int[n];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n){
            if (i%2 == 0) {
                array3[i] = array1[j];
                j++;
            }else{
                array3[i] = array2[k];
                k++;
            }
            i++;
        }
        
        return array3;

    }
    
    public static ArrayList<Integer> recursiveIntersection(int[] A, int[] B, int lengthA, int lengthB, int i, int j,
            ArrayList<Integer> l) {
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
    
    public static ArrayList<Integer>  recursiveIntersectionJurgen(int[] A, int[] B, int i, int j
    ,ArrayList<Integer> l){
        
        if (i < A.length) {
            if (j < B.length) {
                if (A[i] == B[j]) {
                    l.add(B[j]);
                }
                 return recursiveIntersectionJurgen(A, B, i, j+1, l);}
            j=0;
            return recursiveIntersectionJurgen(A, B, i+1, j, l);
        }
        return l;
    }
    
    
    // O ( a * b )
}
