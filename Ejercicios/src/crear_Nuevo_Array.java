/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
        int array1[] = {1, 3, 5, 7};
        int array2[] = {2, 4, 6, 8};
        
        System.out.println(Arrays.toString(crearL3(array1, array2)));
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
    
}
