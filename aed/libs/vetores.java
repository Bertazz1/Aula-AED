package libs;

public class vetores {
    public static int[] alocarInteiros(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        return vetor;
    }

    public static float[] alocarReais(int n) {
        float[] vetor = new float[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        return vetor;
    }

    public static boolean[] alocarLogicos(int n) {
        boolean[] vetor = new boolean[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = false;
        }
        return vetor;
    }

    public static char[] alocarCaracteres(int n) {
        char[] vetor = new char[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = '\0';
        }
        return vetor;
    }

    
}
