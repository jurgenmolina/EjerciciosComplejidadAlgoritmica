/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALU_DIVISION_Resto;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(residuo(3, 3));
    }
    
    public static int residuo(int m, int n) {
        if (n <=0) {        //2
            return 0;
        }
        if (m < n) {        // 2
            return 0;
        }
        int i = 0;          //2
        int aux = m;        //2
        
        while (aux>=n) {       // 1 + k(     
            aux = aux - n;          // 2 +
            i++;                    // 2 + 1)
        }
        aux = 0;            //1
        
        while (i>0) {          // 1 + n(  
            aux = aux + n;      //2
            i--;                // 2 + 1)
        }
        
        return m - aux;         // 2
        
    }   // n + log n 
    
}
