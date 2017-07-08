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
public class ElencoGiocatori {

    private List<Giocatore> nordSud = new ArrayList<>(2);
    private List<Giocatore> estOvest = new ArrayList<>(2);

    public ElencoGiocatori() {
    }

    public List<Giocatore> getEstOvest() {
        return estOvest;
    }

    
    public void setEstOvest(List<Giocatore> estOvest) {
        this.estOvest = estOvest;
    }

    public List<Giocatore> getNordSud() {
        return nordSud;
    }

    public void setNordSud(List<Giocatore> nordSud) {
        this.nordSud = nordSud;
    }


}
