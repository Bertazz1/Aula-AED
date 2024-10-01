package aulas;

import libs.matrizes;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

public class aula30 {
    public static void aula() {
        System.out.println("Aula do dia 30/09: Arquivos");
        System.out.println("============================");
        ex01();//Ler e calcular media
        // // ex02();//Lendo numeros dentro do arquivo

    }

    public static void ex01() {
     
            String cachorro = "  _/ \\__\n" +
                             "  (     @\\___\n" +
                             "  /         O\n" +
                             " /   |_____/\n" +
                             "/_____/   U\n";
    
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("./arquivos/cachorro.txt"))) {
                writer.write(cachorro);
                System.out.println("Desenho do cachorro salvo em cachorro.txt");
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }
    
    

    


    public static void ex02() {

        String nome_arquivo = "numeros.txt";

        try {
            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            int valor = entrada.nextInt();
            System.out.println(valor);

            valor = entrada.nextInt();
            System.out.println(valor);

            entrada.close();

        } catch (Exception e) {
            System.err.println("Erro. ");
            System.err.println(e);

        }

    }
}
