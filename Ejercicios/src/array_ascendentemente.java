/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class array_ascendentemente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {2, 5, 6, 7, 48 , 75, 82, 83, 85};
        System.out.println(verificarOrden(array));
        
    }
    
    public static boolean verificarOrden(int array[]){
        
          int i = 0;            
        while (i < array.length-1) {            
            if (array[i] > array[i+1]) {
                return false;
            }
            i++;
        }
        return true;
        
    }
    
        // 6 + n(6)
        // 6 + 6n
        // O(n)
}
