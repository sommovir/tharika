/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi.immigrati;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Immigrati extends Persona {
    private boolean war;

    public Immigrati() {
    }

    public Immigrati(boolean war) {
        this.war = war;
    }

    public Immigrati(boolean war, String nome, String cognome) {
        super(nome, cognome);
        this.war = war;
    }

    public boolean isWar() {
        return war;
    }

    public void setWar(boolean war) {
        this.war = war;
    }
    
    
}
