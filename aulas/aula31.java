package aulas;

import java.io.File;
import java.util.Scanner;

public class aula31 {
    public static void aula() {
        System.out.println("Aula do dia 31/09: Arquivos");
        System.out.println("============================");
        ex01();// Ler e calcular media

    }

    public static void ex01() {

        String nome_arquivo = "./arquivos/valores.txt";
        int valorTotal = 0;
        double media;
        try {
            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            for (int i = 0; i < 10; i++) {
                valorTotal += entrada.nextInt();
             
            }
            entrada.close();
            media = valorTotal / 10;
            System.out.println(media);

        } catch (Exception e) {
            System.err.println("Erro. ");
            System.err.println(e);

        }

    }
}
