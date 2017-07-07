/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4.tharika.ric.esercizioProf;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Ese2 {

    public static int contaCarattere(String parola, char c) {

        return aux(parola, c, 0);

    }

    private static int aux(String parola, char c, int i) {
        if (parola == null) {
            return 0;
        }

        if (i < 0 || i >= parola.length()) {
            return 0;
        }

        if (parola.charAt(i) == c) {
            return 1 + aux(parola, c, i + 1);
        } else {
            return aux(parola, c, i + 1);
        }
    }
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {

        String occorrenza = "cocomero";
        int cc = contaCarattere(occorrenza, 'o');

        System.out.println(""+cc);

        
    }
    
    
    

}
