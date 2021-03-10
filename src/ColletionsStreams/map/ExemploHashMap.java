package ColletionsStreams.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    /*
    Não é uma interface que extende de java.util.Colletions
    Implementações:
    java.util.HashMap
    java.util.TreeMap
    java.util.HashTable
    --> Entrada de chave e valor
    Permite valores repetidos, mas não permite repetição de chave
    Permite adição, busca por chave ou valor, atualização, remoção e navegação.
    Pode ser ordenado.
     */
    public static void main(String[] args) {
        HashMap<Integer, String> evangelhos = new HashMap<>();
        evangelhos.put(1, "Mateus");
        evangelhos.put(2, "Marcos");
        evangelhos.put(3, "Lucas");
        evangelhos.put(4, "João");

        System.out.println(evangelhos);

        System.out.println(evangelhos.size());
        System.out.println(evangelhos.keySet());
        System.out.println(evangelhos.values());
        System.out.println(evangelhos.containsKey(2));
        System.out.println(evangelhos.containsValue("Atos"));
        System.out.println(evangelhos.entrySet());
        System.out.println(evangelhos.get(2));
        System.out.println(evangelhos.getOrDefault(2,"Lucas"));

        evangelhos.forEach((integer, s) -> System.out.print(s + " "));
        System.out.println();
        for (Map.Entry<Integer, String> entry : evangelhos.entrySet()) {
            System.out.print(entry.getKey() + " --- " + entry.getValue() + " ");
        }
        System.out.println();
        for (Integer key : evangelhos.keySet()) {
            System.out.print(key + " --- " + evangelhos.get(key) + " ");
        }
    }
}
