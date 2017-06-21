/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Persona {

    private String nome;
    private String cognome;
    private int age;

    public Persona() {
    }

    public Persona(String nome, String cognome, int age) {
        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
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

    public boolean seiMaggiorenne() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
