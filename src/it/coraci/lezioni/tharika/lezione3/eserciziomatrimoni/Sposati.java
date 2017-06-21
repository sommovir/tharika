/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.eserciziomatrimoni;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Sposati {
    
    private Persona marito;
    private Persona moglie;

    public Sposati() {
    }

    public Sposati(Persona marito, Persona moglie) {
        this.marito = marito;
        this.moglie = moglie;
    }

    public Persona getMarito() {
        return marito;
    }

    public void setMarito(Persona marito) {
        this.marito = marito;
    }

    public Persona getMoglie() {
        return moglie;
    }

    public void setMoglie(Persona moglie) {
        this.moglie = moglie;
    }
    
    
    
}
