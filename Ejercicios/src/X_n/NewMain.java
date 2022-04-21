/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package X_n;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("resultado :"+ potencia(2,4));
    }
    
    public static long potencia(int x, int n) {
      if (n==0) return 1;           // 2
      if (n==1) return x;           //2 
      long r=potencia (x,n/2);      // c + ?
        System.out.println("r: " + r);  //k
      if (n%2==0) return r*r;       //2         //1
      return r*r*x;                             //2
}
    
    // T(n/2) + c
    // T (n/2^k) + kc
    // T(log n) 
    
}
