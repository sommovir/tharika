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
public class Coda {

    //da fare sempre
    private Nodo testa;

    //da fare sempre
    private int size = 0;

    //da fare sempre
    public Coda() {
    }

    //da fare sempre
    public int getSize() {
        return size;
    }

    public void push(Nodo nodo) {
        if (isEmpty()) {
            testa = nodo;
        } else {
            Nodo ultimo = getUltimoNodo();
            ultimo.setNext(nodo);
        }
        size++;
    }

    //da fare sempre
    public boolean isEmpty() {
        return testa == null;
//        return false;
    }

    public Nodo pop() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            Nodo popped = (Nodo) this.testa.clone();
            popped.setNext(null);
            this.testa = null;
            size = 0;
            return popped;
        } else {
            Nodo popped = (Nodo) this.testa.clone();
            popped.setNext(null);
            this.testa = this.testa.getNext();
            size--;
            return popped;
        }
    }

    public Nodo getUltimoNodo() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            return this.testa;
        } else {
            Nodo ultimo = testa.getNext();
            while (true) {
                if (ultimo.getNext() == null) {
                    return ultimo;
                } else {
                    ultimo = ultimo.getNext();
                }
            }

        }
    }

    public Nodo getUltimoNodoFor() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            return this.testa;
        } else {
            Nodo ultimo = testa.getNext();
            for (int i = 0; i < size - 2; i++) {
                ultimo = ultimo.getNext();
            }
            return ultimo;

        }
    }

    public Nodo getTesta() {
        return testa;
    }

//    public Nodo getUltimoRicorsivo(Nodo nodo) {
//        if (nodo == null) {
//            return null;
//        }
//        if (nodo.getNext() == null) { //TERMINAZIONE
//            return nodo;
//        } else {
//            getUltimoRicorsivo(nodo.getNext());
//        }
//        return null; // ERRATO 
//    }
    public Nodo getUltimoRicorsivo(Nodo nodo) {
        if (nodo == null) {
            return null;
        }
        if (nodo.getNext() == null) { //TERMINAZIONE
            return nodo;
        }
        return getUltimoRicorsivo(nodo.getNext());
    }

    public void print() {
        System.out.print("coda: (size="+this.size+") ");
        printSuccessori(testa);
    }

    private void printSuccessori(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        if (nodo.getNext() == null) {
            System.out.println("(" + nodo.getValue() + "); ");
        } else {
            System.out.print("(" + nodo.getValue() + "), ");
        }
        if (nodo.getNext() != null) {
            printSuccessori(nodo.getNext());
        }
    }

}


