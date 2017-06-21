/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static void main(String[] args) {

        int array[] = {2, 4, 9, 5, 3, 200, 11, 44, 12, 74, 1};

        List<Integer> pari = new ArrayList<>();
        List<Integer> dispari = new ArrayList<>();

        //ESERCIZIO 1
        //Classificare array in 2 sotto liste, pari e dispari
        /*   for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x % 2 == 0) {
                pari.add(x);
            } else {
                dispari.add(x);
            }
        } */
        for (Integer x : pari) {
            System.out.println("int pari: " + x);
        }
        for (Integer x : dispari) {
            System.out.println("int dispari: " + x);
        }

        //ESERCIZIO 2
        //Calcolare la sommatoria di tutti gli elementi di array
        int sommatoria = 0;

        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            sommatoria = sommatoria + array[i];

        }

        System.out.println(sommatoria);

        //ESERCIZIO 3
        //Restituire l'indice dell'array del numero 44
        for (int i = 0; i < array.length; i++) {
            int x = array[i];

            if (x == 200) {
                System.out.println("Bravo! la  posizione è : " + i);
            }

        }

        int peste[] = {2, 9, 5, 3, 200, 4, 11, 44, 12, 74, 1};
        int malaria[] = {54, -12, 37, 0, 4, 200, 8, 1201};
        List<Integer> joinList = new ArrayList<>();

        /* boolean rompiCiclo = false;

        //ESERCIZIO 4
        //Trovare il primo elemento in comune tra le due liste peste e malaria
        for (int i = 0; i < peste.length; i++) {
            
            if(rompiCiclo){
                break;
            }
            for (int j = 0; j < malaria.length; j++) {
                int x = peste[i];
                int y = malaria[j];

                if (x == y) {
                    System.out.println("il numero uguale è : " + x);
                    rompiCiclo = true;
                    break;
                }
            }
        }*/
        boolean rompiCiclo = false;
        int elementoUguale = -1;

        for (int i = 0; i < peste.length; i++) {

            if (rompiCiclo) {
                break;
            }
            for (int j = 0; j < malaria.length; j++) {
                int x = peste[i];
                int y = malaria[j];

                if (x == y) {

                    System.out.println("il numero uguale è : " + x);
                    elementoUguale = x;
                    rompiCiclo = true;
                    break;
                }
            }
        }

        for (int i = 0; i < peste.length; i++) {
            if (peste[i] == elementoUguale) {
                break;
            }else{
                joinList.add(peste[i]);
            }

        }
        for (int j = 0; j < malaria.length; j++) {
            if (malaria[j] == elementoUguale) {
                break;
            }else{
                joinList.add(malaria[j]);
            }

        }

        System.out.println(joinList);

        //ESERCIZIO 5
        //Immettere nella lista joinList tutti i valori della prima lista e della seconda lista fino al primo elemento in comune che hanno.
    }
}
