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
        System.out.println(cuadradosPerfectos(9, 25));
    }
    
    public static String cuadradosPerfectos(int a , int b){
        
        if (a>b) 
            System.out.println("Error, el numero a"         //x
                    + " no puede ser mayor que b \n");
        
        int i = 1;                                  //1
        int aux = 0;                                //1
        String x = "";                              //1
        
            while (i*i <= b) {                      //2 //n { 5 + 2 + 4  + 1 + 2}
                if (i*i >= a && i*i <= b) {
                    aux++;
                    x = x + i*i + " ";
                }
                i++;                                    
        }
        
        return "Numero a = " + a + ", numero b = " + b              // x
                + "\n salida = " + aux + ", cuadrados : " + x;
    }
    
    
        // x + 3 + 2 + x + n(14)
        // x + x + 6 + n(14)
        // O(n)
}
