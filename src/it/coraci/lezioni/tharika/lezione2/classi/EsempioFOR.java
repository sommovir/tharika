/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione2.classi;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class EsempioFOR {

    public static void esempio() {
        String[] mesi = new String[]{"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};

        for (int i = 0; i < 12; i++) {

            if (mesi[i].equals("Aprile")) {
                //System.out.println("CONTINUE!!!!");
                continue;
            }
            System.out.println("MESE: " + (i) + " " + mesi[i]);
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue;
            }

            System.out.println("i = " + i);
            for (int j = 0; j < 7; j++) {
                System.out.println("\tj = " + j);
            }
        }
    }

}
