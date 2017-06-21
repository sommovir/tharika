/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione4.exceptions;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class SurnameMissingException  extends Exception{

    public SurnameMissingException() {
        super("Il cognome è mancante");
    }
    
    
    
}
