/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4.tharika.ric;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Padrone {
    private String nome;
    private Padrone schiavo;

    public Padrone() {
    }

    
    public Padrone(String nome, Padrone schiavo) {
        this.nome = nome;
        this.schiavo = schiavo;
    }

    public String getNome() {
        return nome;
    }

    public Padrone getSchiavo() {
        return schiavo;
    }
    
    
    
    
}
