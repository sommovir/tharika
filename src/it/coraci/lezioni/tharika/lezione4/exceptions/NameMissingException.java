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
public class NameMissingException extends Exception {

    public NameMissingException() {
        super("Il nome è mancante!");
    }
}
