/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatospollos;

/**
 *
 * @author asdruballopezchau
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SolucionGatosPollos s=new SolucionGatosPollos();
        s.setTotalCabezas(5);
        s.setTotalPatas(14);
        s.resuelve();
        System.out.println(s.getSolucion());
    }
    
}
