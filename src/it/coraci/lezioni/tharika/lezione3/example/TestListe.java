/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.example;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class TestListe {
    
    public static void main(String[] args) {
        
        List<String> settimana = new LinkedList<>();
        
        int size = settimana.size();
        System.out.println("elementi size: "+size);
        
        settimana.add("Lunedì");
        settimana.add("Martedì");
        settimana.add("Mercoledì");
        
        size = settimana.size();
        System.out.println("elementi size dopo l'inserimento: "+size);
        
        String elemento = settimana.get(0);
        
        System.out.println("ELEMENTO 0 : "+elemento);
        
        for (int i = 0; i < settimana.size(); i++) {
            System.out.println("E: "+settimana.get(i));
        }
        
        for (String var : settimana) {
            System.out.println("E2: "+var);
        }
        
    }
    
}
