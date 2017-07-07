/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4.tharika.ric.esercizioProf;

/**
 * 
 
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Antenato {
    private String nome;
    private int eta;
    private Antenato padre;

    public Antenato() {
    }

    public Antenato(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public Antenato(String nome, int eta, Antenato padre) {
        this.nome = nome;
        this.eta = eta;
        this.padre = padre;
    }
    
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public Antenato getPadre() {
        return padre;
    }
    
    
    
}
