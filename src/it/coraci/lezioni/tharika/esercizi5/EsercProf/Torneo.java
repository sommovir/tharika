/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi5.EsercProf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Torneo {

    private List<Tavolo> tavoli = new ArrayList<>();
    private String name;

    public Torneo() {
    }

    public Torneo(String name) {
        this.name = name;
    }

    public boolean tavoloDisponibile(int numero) {
        for (int i = 0; i < tavoli.size(); i++) {
            Tavolo t = tavoli.get(i);
            if (t.getIdTavolo() == numero) {
                return t.isDisponibile();
            }

        }
        return false;
    }

    private Tavolo findTavolo(int idTavolo) throws Exception {

        for (int i = 0; i < tavoli.size(); i++) {
            Tavolo t = tavoli.get(i);
            if (t.getIdTavolo() == idTavolo) {
                return t;
            }

        }
        throw new Exception("Id non trovato");

    }

    public void aggiungiGiocatore(int tavolo, Giocatore g) throws Exception {

        Tavolo tavoloTrovato = findTavolo(tavolo);
        
        if(!tavoloTrovato.isDisponibile()){
            throw new Exception("Tavolo già completo!");
        }
       
        List<Giocatore> nordSud = tavoloTrovato.getLista().getNordSud();
        List<Giocatore> estOvest = tavoloTrovato.getLista().getEstOvest();
        if(nordSud.size() < 2){
            nordSud.add(g);
        }else{
            estOvest.add(g);
            if(estOvest.size() == 2){
                tavoloTrovato.setDisponibile(false);
            }
        }

    }

    public List<Tavolo> getTavoli() {
        return tavoli;
    }

    public void setTavoli(List<Tavolo> tavoli) {
        this.tavoli = tavoli;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
