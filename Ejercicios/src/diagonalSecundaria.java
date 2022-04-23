/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class diagonalSecundaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][] = {{20, 5, 4, 5}, {5, 48 , 14, 5}, {12, 42, 5, 4}, {20, 5, 4, 5}};
        
        if (calcularNumeroAparicios(array)) {
            System.out.println("La suma de la diagonal"
                    + " secundaria es: " + diagonalSecundariaa(array));
        }
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
    
    
    public static int diagonalSecundariaa(int array[][]){
        
        int i = 0, j=0;              //2
        int aux = 0;
        int n = array.length;
        
        while (i < array.length) {    
                aux += array[i][n-j-1];
                i++;
                j++;
        }
        
        return aux;                 // 1
    
    }
}
