package libs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class arquivos {
    public static void criarArquivo(String nome) {
        File arquivo = new File(nome);
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }
 public static void escreverNoArquivo(String nome, String conteudo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nome, true))) {
            writer.write(conteudo);
            writer.newLine(); // Adiciona uma nova linha
            System.out.println("Conteúdo adicionado ao arquivo: " + conteudo);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }

    public static void lerArquivo(String nome) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nome))) {
            String linha;
            System.out.println("Conteúdo do arquivo:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }

    public static void verificarArquivo(String nome) {
        File arquivo = new File(nome);
        if (arquivo.exists()) {
            System.out.println("O arquivo existe.");
        } else {
            System.out.println("O arquivo não existe.");
        }
    }

    public static void exibirInformacoesArquivo(String nome) {
        File arquivo = new File(nome);
        if (arquivo.exists()) {
            System.out.println("Nome: " + arquivo.getName());
            System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
            System.out.println("Pode ser lido: " + arquivo.canRead());
            System.out.println("Pode ser escrito: " + arquivo.canWrite());
            System.out.println("Tamanho em bytes: " + arquivo.length());
        } else {
            System.out.println("O arquivo não existe.");
        }
    }

    public static void criarDiretorio(String nome) {
        File diretorio = new File(nome);
        if (diretorio.mkdir()) {
            System.out.println("Diretório criado: " + diretorio.getName());
        } else {
            System.out.println("Diretório já existe ou não pôde ser criado.");
        }
    }

    public static void listarArquivos(String nomeDiretorio) {
        File diretorio = new File(nomeDiretorio);
        if (diretorio.isDirectory()) {
            String[] lista = diretorio.list();
            System.out.println("Arquivos no diretório:");
            for (String nomeArquivo : lista) {
                System.out.println(nomeArquivo);
            }
        } else {
            System.out.println("O caminho especificado não é um diretório.");
        }
    }

    public static void renomearArquivo(String nomeAntigo, String nomeNovo) {
        File arquivoAntigo = new File(nomeAntigo);
        File arquivoNovo = new File(nomeNovo);
        if (arquivoAntigo.renameTo(arquivoNovo)) {
            System.out.println("Arquivo renomeado para: " + arquivoNovo.getName());
        } else {
            System.out.println("Falha ao renomear o arquivo.");
        }
    }

    public static void excluirArquivo(String nome) {
        File arquivo = new File(nome);
        if (arquivo.delete()) {
            System.out.println("Arquivo excluído com sucesso.");
        } else {
            System.out.println("Falha ao excluir o arquivo.");
        }
    }
}

