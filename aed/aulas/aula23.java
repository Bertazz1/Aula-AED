package aulas;

import libs.entrada;
import libs.caractere;

public class aula23 {
    public static void aula(){
        System.out.println("Aula do dia 20/08 - Caracteres");
        entrada.abrir();
        String frase = entrada.lerFrase("Digite uma frase");
        char letra=entrada.lerCaractere("digite uma caractere");
    
System.out.println(letra);
        System.out.println(caractere.removerCaracteresFrase(frase,letra));
    }
    
    // public static String converterPosiçaoParaMaiuscula  (String entrada, int posi){ 
        
    //     String retorno = "";
    //     retorno= entrada.substring(0, 3)+entrada.toUpperCase().charAt(3)+entrada.substring(4, entrada.length());
    //     return retorno;
    
//     public static int obterPosiçaoProxChar(){
//         entrada.abrir();
//         String string = entrada.lerPalavra("digite uma palavra");
//         int pos_ini = entrada.lerInt("Digite a posiçao inicial na palavra que voce deseja procurar o caractere");
//         char char1 = entrada.lercaractere();
//         int pos_retorno = -1;
//         int i;

//         for(i=pos_ini; i<string.length(); i++){
//            if (string.charAt(i) == char1){
//             return i;
//            }
//         }
//         return pos_retorno;
//     }
}


