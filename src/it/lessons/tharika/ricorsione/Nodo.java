/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.tharika.ricorsione;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Nodo {
    
    private int value;
    private Nodo next;

    public Nodo() {
    }

    public Nodo(int value, Nodo next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    protected Object clone()  {
        Nodo clone = new Nodo();
        clone.setNext(this.next);
        clone.setValue(this.value);
        return clone;
    }
    
    
    
    
}
