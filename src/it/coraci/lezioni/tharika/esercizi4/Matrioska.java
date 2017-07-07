/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Matrioska {
    
    private String nome;
    private Matrioska sottomatrioska;

    public Matrioska(String nome, Matrioska sottomatrioska) {
        this.nome = nome;
        this.sottomatrioska = sottomatrioska;
    }
    
    
    public Matrioska apri(){
        return this.sottomatrioska;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    
    
}
