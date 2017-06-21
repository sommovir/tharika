/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.eserciziomatrimoni;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Matrimonio {
    public static void main(String[] args) {
        
        List<Persona> persone= new ArrayList<>();
        
        Persona tharika = new Persona("Tharika", "HEWA", 24, true);
        Persona claudio = new Persona("Claudio", "Hewa", 19, false);
        Persona luca = new Persona("Luca", "Coraci", 26, false);
        Persona luana = new Persona("Luana", "Mercuri", 22, true);
        
        persone.add(tharika);
        persone.add(claudio);
        persone.add(luca);
        persone.add(luana);
        
        String nomeMarito = JOptionPane.showInputDialog(null, "INSERISCI IL NOME DEL MARITO", "marito", JOptionPane.QUESTION_MESSAGE);
        String nomeMoglie = JOptionPane.showInputDialog(null, "INSERISCI IL NOME DELLA MOGLIE", "moglie", JOptionPane.QUESTION_MESSAGE);
        
        boolean maritoTrovato = false;
        boolean moglieTrovata = false;

        for (int i=0; i<persone.size(); i++){
            Persona p = persone.get(i);  // estrazione della persona
            if(p.getNome().equals(nomeMarito)&& !p.isGender()){
                maritoTrovato = true;
                break;
            }
        }
        
        for (int i=0; i<persone.size(); i++){
            Persona p = persone.get(i);  // estrazione della persona
            if(p.getNome().equals(nomeMoglie)&& p.isGender()){
                moglieTrovata = true;
                break;
            }
        }
        
        if(maritoTrovato && moglieTrovata){
            JOptionPane.showMessageDialog(null, "Si possono sposare !!");
        }else{
            JOptionPane.showMessageDialog(null, "Non si possono sposare");
        }
    }
}
