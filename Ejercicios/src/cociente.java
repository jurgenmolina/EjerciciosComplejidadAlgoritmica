/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class cociente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 565;
        int b = 5;
        System.out.println("Cociente de "+ a + "/" + b + " = " + cocienteRecursivo(a, b));
    }
    
    public static int cociente(int a, int b){
        int aux = 0;
        
        while (a>0) {            
            a = a - b;
            aux++;
        }
        
        return aux;
        
    }   // O()
    
    public static int cocienteRecursivo(int a, int b){
        
        if (a <= 0) {
            return 0;
        }
        
        if (a < b) {
            return 0;
        }
        
        
        return 1 + cocienteRecursivo(a-b, b);
        
    } 
    
}
