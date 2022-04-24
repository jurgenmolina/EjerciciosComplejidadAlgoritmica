
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class invertirArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int array[] = {20, 5, 4, 5, 12, 30, 20, 50};
        System.out.println(Arrays.toString(invertirArrayRecursivo2(array, 0, 7)));
    }
    
    public static int [] invertirArray(int array[]){
    
       int[] arrayAux = new int[array.length];
       
       int i = array.length-1 ;
       int x = 0;
        while (i >= 0) {            
            arrayAux[x] = array[i];
            i--;
            x++;
        }
       
        return arrayAux;
    }
    
    static int[] arrayA = new int[9];
    
    public static int [] invertirArrayRecursivo(int array[], int i, int n){
    
        if (array.length == 0) {
            return array;
        }
        
        if (i == array.length) {
            return arrayA;
        }
        arrayA[i] = array[n];
        
        return invertirArrayRecursivo(array, i+1, n-1);
        
    }
    
    public static int [] invertirArrayRecursivo2(int array[], int i, int n){
    
        if (array.length == 0) {
            return array;
        }
        
        
        if (i == n/2) {
            return array;
        }
        
        int aux = array[n];
        array[n] = array[i];
        array[i] = aux;
        
        return invertirArrayRecursivo2(array, i+1, n-1);
        
    }
    
    
}
