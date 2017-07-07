/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi3;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class Main {

    public static boolean isQuadrata(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m.length != m[i].length) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean contieneAlmenoUnoZero(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contieneTuttiPari(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] % 2 == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean tuttiNegativi(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] > 0) {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean almenoUnNegativo(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] < 0) {
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean almenoUnMinoreDiK(int[][] m, int k) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean almenoUnTre(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == 3) {
                    return true;
                }

            }

        }

        return false;
    }

    public static boolean almenoUnK(int[][] m, int k) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == k) {
                    return true;
                }

            }

        }

        return false;
    }

    /**
     *
     * @param m
     * @param k
     * @return -1 se non trova k nella matrice, viceversa ritorna l'indice della
     * riga dove sta il primo k trovato
     */
    public static int rigaDiK(int[][] m, int k) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     *
     * @param m
     * @return ritorna il primo valore positivo che incontra nella matrice, se
     * non c'è ritorna -1001
     */
    public static int esistePositivo(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] > 0) {
                    return m[i][j];
                }
            }
        }
        return -1001;
    }

    /**
     *
     * @param m
     * @return ritorna -1 se non trova neanche un paro, viceversa il numero
     * degli elementi pari della matrice
     */
    public static int contaPari(int m[][]) {

        int count = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return -1;
        } else {
            return count;
        }
    }

    /**
     *
     * @param m
     * @return ritorna la somma degli elementi della diagonale maggiori di zero.
     * Se nessun elemento della diagonale è maggiore di zero, ritorna -1
     */
    public static int sommaDiagonale(int[][] m) {

        int sommatoria = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sommatoria++;
                }
            }
        }
        if (sommatoria > 0) {
            return sommatoria;
        } else {
            return -1;
        }
    }

    public static int contaQuadrata(int[][] m) {
        return m.length * m.length;

    }

    public static int contaGenerica(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            count += m[i].length;
        }
        return count;
    }

    public static int sommatoria(int[][] m) {
        int sommatoria = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                sommatoria = sommatoria + m[i][j];

            }
        }
        return sommatoria;
    }

    public static float superMedia(int[][] m) {
        int sommatoria = 0;
        int count = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                sommatoria = sommatoria + m[i][j];
                count++;
            }
        }
        return sommatoria/count;
    }

    public static float media(int[][] m) {
        float media = 0;
        media = sommatoria(m) / contaQuadrata(m);
        return media;
    }

    /**
     *
     * @param m
     * @return restituisce in un array tutti i valori della diagonale m
     */
    public static int[] getDiagonale(int[][] m) {

        int[] array = new int[m.length];

        for (int k = 0; k < m.length; k++) {
            array[k] = m[k][k];
        }
        return array;

    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 0, 3},
            {-1, 2, 7},
            {0, 5, 4}
        };

    }

}
