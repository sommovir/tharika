/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.coraci.lezioni.tharika.esercizi5;

/**
 *
 * public static boolean almenoUnoZero(int [][] matrix)
 *
 * public static boolean tuttiPositivi(int [][] matrix)
 *
 * public static int trovaNumMax(int [][] matrix)
 *
 * public static int trovaRigaConPiuNumeriAdiacenti(int [][] matrix)
 *
 * public static int trovaRigaConSommaValoriPiuAlta(int [][] matrix)
 *
 * public static boolean contieneX(int [][] matrix, int x)
 *
 * public static boolean trovaColonnaConPiuZeri(int [][] matrix)
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it>
 */
public class ES5 {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(" " + matrix[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static boolean almenoUnoZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean tuttiPositivi(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int trovaNumMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    public static int trovaNumMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    public static int trovaRigaConPiuCoppieUgualiAdiacenti(int[][] matrix) {
        int coppie = 0;
        int riga = 0;

        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    m++;
                }
            }
            if (m > coppie) {
                coppie = m;
                riga = i;
            }

        }

        return riga;

    }

    public static int trovaRigaConSommaValoriPiuAlta(int[][] matrix) {

        int somma = 0;
        int riga = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sommaRiga = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sommaRiga = sommaRiga + matrix[i][j];
            }
            if (sommaRiga > somma) {
                somma = sommaRiga;
                riga = i;
            }
        }
        return riga;
    }

    public static int trovaRigaConPiuNumeriNegativi(int[][] matrix) {

        int negativi = 0;
        int riga = 0;

        for (int i = 0; i < matrix.length; i++) {
            int piuNegativi = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    piuNegativi++;
                }

                if (piuNegativi > negativi) {
                    negativi = piuNegativi;
                    riga = i;
                }
            }
        }
        return riga;
    }

    public static boolean contieneX(int[][] matrix, int x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[][] trasposta(int[][] matrix) {
        int[][] matrix1 = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix1[i][j] = matrix[j][i];

            }
        }
        return matrix1;
    }

    //restituisce l'indice della RIGA che contiene vector. Se non contiene vector, la funzione restituisce -1
    public int containsVector(int[][] matrix, int[] vector) {

        int riga = -1;

        for (int i = 0; i < matrix.length; i++) {

            boolean rigaDiversa = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != vector[j]) {
                    rigaDiversa = true;
                    break;
                }

            }
            if (!rigaDiversa) {
                riga = i;
            }

        }
        return riga;
    }

    //restituisce true se la matrice è diagonale, false viceversa. Una matrice è diagonale se ogni elemento alla posizione i,j è uguale a ogni elemento in posizione j,i
    public boolean isMatriceDiagonale(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] !=  matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //restituisce -1 se la matrice è vuota. Viceversa restituisce l'indice della riga che contiene il valore più alto della matrice.
    public int getRigaConValorePiuAlto(int[][] matrix) {
        int valore = Integer.MIN_VALUE;
        int riga = 0;

        if (matrix.length == 0) {
            return -1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > valore) {
                    valore = matrix[i][j];
                    riga = i;
                }

            }
        }
        return riga;

    }

    public static int trovaColonnaConPiuZeri(int[][] matrix) {
        int zeri = 0;
        int colonna = 0;

        for (int i = 0; i < matrix.length; i++) {
            int piuZeri = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 0) {
                    piuZeri++;
                }
                if (piuZeri > zeri) {
                    zeri = piuZeri;
                    colonna = i;
                }

            }
        }
        return colonna;
    }

    public static void main(String[] args) {
        int[][] matrix = {{6, 6, -4, 0}, {-5, -7, 80, 0}, {5, 0, 1, 0}, {10, 1, -1, -2}};

        System.out.println("MATRICE ORIGINALE: ");
        printMatrix(matrix);
        System.out.println("PRIMO ESERCIZIO:");
        boolean q = almenoUnoZero(matrix);

        System.out.println("" + q);

        System.out.println("SECONDO ESERCIZIO:");

        boolean a = tuttiPositivi(matrix);
        System.out.println("" + a);

        System.out.println("TERZO ESERCIZIO:");
        int s = trovaNumMax(matrix);
        System.out.println("" + s);

        System.out.println("QUARTO ESERCIZIO:");
        int c = trovaNumMin(matrix);
        System.out.println("" + c);

        System.out.println("QUINTO ESERCIZIO:");
        int p = trovaRigaConPiuCoppieUgualiAdiacenti(matrix);
        System.out.println("" + p);

        System.out.println("SESTO ESERCIZIO:");
        int g = trovaRigaConSommaValoriPiuAlta(matrix);
        System.out.println("" + g);

        System.out.println("SETTIMO ESERCIZIO:");
        int l = trovaRigaConPiuNumeriNegativi(matrix);
        System.out.println("" + l);

        System.out.println("OTTAVO ESERCIZIO:");
        int b = trovaColonnaConPiuZeri(matrix);
        System.out.println("" + b);

    }

}
