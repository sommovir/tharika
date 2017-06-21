/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione2;

import it.coraci.lezioni.tharika.lezione1.classi.Persona;
import it.coraci.lezioni.tharika.lezione2.classi.EsempioFOR;
import it.coraci.lezioni.tharika.lezione2.classi.EsempioWHILE;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Lezione2_Cicli {

    public static void main(String[] args) {

        System.out.println("Lezione2, CICLI");
        EsempioFOR.esempio();
        EsempioWHILE.esempio();
        System.out.println("NUOVA VERSIONE 2");
        
        String cane = "merlicchia";
        String cane2 = new String("merlicchia");
//        cane2 = "merlicchia";
        
        Persona luca = new Persona("Luca", "Coraci", 22, true);
        Persona luca2 = new Persona("Luca", "Coraci", 22, true);
//        Persona tharika = new Persona("Tharika","Hewa",23, false);
        
        if(luca.equals(luca2)){
            System.out.println("SONO UGUALI");
        }else{
            System.out.println("SONO DIVERSI");
        }

    }

}
