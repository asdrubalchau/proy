/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatospollos;

import javax.swing.JOptionPane;

/**
 *
 * @author asdruballopezchau
 */
public class SolucionGatosPollos {

    private int totalCabezas;
    private int totalPatas;
    private int totalGatos;
    private int totalPollos;
    private String solucion = "";

    void resuelve() {
        if (totalPatas <= 0 || totalCabezas <= 0) {
            solucion = "Error en los datos, ceros";
            return;
        }
        double temp = ((4.0 * totalCabezas - totalPatas) / 2.0);

        if (temp < 0 || temp - (int) temp != 0) {
            solucion = "Error en los datos, fraccion";
            return;
        }
        totalPollos = (int) temp;
        totalGatos = totalCabezas - totalPollos;
        if (totalGatos < 0) {
            solucion = "Error en los datos, negativo";
            return;
        }
        solucion = "Total gatos = " + totalGatos
                + ", Total pollos = " + totalPollos;
    }

    /**
     * @return the totalCabezas
     */
    public int getTotalCabezas() {
        return totalCabezas;
    }

    /**
     * @param totalCabezas the totalCabezas to set
     */
    public void setTotalCabezas(int totalCabezas) {
        if (totalCabezas <= 0) {
            JOptionPane.showMessageDialog(null, "Verifique datos");
            return;
        }
        this.totalCabezas = totalCabezas;
    }

    /**
     * @return the totalPatas
     */
    public int getTotalPatas() {

        return totalPatas;
    }

    /**
     * @param totalPatas the totalPatas to set
     */
    public void setTotalPatas(int totalPatas) {
        if (totalPatas <= 0) {
            JOptionPane.showMessageDialog(null, "Verifique datos");
            return;
        }
        this.totalPatas = totalPatas;
    }

    /**
     * @return the totalGatos
     */
    public int getTotalGatos() {
        return totalGatos;
    }

    /**
     * @param totalGatos the totalGatos to set
     */
    public void setTotalGatos(int totalGatos) {
        this.totalGatos = totalGatos;
    }

    /**
     * @return the totalPollos
     */
    public int getTotalPollos() {
        return totalPollos;
    }

    /**
     * @param totalPollos the totalPollos to set
     */
    public void setTotalPollos(int totalPollos) {
        this.totalPollos = totalPollos;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

}
