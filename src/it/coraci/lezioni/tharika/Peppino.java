/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Peppino {
    
    private String nome;
    private String cognome;
    private int age;
    private String codice;
    
    public static void main(String[] args) {
     
        List<Integer> numeriNegativi = new ArrayList<>();
        List<Integer> numeriDispari = new ArrayList<>();
        
        Integer[] numeri = new Integer[]{2,3,-1,4,12,-8};
        
        for (int i = 0; i < numeri.length; i++) {
            if(numeri[i]<0){
                numeriNegativi.add(numeri[i]);
            }if(Math.abs(numeri[i]%2)==1){
                numeriDispari.add(numeri[i]);
            }
        }
        
        for (Integer integer : numeriDispari) {
            System.out.println("DISPARI = "+integer);
        }
        for (Integer integer : numeriNegativi) {
            System.out.println("NEGATIVO = "+integer);
        }
    }

    public Peppino() {
    }

    public Peppino(String nome, String cognome, int age, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
    
    
    
    
}
