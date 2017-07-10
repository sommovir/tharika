/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lessons.tharika.ricorsione;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static void main(String[] args) {
        Coda coda = new Coda();
        
        boolean empty = coda.isEmpty();
        
        System.out.println("Lista vuota ? "+empty);
        
        assert empty;
        assert coda.getSize()==0;
        System.out.println("Inizializzazione Coda [OK]");
        
        coda.push(new Nodo(1, null));
        
        assert !coda.isEmpty();
        assert coda.getSize() == 1;
        
        System.out.println("Inserimento primo elemento [OK]");

        coda.print();
        
        coda.push(new Nodo(2, null));
        coda.push(new Nodo(3, null));
        coda.push(new Nodo(4, null));
        
        assert coda.getSize() == 4;
        System.out.println("");
        coda.print();
        
        Nodo pop = coda.pop();
        
        assert pop.getValue() == 1;
        assert coda.getSize() == 3;
        
        System.out.println("Il primo della coda è "+pop.getValue());
        coda.print();
        
        coda.pop();
        coda.pop();
        Nodo pop2 = coda.pop();
        
        assert pop2.getValue() == 4;
        assert coda.getSize() == 0;
        
        System.out.println("svuotamento lista [OK]");
    }

}
