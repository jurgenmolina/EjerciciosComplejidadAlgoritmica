/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class array_Numero_Veces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {20, 5, 4, 5, 48 , 14, 12, 42, 5};
        System.out.println(calcularNumeroAparicios(array, 5));
        
    }
    
    public static int calcularNumeroAparicios(int array[], int x){
        
        int i = 0;                  //2
        int aux = 0;                //2
        
        while (i < array.length) {  //1 + n ( 3 + 2 + 1)       
            if (array[i] == x) {
                aux++;
            }
            i++;
        }
        
        return aux;                 // 1
    
    }
    
        // 6 + n(6)
        // 6 + 6n
        // O(n)
}
