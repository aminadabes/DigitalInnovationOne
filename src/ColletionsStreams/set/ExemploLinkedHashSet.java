package ColletionsStreams.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ExemploLinkedHashSet {
    /*
     - LinkedHashSet
     É utilizado quando é necessário manter a ordem de inserção dos elementos.
     Mantém a ordem de inserção dos elementos.
     É a implementação mais lenta por ser necessária manter a ordem.
     */
    public static void main(String[] args) {
        LinkedHashSet<String> evangelhos = new LinkedHashSet<>();
        evangelhos.add("Mateus");
        evangelhos.add("Marcos");
        evangelhos.add("Lucas");
        evangelhos.add("João");

        System.out.println(evangelhos);

        Iterator<String> livros = evangelhos.iterator();
        while (livros.hasNext()){
            System.out.print(livros.next() + " ");
        }
        System.out.println();

        for (String livro : evangelhos) {
            System.out.print(livro + " ");
        }
    }
}
