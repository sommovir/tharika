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
public class ForzaOrdine extends Persona {
    
    private int stipendio;

    public ForzaOrdine() {
    }

    public ForzaOrdine(int stipendio) {
        this.stipendio = stipendio;
    }

    public ForzaOrdine(int stipendio, String nome, String cognome) {
        super(nome, cognome);
        this.stipendio = stipendio;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    
}
