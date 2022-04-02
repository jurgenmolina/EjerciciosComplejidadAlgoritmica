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
        
        int aux = numero;
        int i = 1;
        
        while (aux >= 10) {
            aux = aux/10;
            i++;
        }
        
        while (i>0) {            
            if ((numero%i) == 0) {
                numero = numero/10;
                i--;
            }else{
                return false;
            }
        }
        
        return true;
        
    }
    
}
