/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.lezione3.example;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TestTharika {
    
    public static void main(String[] args) {
        String[] settimana = new String[]{"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};
        String[] settimanaSrilankese = new String[]{"Sandhudha", "Angaharuwadha", "Badhadha", "Braspathindha", "Sikuradha", "Senesuradha", "Iridha"};
        
        while (true) {
            
            String text = JOptionPane.showInputDialog(null, "Inserisci un  numero da 1 a 7", "MESSAGGIO", JOptionPane.QUESTION_MESSAGE);
            System.out.println(text);
            
            try {
                int numerino = Integer.parseInt(text);
                if (numerino >= 0 && numerino <= 6) {
                    JOptionPane.showMessageDialog(null, "" + numerino + "=" + settimana[numerino - 1], "MESSAGGIO", JOptionPane.INFORMATION_MESSAGE);
                    int risposta = JOptionPane.showConfirmDialog(null, "VUOI SAPERE COME SI DICE" + settimana[numerino - 1] + "IN SRILANKESE?", "Domanda:", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (risposta == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, settimana[numerino - 1] + " si dice " + settimanaSrilankese[numerino - 1], "ecco la risposta!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "mi dispiace devi studiare!", ":(", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    int risposta1 = JOptionPane.showConfirmDialog(null, "Vuoi continuare?", "Attenzione", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                    if (risposta1 == JOptionPane.NO_OPTION){
                        break;
                    }
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "NON è COMPRESO TRA 0 E 6!", "ERRORE", JOptionPane.ERROR_MESSAGE);
                    
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hai inserito una lettera/parola!!", "errore!!!", JOptionPane.ERROR_MESSAGE);
//                ex.printStackTrace();
            }
            
        }
    }
}
