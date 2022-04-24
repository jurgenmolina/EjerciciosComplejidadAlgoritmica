/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class ArrayVery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int Array[] = {1, 0, 1, 0, 1 , 0};

        System.out.println(verificarArray(Array, 0, 1));
    }

    public static boolean verificarArray(int Array[], int i, int j) {
        if (i<Array.length) {
            if (Array[i] == 0) {
                if (j == 0) {
                    j++;
                }else{
                    return false;
                }
        }
            if (Array[i] == 1) {
                if (j == 1) {
                    j--;
                }else{
                    return false;
                }
        }
            return verificarArray(Array, i+1, j);
        }
        
        return true;

    }

}
