/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoliDivisible;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class PoliDivisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(poliDivisible(381654729));
    }
    
    public static boolean poliDivisible(int numero){
        
        int aux = numero;           //1
        int i = 1;                  //1
        
        while (aux >= 10) {         //1
            aux = aux/10;               // k ( 2 + 2 + 1)
            i++;
        }                           
        
        while (i>0) {               //1
            if ((numero%i) == 0) {      //n ( 2 +
                numero = numero/10;     // 2 +
                i--;                    // 2 +
            }else{
                return false;           // minimo
            }
        }                               // 1 )
        
        return true;                //1
        
    }
    
    // 1 + 1 +1 + k(5) + 1 + n( 7 ) + 1
    // 7 + 5log n + 7n
    // O(n)
    
}
