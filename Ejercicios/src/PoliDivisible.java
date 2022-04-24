/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class PoliDivisible {

    /**
     * Se quiere escribir un programa para determinar si un número
     * es PoliDivisible. Un número es considerado PoliDivisible si:
        a.Es divisible por su longitud.
        b.Al quitarle sucesivamente el dígito más a la derecha el número 
     *    que queda sigue siendo PoliDivisible.

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
