
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
       int array[] = {20, 5, 4, 5, 48 , 14, 12, 42, 5};
        System.out.println(Arrays.toString(invertirArray(array)));
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
    
}
