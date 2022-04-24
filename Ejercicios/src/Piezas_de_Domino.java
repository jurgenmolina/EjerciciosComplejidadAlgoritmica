/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class Piezas_de_Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(domino(28));
    }
    
    
    public static int domino(int n){
    
        int aux = 0; int auxx = 0;
        int suma = 0;
        
        while (n>0) {            
            if (auxx != 6) {
                auxx++;
            }
            else if(aux == 6){
                return suma;
            }
            else{
                aux++;
                auxx = aux;
            }
            System.out.println("(" + aux + "|" + auxx + ")");
            
            suma = suma + aux + auxx;
            n--;
        }
        
        return suma;
        
    }
    
}
