/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class matrizSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][] = {{20, 5, 4, 5}, {5, 48 , 14, 5}, {12, 42, 5, 4}, {20, 5, 4, 5}};
        System.out.println(calcularNumeroAparicios(array));
        
    }
    
    public static boolean calcularNumeroAparicios(int array[][]){
        
        int i = 0;              //2
        
        while (i < array.length) {  // n
            if (array.length != array[i].length) {
                
                return false;
            }
            i++;
        }
        
        return true;                 // 1
    
    }
        // O (n)
}
