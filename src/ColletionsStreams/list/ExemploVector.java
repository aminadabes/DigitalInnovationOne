package ColletionsStreams.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> evangelhos = new Vector<>();
        evangelhos.add("Mateus");
        evangelhos.add("Marcos");
        evangelhos.add("Lucas");
        evangelhos.add("Atos");

        System.out.println(evangelhos);
        evangelhos.set(3,"João");
        for (String livros : evangelhos) {
            System.out.println(livros);
        }
    }
}

