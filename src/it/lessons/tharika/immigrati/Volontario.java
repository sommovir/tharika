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
public class Volontario extends Persona {
    private String associazione;

    public Volontario() {
    }

    public Volontario(String associazione) {
        this.associazione = associazione;
    }

    public Volontario(String associazione, String nome, String cognome) {
        super(nome, cognome);
        this.associazione = associazione;
    }

    public String getAssociazione() {
        return associazione;
    }

    public void setAssociazione(String associazione) {
        this.associazione = associazione;
    }
    
    
}
