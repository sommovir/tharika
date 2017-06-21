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
public class EsempioStringhe {

    public static void main(String[] args) {
        String messaggio = "Luca:Coraci:32";

        String[] partiDiMessaggio = messaggio.split(":");

        Persona p = new Persona(partiDiMessaggio[0], partiDiMessaggio[1], Integer.parseInt(partiDiMessaggio[2]));

        System.out.println("NOME: " + p.getNome());
        System.out.println("COGNOME: " + p.getCognome());
        System.out.println("AGE: " + p.getAge());

        System.out.println("messaggio = " + messaggio);
        messaggio = messaggio.replace("Coraci","Rossi");
        System.out.println("messaggio 2 = " + messaggio);
        
        String [] animali = new String[]{"Cane","Gatto","Topo"};
        for (int i = 0; i < animali.length; i++) {
            if(animali[i].startsWith("C")){
                System.out.println("HO TROVATO UN ANIMALE CHE COMINCIA CON C: "+animali[i]);
            }
        }
        
        String ciao = "ciao    bella       come                   va la vita ?                                        ";
        System.out.println("stringa non trimmata: "+ciao);
        ciao = ciao.trim();
        System.out.println("TRIMMATA: "+ciao);
    }

}
