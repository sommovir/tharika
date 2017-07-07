/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4.tharika.ric.esercizioProf;

/**
 *
 * 1) true o false se c'è un antenato con il nome x 2) quanti antenati hanno età
 * inferiore ad x 3) ogni antenato ha un padre e ogni padre ha un età, nome.
 * Data una persona mi restituisca l'antenato più vecchio
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class AntenatoMain {

    public static boolean antenato(Antenato a, String x) {

        if (a == null) {
            return false;
        }
        System.out.println("" + a.getNome());

        if (x == null) {
            return false;
        }

        Antenato padre = a.getPadre();
        if (padre == null) {
            return false;
        }

        if (padre.getNome().equals(x)) {
            System.out.println("C'è un antenato!" + a.getNome());
            return true;
        }

        System.out.println("No non c'è un antenato");

        return antenato(padre, x);

    }
    
    
    public static int minoreEta(Antenato a, int  x) {

        if (a == null) {
            return 0;
        }
         
        Antenato padre = a.getPadre();
        if (padre == null){
            return 0;
        }
        
        if (padre.getEta() < x) {
            return 1 + minoreEta(padre, x);
        } else {
            return minoreEta(padre, x);
        }
    
    }

    public static void main(String[] args) {
        
        Antenato a1 = new Antenato("Mario",88, null);
        Antenato a2 = new Antenato("Paolo",58, a1);
        Antenato a3 = new Antenato("Claudio",77, a2);
        Antenato a4 = new Antenato("Renato",68, a3);
        
        
        boolean trovato = antenato(a4, "Mario2");
        if(trovato ){
            System.out.println("Trovato!!!");
        }
        else System.out.println("Non trovato!");
   
    
    
    System.out.println("------------------------");
    
    
    
    
        int quantiConEtaMinoreDi = minoreEta(a4,80);
        System.out.println("quelli con età minore di 80 sono "+quantiConEtaMinoreDi);
        
    
    }
    
    
    
    
    
}
