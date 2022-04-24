/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Producto de "+ a + "*" + b + " = " + producto(a, b));
    }
    
    public static int producto(int a, int b){
        int aux = 0;
        
        while (b>0) {            
            aux += a;
            b--;
        }
        
        return aux;
        
    }   // o(N)
    
}
