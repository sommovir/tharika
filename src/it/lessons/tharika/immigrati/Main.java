/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.tharika.immigrati;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static void main(String[] args) {

        ForzaOrdine poliziotto1 = new Polizia("Ciccio", "Panza");
        poliziotto1.setStipendio(1200);

        ForzaOrdine poliziotto2 = new Polizia("Mario", "marlo");
        ForzaOrdine poliziotto3 = new Polizia("Pippo", "Pippi");

        ForzaOrdine carabiniere1 = new Carabinieri("Ignazio", "Della Lazio");
        ForzaOrdine carabiniere2 = new Carabinieri("Romano", "Romanis");
        ForzaOrdine carabiniere3 = new Carabinieri("Carlo", "Lombrichi");

        ForzaOrdine militare1 = new Militari("Paolo", "Gondola");
        ForzaOrdine militare2 = new Militari("Claudia", "Polla");
        ForzaOrdine militare3 = new Militari("Fabrizio", "Ignazi");

        Immigrati immi1 = new Immigrati(true, "Abdul", "Mustafuck");
        Immigrati immi2 = new Immigrati(true, "Marzuc", "Bikkuc");
        Immigrati immi3 = new Immigrati(true, "Trovatello", "Pignarolo");
        Immigrati immi4 = new Immigrati(false, "Yussef", "Mohamaf");

        Volontario vol1 = new Volontario("Benvenuti", "Pippo", "Baudo");
        Volontario vol2 = new Volontario("Benvenuti", "Melania", "Carmela");
        Volontario vol3 = new Volontario("Benvenuti", "Filippo", "Blundo");
        Volontario vol4 = new Volontario("WWF", "Tharika", "Wije");
        Volontario vol5 = new Volontario("WWF", "Clara", "Bella");
        Volontario vol6 = new Volontario("WWF", "Ombellico", "Simpatico");
        Volontario vol7 = new Volontario("SaveTheChildren", "Fabrizio", "Piermarini");
        Volontario vol8 = new Volontario("SaveTheChildren", "Francesco", "Calcolo");

        CentroImmigrati centro = new CentroImmigrati();

        centro.addPersona(poliziotto1);
        centro.addPersona(poliziotto2);
        centro.addPersona(poliziotto3);

        centro.addPersona(carabiniere1);
        centro.addPersona(carabiniere2);
        centro.addPersona(carabiniere3);

        centro.addPersona(militare1);
        centro.addPersona(militare2);
        centro.addPersona(militare3);

        centro.addPersona(immi1);
        centro.addPersona(immi2);
        centro.addPersona(immi3);
        centro.addPersona(immi4);
        centro.addPersona(vol1);
        centro.addPersona(vol2);
        centro.addPersona(vol3);
        centro.addPersona(vol4);
        centro.addPersona(vol5);
        centro.addPersona(vol6);
        centro.addPersona(vol7);
        centro.addPersona(vol8);

        int sommatoria =0;
        for (Persona persona : centro.getPersone()) {
            if (persona instanceof ForzaOrdine) {
                int stipendioPersona = (((ForzaOrdine)persona).getStipendio()) ;
                System.out.println("PERSONE: " + persona.getNome() + " " + persona.getCognome() + "percepisce "+stipendioPersona+"€");
                sommatoria = sommatoria + stipendioPersona; // mi caolo il tutto, partendo 
                
//                System.out.println(totale);
            }
        }
        System.out.println(sommatoria);
        
    }

}
