/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class posicion_Mayor_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int array[] = {1, 1, 2, 3, 14 , 5, 7, 8, 9};
         
        System.out.println(posicionMayor(array, array.length, 0 , -1, -1));
    }
    
    
    public static int posicionMayor(int array[], int n, int i, int mayor, int pm){
    
        if (i>= n)  {
            return pm;
        }
        if (array[i] >= mayor) {
            mayor = array[i];
            pm = i;
        }
        
        return posicionMayor(array, n, i+1, mayor, pm);
    }
            
//           | c, n == 0 costante
//           | 
//    T(n) = |
//           | 
//           | t(n-1) + c , n>0 mientras
    
}
