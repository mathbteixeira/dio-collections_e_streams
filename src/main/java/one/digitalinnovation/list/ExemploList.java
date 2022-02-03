package src.main.java.one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(nomes.indexOf("Carlos"), "Wesley");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem : nomes) {
            System.out.println("----> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("------->" + iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
    }
}
