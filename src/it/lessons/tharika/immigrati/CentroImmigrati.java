/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.tharika.immigrati;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class CentroImmigrati {

    private String nomeCentro;
    private List<Persona> persone = new ArrayList<>();

    public CentroImmigrati() {
    }

    public CentroImmigrati(String nomeCentro) {
        this.nomeCentro = nomeCentro;
    }

    public String getNomeCentro() {
        return nomeCentro;
    }

    public void setNomeCentro(String nomeCentro) {
        this.nomeCentro = nomeCentro;
    }

    public List<Persona> getPersone() {
        return persone;
    }

//    public void setPersone(List<Persona> persone) {
//        this.persone = persone;
//    }
    public void addPersona(Persona persona) {
        if (persona == null) {
            throw new NullPointerException("NON MI MANDARE OGGETTI NULLI");
        }
        this.persone.add(persona); // evito da fuori di tirare fuori il get.Persone e poi aggiungere add nel MAIN

    }

}
