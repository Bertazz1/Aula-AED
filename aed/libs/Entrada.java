package libs;

import java.util.Scanner;

public class Entrada {
    public static Scanner entrada;

    public static void abrir(){
        entrada = new Scanner(System.in);
    }

    public static void fechar(){
        entrada.close();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return entrada.nextInt();
    }
}

