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
public class EsempioWHILE {

    public static void esempio() {
        String[] mesi = new String[]{"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};

        int i = 0;
        while (i < 12) {
            System.out.println("MESE -> " + mesi[i]);
            i++;
        }

        System.out.println("*********************************************");

        i = 0;
        while (true) {
             i++;
            if (i<6){
                continue; 
            }
            System.out.println("MESE -> " + mesi[i]);
           
            if (i==11) {
                break;
                
            }
        }

    }
}
