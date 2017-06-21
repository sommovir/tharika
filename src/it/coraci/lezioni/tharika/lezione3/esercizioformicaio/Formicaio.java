/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.esercizioformicaio;

import compiti.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Formicaio {
    
    public static void main(String[] args) {
        System.out.println("ciao");
        
//        Insetto insetto = new Insetto();
//        insetto.setNome("ragno");
        
        Animale ragnetto = new Ragno(false, "Ragnetto");
        
        Animale tarantola = new Ragno(true, "Tarantola");
        
        
        Animale istrice = new Mammifero("Istrice", true);
        
        Animale cane = new Mammifero("Cane", true);
        
        Insetto scarafaggio = new Insetto("Scarafaggio", true, 6);
        
        List<Animale> animali = new ArrayList<>();
        
        animali.add(cane);
        animali.add(istrice);
        animali.add(tarantola);
        animali.add(ragnetto);
        animali.add(scarafaggio);
        
        for (Animale animale : animali) {
            System.out.println("NOME ANIMALE: "+animale.getNome());
            
            if(animale instanceof Ragno){
                System.out.println("-------------------------------");
                System.out.println("SONO UN RAGNO!!! "+animale.getNome()+" e ho "+((Ragno)animale).getNumZampe());
//                System.out.println("E' volante ? "+( animale).isVolante());
                System.out.println("--------------------------------");
            }
        }
        
        
        
        
    }
    
}
