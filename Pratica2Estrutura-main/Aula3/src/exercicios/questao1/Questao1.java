package exercicios.questao1;

import java.util.LinkedList;

public class Questao1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        LinkedList<Integer> prioridade = new LinkedList<Integer>();


        for (int i = 1; i <= 200; i++) {
            lista.add(i);
        }

        System.out.println("Lista" + lista);

        for (int i = 1; i <= 200; i++) {
            if(i%2!=0 && i<=100){
                prioridade.add(i);
                lista.remove(prioridade.indexOf(i));
            }
        }
        
        System.out.println("Lista Prioritária: " + prioridade);
        System.out.println("Lista Comum: " + lista);

    }
}
