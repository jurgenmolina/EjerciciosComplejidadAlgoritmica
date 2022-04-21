/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalendarioLunar;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class calendarioLunar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            calcularFaseLunar(21, 4, 2022);
    }
    
    public static void calcularFaseLunar(int dia, int mes, int año){
        int numeroOro = (año+1)%19;
        
        int epacta = (numeroOro-1)*11;
        epacta = epacta%30;
        
        
        
        int correcion = 0;
        
        if (mes == 1 ) {
            correcion = 0;
        }
        if (mes == 2) {
            correcion = 1;
        }
        if ( mes > 2) {
            correcion = mes - 3;
        }
        
        int cmes = (epacta + correcion)%30;
        System.out.println("Correcion del mes = " + cmes);
        
        if (cmes == 0 || cmes == 29) {
            System.out.println("Inicio de Luna Nueva");
        }
        if (cmes == 7) {
            System.out.println("Inicio de Cuarto Creciente");
        }
        if (cmes == 14) {
            System.out.println("Inicio luna llena");
        }
        if (cmes == 21) {
            System.out.println("Inicio de Cuarto Menguante");
        }
        
        if (cmes > 0 && cmes < 7) {
            System.out.println("Luna Nueva");
        }
        
        if (cmes > 7 && cmes < 14) {
            System.out.println("Cuarto Creciente");
        }
        
        if (cmes > 14 && cmes <21) {
            System.out.println("Luna llena");
        }
        
        if (cmes > 21 && cmes <29) {
            System.out.println("Cuarto Menguante");
        }
        
    }
    
}
