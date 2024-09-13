package aulas;

import libs.entrada;
import libs.matematica;

public class aula20 {
    public static void aula(){
        System.out.println("++ Aula do dia 09/08/2024++");
        exLerInteiro();
    }


    public static void exLerInteiro(){
        entrada.abrir();

        int x = entrada.lerInt("digite um numero");
        int y = entrada.lerInt("digite outro");
        int j;
        System.out.println("Foi digitado o valor "+ x);
    
        j=matematica.menor(x, y);
        System.out.println("o menor valor foi"+j);
        entrada.fechar();
    }
}

