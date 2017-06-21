/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.example;

/**
 *
 * @author user
 */
public class Persona {
    
    private String nome;

    public Persona() {
    }

    public Persona(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static void stampaCose(){
        System.out.println("ma quante coseee");
        System.out.println("ciao belli");
    }
}
