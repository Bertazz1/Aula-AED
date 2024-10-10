package trabalhos;

public class T3 {
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

    public static int[] uniao(int[] vetor1, int[] vetor2) {
        int tamanhoMaximo = vetor1.length + vetor2.length;
        int[] resultado = new int[tamanhoMaximo];
        int contador = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (!contem(resultado, contador, vetor1[i])) {
                resultado[contador] = vetor1[i];
                contador++;
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            if (!contem(resultado, contador, vetor2[i])) {
                resultado[contador] = vetor2[i];
                contador++;
            }
        }

        int[] vetorUniao = new int[contador];
        for (int i = 0; i < contador; i++) {
            vetorUniao[i] = resultado[i];
        }

        return vetorUniao;
    }

    public static boolean contem(int[] vetor, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] intersecaoComConcatenacao(int[] vetor1, int[] vetor2) {
        if (vetor1.length == 0 || vetor2.length == 0) {
            return new int[0];
        }

        int[] temporario = new int[vetor1.length + vetor2.length];
        int contador = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (contem(vetor2, vetor1[i])) {
                temporario[contador] = vetor1[i];
                contador++;
            }
        }

        int[] intersecao = new int[contador];
        for (int i = 0; i < contador; i++) {
            intersecao[i] = temporario[i];
        }

        return removerDuplicados(intersecao);
    }

    public static boolean contem(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static int[] removerDuplicados(int[] vetor) {
        int[] temporario = new int[vetor.length];
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (!contem(temporario, vetor[i], contador)) {
                temporario[contador] = vetor[i];
                contador++;
            }
        }

        int[] resultadoFinal = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultadoFinal[i] = temporario[i];
        }

        return resultadoFinal;
    }

    public static int[] diferenca(int[] vetorA, int[] vetorB) {
        int[] temporario = new int[vetorA.length];
        int contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (!contem(vetorB, vetorA[i])) {
                temporario[contador] = vetorA[i];
                contador++;
            }
        }

        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = temporario[i];
        }

        return resultado;
    }

    public static int[][] trianguloDePascal(int n) {
        int[][] matriz = new int[n][];

        for (int i = 0; i < n; i++) {
            matriz[i] = new int[i + 1];

            matriz[i][0] = 1;
            matriz[i][i] = 1;

            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }

        return matriz;
    }

    public static int[][] matrizTranspor(int[][] matrizA) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matrizA[i][j];
            }
        }

        return transposta;
    }

    public static int[][] matrizPermutacaoLinhas(int[][] matriz, int linha1, int linha2) {

        int[] temp = matriz[linha1];
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;

        return matriz;
    }

    public static int[][] matrizMultint(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int m = matrizA[0].length;
        int p = matrizB[0].length;
        int q = matrizB.length;
        if (n != p) {
            return new int[0][0];
        }
        if (m != q)

        {
            return new int[0][0];
        }
        int[][] saida = new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < m; k++) {
                    saida[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return saida;
    }
}