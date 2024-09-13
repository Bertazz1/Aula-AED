package aulas;

import libs.entrada;

public class aula25 {
    public static void aula(){
        System.out.println("Aula do dia 15/09 - Vetores");
        paresImparesAoContrario();
    }


    public static void paresImparesAoContrario(){
        int [] va = new int [10];
        int [] vb = new int [10];
        int idx1 = 0,idx2=vb.length;
        entrada.abrir();
        for(int i = 0; i<va.length; i++){
            va[i]=entrada.lerInt();    }entrada.fechar();
        
            for(int i = 0; i<va.length; i++){
                if (va[i]%2==0) {
                    vb[idx1]=va[i];
                    idx1++;
                }else {
                    vb[idx2]=va[i];
                    idx2--;
                }

            }
            System.out.println(vb);

}
}