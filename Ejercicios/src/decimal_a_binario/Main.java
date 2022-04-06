/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_a_binario;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(numeroBinario(2));
    }
    
    public static String numeroBinario(int n){
        
        int aux;
        
        if(n == 0) return "0";
        
        if(n == 1) return "1";
        
        if(n>1){
            
            aux = n%2;
            
            return numeroBinario(n/2) + aux;
            
        }
        
        return "";
    }
}

