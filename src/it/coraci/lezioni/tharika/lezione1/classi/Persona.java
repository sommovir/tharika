/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione1.classi;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Persona {
    private String nome;
    private String cognome;
    private int age;
    private boolean gender;

    public Persona() {
    }

    public Persona(String nome, String cognome, int age, boolean gender) {
        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof Persona){
            if(this.nome.equals(((Persona)obj).nome) && this.cognome.equals(((Persona)obj).cognome)){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
    
  
    
}
