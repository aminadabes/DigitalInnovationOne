package ColletionsStreams.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class ExemploHashSet {
    /*
    Implementações:
    java.util.HashSet
    java.util.TreeSet
    java.util.LinkedHashSet
    --> Por padrão não garantem ordem <--
    --> Não permite mudança de ordenação <--
    --> Não permite itens repetidos <--
    Permite adição e remoção normalmente. Não possui busca por item e atualização.
    Para leitura, apenas navegação.
    São utilizadas para grande volumes de dados. É performatica.

     - HashSet
     É utilizado quando não é necessário manter uma ordenação.
     Não é ordenado, e não permite valoes repetidos.
     Por não ter repetição de valores e não ser ordenado, é a implementação mais performática.

     - LinkedHashSet
     É utilizado quando é necessário manter a ordem de inserção dos elementos.
     Mantém a ordem de inserção dos elementos.
     É a implementação mais lenta por ser necessária manter a ordem.

     - TreeSet
     É utilizada quando necessário alterar a ordem através do uso de comparators.
     Mantém ordem e pode ser reordenado.
     É performático para leitura. Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet
     */
    public static void main(String[] args) {
        HashSet<String> evangelhos = new HashSet<>();
        evangelhos.add("Mateus");
        evangelhos.add("Marcos");
        evangelhos.add("Lucas");
        evangelhos.add("João");
        evangelhos.add("Atos");

        System.out.println(evangelhos);

        evangelhos.remove("Atos");
        System.out.println(evangelhos);

        for (String livro : evangelhos) {
            System.out.print(livro + " ");
        }
        System.out.println();
        Iterator<String> livros = evangelhos.iterator();
        while (livros.hasNext()){
            System.out.print(livros.next() + " ");
        }




    }
}
