/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuadradosPerfectos;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class CuadradosPerfectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(cuadradosPerfectos(90, 25));
    }
    
    public static String cuadradosPerfectos(int a , int b){
        
        if (a>b) 
            System.out.println("Error, el numero a no puede ser mayor que b \n");
        
        int i = 1;
        int aux = 0;
        String x = "";
        
            while (i*i <= b) {  
                if (i*i >= a && i*i <= b) {
                    aux++;
                    x = x + i*i + " ";
                }
                i++;
        }
        
        return "Numero a = " + a + ", numero b = " + b 
                + "\n salida = " + aux + ", cuadrados : " + x;
    }
    
}
