/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class sumarArrayPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][] = {{20, 5, 4},{5, 48 , 14,} ,{12, 42, 5}};
        System.out.println(calcularNumeroAparicios(array));
        
    }
    
    public static int calcularNumeroAparicios(int array[][]){
        
        int i = 0, j = 0;                  //2
        int aux = 0;                //2
        
        while (i < array.length) {  //1 + n ( n (2 + 3 + 2) + 3)  + 1
            while (j<array[i].length) { 
                aux += array[i][j];
                j++;
            }
            i++;
            j = 0;
        }
        
        return aux;                 // 1
    
    }
    
    // 2 + n( n (7) + 3)
    // 2 + 7n^2 + 3n
    // O(n^2)
    
}
