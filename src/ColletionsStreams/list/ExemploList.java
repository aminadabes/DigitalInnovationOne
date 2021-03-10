package ColletionsStreams.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    /*
     * Implementações que aprenderemos: java.util.ArrayList e java.util.Vector
     * Principal característca da java.util.ArrayList -> Garante ordem de inserção <-
     * Permite adição, atualização, leitura e remoção sem regras adicionais
     * Permite ordenação através de comparators
     * List é a implementação mais simples e mais comum
     */
    public static void main(String[] args) {
        List<String> novoTestamento = new ArrayList<>();

        novoTestamento.add("Mateus");
        novoTestamento.add("Marcos");
        novoTestamento.add("Lucas");
        novoTestamento.add("João");
        novoTestamento.add("Atos");
        novoTestamento.add("Romanos");
        novoTestamento.add("1 Corintios");
        novoTestamento.add("2 Corintios");
        novoTestamento.add("Galatas");
        novoTestamento.add("Efesios");
        novoTestamento.add("Filipenses");
        novoTestamento.add("Colossenses");
        novoTestamento.add("1 Tessalonicenses");
        novoTestamento.add("2 Tessalonicenses");
        novoTestamento.add("1 Timoteo");
        novoTestamento.add("2 Timoteo");
        novoTestamento.add("Tito");
        novoTestamento.add("Filemon");
        novoTestamento.add("Hebreus");
        novoTestamento.add("Tiago");
        novoTestamento.add("1 Pedro");
        novoTestamento.add("2 Pedro");
        novoTestamento.add("1 Joao");
        novoTestamento.add("2 Joao");
        novoTestamento.add("3 Joao");
        novoTestamento.add("Judas");
        novoTestamento.add("Apocalipse");

        // Para alterar um valor de alguma posição
        // novoTestamento.set(10,"novoNome");
        System.out.println(novoTestamento);
        // ORDEM ALFABETICA
        Collections.sort(novoTestamento);
        System.out.println(novoTestamento);
        // Retorna para a variavel o elemento do indice que passarmos
        System.out.println("get(9) Retorna para a variavel o elemento do indice que passarmos " +novoTestamento.get(9));
        // Retorna quantidade de elementos no array
        System.out.println("size() Retorna quantidade de elementos no array \n" +novoTestamento.size());
        // Retorna um booleano se o elemente existe na lista
        System.out.println("contains() Retorna um booleano se o elemente existe na lista \n"+novoTestamento.contains("Atos"));
        // Retorna a posicao na lista
        System.out.println("indexOf() Retorna a posicao na lista \n"+novoTestamento.indexOf("Atos"));
        // Retorna um booleano se a lista esta vazia
        System.out.println("isEmpty() Retorna um booleano se a lista esta vazia \n"+novoTestamento.isEmpty());

        System.out.println(" ---- LIVROS DO NOVO TESTAMTENO ----");
        for (String livros : novoTestamento) {
            System.out.print(livros+"\n");
        }
        System.out.println("iterator()");
        Iterator<String> iterator = novoTestamento.iterator();
        // hasNext() retorna um booelano
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

