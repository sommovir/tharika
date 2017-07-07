/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4.tharika.ric.esercizioProf;

/**
 *
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Classe {

    public static int calcolaMaggioridiX(int[] array, int x) {

        return aux(array, x, 0);

    }

    private static int aux(int[] array, int x, int i) {

        if (array == null) {
            return 0;
        }
        if (i < 0 || i >= array.length) {
            return 0;
        }

        if (array[i] > x) {
            return 1 + aux(array, x, i + 1);
        } else {
            return aux(array, x, i + 1);
        }

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        int calcolo = calcolaMaggioridiX(array, 4);

        System.out.println("ci sono :  " + calcolo + " numeri ");
    }
}
