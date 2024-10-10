package libs;

public class matrizes {

    public static int[][] somar(int[][] ma, int[][] mb) {
        int[][] saida = new int[ma.length][ma[0].length];
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                saida[i][j] = ma[i][j] + mb[i][j];
            }
        }
        return saida;
    }

    public static void mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] novaIdentidade(int n) {
        int[][] id = new int[n][n];
        for (int i = 0; i < n; i++) {
            id[i][i] = 1;
        }
        return id;
    }

    public static boolean comparar(int[][] ma, int[][] mb) {
        if (ma.length != mb.length || ma[0].length != mb[0].length) {
            return false;
        }
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                if (ma[i][j] != mb[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static int[][] alocarInt(int n_linhas, int n_colunas) {
        int[][] saida = new int[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                saida[i][j] = 0;
            }
        }
        return saida;
    }

    public static boolean[][] alocarBoolean(int n_linhas, int n_colunas) {
        boolean[][] saida = new boolean[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                saida[i][j] = false;
            }
        }
        return saida;
    }

    public static float[][] alocarFloat(int n_linhas, int n_colunas) {
        float[][] saida = new float[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                saida[i][j] = 0.0f;
            }
        }
        return saida;
    }

    public static String[][] alocarString(int n_linhas, int n_colunas) {
        String[][] saida = new String[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                saida[i][j] = "";
            }
        }
        return saida;
    }

    public static float[][] preencher(float[][] ma, float n) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = n;
            }
        }
        return ma;
    }

    public static boolean[][] preencher(boolean[][] ma, boolean n) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = n;
            }
        }
        return ma;
    }

    public static int[][] preencher(int[][] ma, int n) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = n;
            }
        }
        return ma;
    }

    public static int[][] ler(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = entrada.lerInt("Digite um numero para a matriz [" + i + "][" + j + "]: ");
            }
        }
        return ma;
    }

    public static String[][] ler(String[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = entrada.lerPalavra("Digite um palavra para a matriz [" + i + "][" + j + "]: ");
            }
        }
        return ma;
    }

    public static float[][] ler(float[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = entrada.lerFloat("Digite um numero para a matriz [" + i + "][" + j + "]: ");
            }
        }
        return ma;
    }

    public static int[] getlinha(int[][] ma, int i) {
        return ma[i];
    }

    public static float[] getlinha(float[][] ma, int i) {
        return ma[i];
    }

    public static boolean[] getlinha(boolean[][] ma, int i) {
        return ma[i];
    }

    public static String[] getlinha(String[][] ma, int i) {
        return ma[i];
    }

    public static int[] getColuna(int[][] matriz, int col) {
        int linhas = matriz.length;
        int[] coluna = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            coluna[i] = matriz[i][col];
        }
        return coluna;
    }

    public static float[] getColuna(float[][] matriz, int col) {
        int linhas = matriz.length;
        float[] coluna = new float[linhas];
        for (int i = 0; i < linhas; i++) {
            coluna[i] = matriz[i][col];
        }
        return coluna;
    }

    public static boolean[] getColuna(boolean[][] matriz, int col) {
        int linhas = matriz.length;
        boolean[] coluna = new boolean[linhas];
        for (int i = 0; i < linhas; i++) {
            coluna[i] = matriz[i][col];
        }
        return coluna;
    }

    public static String[] getColuna(String[][] matriz, int col) {
        int linhas = matriz.length;
        String[] coluna = new String[linhas];
        for (int i = 0; i < linhas; i++) {
            coluna[i] = matriz[i][col];
        }
        return coluna;
    }
    public static int[][] multiplicar(int[][] ma, int[][] mb){
        int n = ma.length;
        int m = ma[0].length;
        int p = mb[0].length;
        int q = mb.length;
        if (n != p){
            return null;
        }
        if (m != q){
            return null;
        }
        int[][] saida = new int[n][p];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                for(int k = 0; k < m; k++){
                    saida[i][j] += ma[i][k] * mb[k][j];
                }
            }
        }
        return saida;
    }

}