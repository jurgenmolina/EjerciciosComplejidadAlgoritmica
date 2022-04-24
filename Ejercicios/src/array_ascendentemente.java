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
        int array[] = {0, 1, 2, 3, 4 , 5, 7, 8, 9};
        System.out.println(verificarOrden(array));
        
    }
    
    public static int verificarOrden(int array[]){
        
        int n = array.length;
        System.out.println(n);
        n = (n*(n+1))/2;
        System.out.println(n);
        
        int i = 0;
        while (i < array.length) {
            n -= array[i];
            i++;
        }
        return n;
        
    }
    
        // 6 + n(6)
        // 6 + 6n
        // O(n)
}
