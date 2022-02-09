package src.main.java.one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        System.out.println("tamanho: " + sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer numero : sequenciaNumerica) {
            System.out.println("--- " + numero);
        }

        sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
