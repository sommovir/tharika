/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione4;

import it.coraci.lezioni.tharika.lezione4.exceptions.NameMissingException;
import it.coraci.lezioni.tharika.lezione4.exceptions.SurnameMissingException;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Database {

    public static void salvaPersona(Persona persona) throws NameMissingException, SurnameMissingException {

        if (persona.getNome().isEmpty()) {
            throw new NameMissingException();
        }
        
        if (persona.getCognome().isEmpty()) {
            throw new SurnameMissingException();
        }

        System.out.println("SALVATO SUL BD!! ");
    }

}
