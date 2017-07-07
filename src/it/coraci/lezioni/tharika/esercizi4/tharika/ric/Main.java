/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4.tharika.ric;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static void mostraSchiavo(Padrone p) {
        if (p == null) {
            return;
        }
        System.out.print("il nome del padrone è " + p.getNome());
        
        
        Padrone schiavo = p.getSchiavo();
        
        
        if(schiavo != null){
            System.out.println(" che ha come schiavo " + schiavo.getNome());
            mostraSchiavo(schiavo);
        }else{
            System.out.println(" che poretta non ha manco uno schiavo");
        }
    }

    public static void main(String[] args) {

        Padrone p1 = new Padrone("Tharika", null);
        Padrone p2 = new Padrone("Maurizio", p1);
        Padrone p3 = new Padrone("Mauro", p2);
        Padrone p4 = new Padrone("Luca", p3);
        
        mostraSchiavo(p4);
        
        
    }
}
