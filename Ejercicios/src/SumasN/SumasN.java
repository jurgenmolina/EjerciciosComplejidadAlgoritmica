/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumasN;

import java.util.ArrayList;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class SumasN {

    /**
     * @param args the command line arguments
     */
    static ArrayList<String> sumas = new ArrayList();

    public static void main(String[] args) {
        System.out.println(sumasN(10));
    }

    public static String sumasN(int n) {
        
        if (n == 1) {
            return "1";
        }
        
        if (n>1) {
            return "1+" + sumasN(n-1);
        }
        
        return "";
        
    }

}
