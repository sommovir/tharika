/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi5.EsercProf;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Tavolo {
    private int idTavolo;
    private boolean disponibile;
    private ElencoGiocatori lista;

    public Tavolo() {
    }

    public Tavolo(int idTavolo, boolean disponibile, ElencoGiocatori lista) {
        this.idTavolo = idTavolo;
        this.disponibile = disponibile;
        this.lista = lista;
    }

    public int getIdTavolo() {
        return idTavolo;
    }

    public void setIdTavolo(int idTavolo) {
        this.idTavolo = idTavolo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public ElencoGiocatori getLista() {
        return lista;
    }

    public void setLista(ElencoGiocatori lista) {
        this.lista = lista;
    }
    
    
    
    
}
