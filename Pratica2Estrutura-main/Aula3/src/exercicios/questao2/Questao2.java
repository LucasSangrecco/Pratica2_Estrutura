package exercicios.questao2;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.io.File;

public class Questao2 {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> listaNoiva = new LinkedList<String>();
        LinkedList<String> listaNoivo = new LinkedList<String>();
        LinkedList<String> listaCasamento = new LinkedList<String>();

        try (Scanner scanner = new Scanner(new File("C:\\Users\\Lucas\\Downloads\\Pratica2Estrutura-main\\Pratica2Estrutura-main\\Aula3\\src\\exercicios\\questao2\\listaNoiva.txt"))) {
            while (scanner.hasNextLine()) {
                listaNoiva.add(scanner.nextLine());
            }
            System.out.println("Lista da noiva\n");

            Collections.sort(listaNoiva);
            for (String elemento : listaNoiva) {
                System.out.println(elemento);
            }
        }

        try (Scanner scanner = new Scanner(new File("C:\\Users\\Lucas\\Downloads\\Pratica2Estrutura-main\\Pratica2Estrutura-main\\Aula3\\src\\exercicios\\questao2\\listaNoivo.txt"))) {
            while (scanner.hasNextLine()) {
                listaNoivo.add(scanner.nextLine());
            }
            System.out.println("\n\nLista do noivo\n");

            Collections.sort(listaNoivo);

            for (String elemento : listaNoivo) {
                System.out.println(elemento);
            }
        }

        for (String elemento : listaNoiva) {
            listaCasamento.add(elemento);
        }

        for (String elemento : listaNoivo) {
            listaCasamento.add(elemento);
        }

        System.out.println("\n\nLista do Casamento\n");

        Collections.sort(listaCasamento);

        for (String elemento : listaCasamento) {
            System.out.println(elemento);
        }

    }
}
