package libs;

public class saida {
    public static void mostrarVetor(int [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarVetor(boolean [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarVetor(float [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarVetor(char [] vetor, char separador){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] +""+ separador);
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }
}

