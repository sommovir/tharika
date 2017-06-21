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
public class Ragno extends Insetto{
    
    private boolean velenoso;

    public Ragno() {
        super(false, 8);
    }
    
    public Ragno(boolean velenoso){
        super(false, 8);
    }
    
     public Ragno(boolean velenoso, String nome){
        super(nome, velenoso, 8);
    }

    

    public boolean isVelenoso() {
        return velenoso;
    }

    public void setVelenoso(boolean velenoso) {
        this.velenoso = velenoso;
    }
    
    
  
    
    
}
