/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.esercizioformicaio;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Mammifero extends Animale {

    private boolean peloso;

    public Mammifero() {
    }
    
    
    public Mammifero(String nome, boolean peloso) {
        super(nome);
        this.peloso = peloso;
    }

    public boolean isPeloso() {
        return peloso;
    }

    public void setPeloso(boolean peloso) {
        this.peloso = peloso;
    }
    
    
    
    
    
}
