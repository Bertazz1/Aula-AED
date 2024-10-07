package trabalhos;

import libs.vetores;

public class T {
    public static void mostrarInteiros(int[] vetor, char separador) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "" + separador);
        }
    }

    public static int[] filtrarMaiores(int[] vetor, int valor) {

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                contador++;
            }
        }
        int[] maiores = new int[contador];
        int indice = 0;

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > valor) {
                maiores[indice] = vetor[j];
                indice++;
            }
        }

        return maiores;
    }

    public static int[] filtrarMenores(int[] vetor, int valor) {

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < valor) {
                contador++;
            }
        }
        int[] menores = new int[contador];
        int indice = 0;

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] < valor) {
                menores[indice] = vetor[j];
                indice++;
            }
        }
        return menores;
    }


    public boolean[] aplicarELogico(boolean[] vetor1, boolean[] vetor2) {
        boolean[] elogico = new boolean[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            elogico[i] = vetor1[i] && vetor2[i];
        }
        return elogico;
    }


    public boolean[] aplicarOuLogico(boolean[] vetor1, boolean[] vetor2) {
        boolean[] oulogico = new boolean[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            oulogico[i] = vetor1[i] || vetor2[i];
        }
        return oulogico;
    }
    

    public int[] aplicarMascara(int[] vetor, boolean[] mascara) {
        int contador = 0;
        for (int i = 0; i < mascara.length; i++) {
            if (mascara[i]) {
                contador++;
            }
        }
        int[] retorno = new int[contador];
        int indice = 0;

        for (int j = 0; j < vetor.length; j++) {
            if (mascara[j]) {
                retorno[indice] = vetor[j];
                indice++;
            }
        }
        return retorno;
    }

}