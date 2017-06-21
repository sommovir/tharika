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
public class Insetto extends Animale{

    private boolean volante;
    private int numZampe;
    
    public Insetto() {

    }

    public Insetto(boolean volante, int numZampe) {
        this.volante = volante;
        this.numZampe = numZampe;
    }
    
    public Insetto(String nome, boolean volante, int numZampe) {
        super(nome);
        this.volante = volante;
        this.numZampe = numZampe;
    }

    
    

    public boolean isVolante() {
        return volante;
    }

    public void setVolante(boolean volante) {
        this.volante = volante;
    }

    public int getNumZampe() {
        return numZampe;
    }

    public void setNumZampe(int numZampe) {
        this.numZampe = numZampe;
    }
    
    
    
    
    
    
    
}
