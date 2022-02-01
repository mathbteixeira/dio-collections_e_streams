package src.main.java.one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
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
    }
}
