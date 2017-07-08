/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi5.EsercProf;

import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Film {

    private String regista;
    private String[] attori;
    private int durataMinuti;
    private String titolo;
    private int anno;

    public Film() {
    }

    public Film(String[] attori, String titolo, int anno) {
        this.attori = attori;
        this.titolo = titolo;
        this.anno = anno;
    }

    public Film(String[] attori, String titolo, int anno, int durataMinuti) {
        this.attori = attori;
        this.durataMinuti = durataMinuti;
        this.titolo = titolo;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return titolo + " " + anno;

    }

    public boolean nessunAttoreInComune(Film f) {
        for (int i = 0; i < attori.length; i++) {

            for (int j = 0; j < f.attori.length; j++) {

                if (attori[i].equals(f.attori[j])) {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean durataMaggiore(Film f) {
        if (this.durataMinuti > f.durataMinuti) {
            return true;
        } else {
            return false;
        }
    }

}
