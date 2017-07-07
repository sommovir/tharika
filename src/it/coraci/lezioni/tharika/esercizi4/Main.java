/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static void main(String[] args) {

        Matrioska m8 = new Matrioska("m8", null);
        Matrioska m7 = new Matrioska("m7", m8);
        Matrioska m6 = new Matrioska("m6", m7);
        Matrioska m5 = new Matrioska("m5", m6);
        Matrioska m4 = new Matrioska("m4", m5);
        Matrioska m3 = new Matrioska("m3", m4);
        Matrioska m2 = new Matrioska("m2", m3);
        Matrioska m1 = new Matrioska("m1", m2);

        System.out.println("ciao ora apro m1");

        apriMatrioske(m1);
        
        System.out.println("=================================");
        
        int array [] = {1,2,3,4,5,6,7};
        
        scorriArray(array, 0);
        
        List<String> settimana = new ArrayList<String>();
        settimana.add("Lun");
        settimana.add("Mar");
        settimana.add("Mer");
        settimana.add("Gio");
        settimana.add("Ven");
        settimana.add("Sab");
        settimana.add("Dom");
        
        scorriLista(settimana, 0);
        
        System.out.println("============================");
        
        int somma = calcolaSommatoria(array, 0);
        System.out.println("SOMMATORIA = "+somma);
//        calcolaSommatoria(array, 0);
        
    }
    
    
    public static int calcolaSommatoria(int [] array,int i){
    
        if (array == null){
        return 0;
        }
        
        if (i<0 || i>= array.length){
        return 0;
        }
        
        System.out.println("il numero è " + array[i]);

        return array[i] + calcolaSommatoria(array, i+1);
    
    }
    
    
    
    public static void scorriLista(List<String> settimana, int i){
        if(settimana == null){
            return;
        }
        if(i<0 || i>=settimana.size()){
            return;
        }
        System.out.println("oggi è " + settimana.get(i) );
        
        scorriLista(settimana, i+1);
    }
    
    public static void scorriArray(int [] array, int i){
        if(array == null){
            return;
        }
        if(i < 0 || i >=array.length){
            return;
        }
        
        System.out.println("Elemento: "+array[i]);
        
        scorriArray(array, i+1);
        
    }

    public static void apriMatrioske(Matrioska m) {
        if (m == null) {
            return;
        }
        System.out.println("Sto visitando matrioska: " + m.getNome());

        Matrioska sottoMatrioska = m.apri();
        if (sottoMatrioska != null) {
            apriMatrioske(sottoMatrioska);
        }
    }

}
