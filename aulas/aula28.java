package aulas;

import libs.matrizes;
import libs.saida;

public class aula28 {
    public static void aula() {
       saida.mostrarMatriz(exercicio2());

    }

    public static int[][] exercicio2() {
        return matrizes.novaIdentidade(5);
    }
}
