package ColletionsStreams.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    /*
     - TreeSet
     É utilizada quando necessário alterar a ordem através do uso de comparators.
     Mantém ordem e pode ser reordenado.
     É performático para leitura.
     Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet
     */
    public static void main(String[] args) {
        TreeSet<String> evangelhos = new TreeSet<>();
        evangelhos.add("Mateus");
        evangelhos.add("Marcos");
        evangelhos.add("Lucas");
        evangelhos.add("João");
        evangelhos.add("Atos");

        System.out.println(evangelhos);

        for (String livos : evangelhos) {
            System.out.print(livos + " ");
        }

        System.out.println();
        System.out.println(evangelhos.first());
        System.out.println(evangelhos.last());
        System.out.println(evangelhos.lower("Lucas"));
        System.out.println(evangelhos.higher("Lucas"));
        System.out.println(evangelhos.pollFirst());


        Iterator<String> livros = evangelhos.iterator();
        while (livros.hasNext()){
            System.out.print(livros.next() + " ");
        }

    }
}


