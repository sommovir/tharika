/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class EsercizioPersone {

    public static void main(String[] args) {
        List<Persona> persone = new LinkedList<Persona>();

        Persona luca = new Persona("Luca", "Coraci", 18);
        Persona tharika = new Persona("Tharika", "Hewa", 41);
        Persona claudio = new Persona("Claudio", "Wijee", 25);
        Persona giacomino = new Persona("Giacomo", "EriBello", 17);
        persone.add(luca);
        persone.add(tharika);
        persone.add(giacomino);
        persone.add(claudio);

        while (true) {
            String nomeDaCercare = JOptionPane.showInputDialog(null, "Inserire il nome da ricercare", "Domanda", JOptionPane.QUESTION_MESSAGE);

            boolean trovato = false;
            boolean trovatoMaMaggiorenne = false;
            for (int i = 0; i < persone.size(); i++) {
                Persona bustina = persone.get(i);

                if (bustina.getNome().toLowerCase().equals(nomeDaCercare.toLowerCase())) {
                    if (!bustina.seiMaggiorenne()) {
                        JOptionPane.showMessageDialog(null, "MI dispiace non te lo posso mostrare!", "NON è MAGGIORENNE!", JOptionPane.ERROR_MESSAGE);
                        trovatoMaMaggiorenne = true;
                    } else {
                        trovato = true;
                        JOptionPane.showMessageDialog(null, bustina.getNome() + " " + bustina.getCognome() + " è stato trovato", "Trovato", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }

            }

            if (trovato) {
                System.out.println("L'ho DROGATOOO");
            } else if (!trovatoMaMaggiorenne) {
                System.out.println("niente di niente");

                JOptionPane.showMessageDialog(null, nomeDaCercare + " Non è stato trovato ", "Mi spiace! ", JOptionPane.ERROR_MESSAGE);
            }

            System.out.println("Nome: " + nomeDaCercare);

            int risposta = JOptionPane.showConfirmDialog(null, "Vuoi continuare?", "Decidi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (risposta == JOptionPane.NO_OPTION) {
                break;
            }

        }

    }

}
