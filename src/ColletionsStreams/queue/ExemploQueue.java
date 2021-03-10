package ColletionsStreams.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    /*
    Implementações que aprenderemos java.util.LinkedList
    Queue -> Garante ordem de inserção <-
    Não permite mudança de ordenação
    Permite adição, leitura e remoção considerando a regra básica de uma fila:
    FIFO - Firt In First Out

     */
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Senha 1");
        filaBanco.add("Senha 2");
        filaBanco.add("Senha 3");
        filaBanco.add("Senha 4");
        filaBanco.add("Senha 5");

        System.out.println(filaBanco);
        String chamaSenhaRetirandoDaFila = filaBanco.poll();
        System.out.println(chamaSenhaRetirandoDaFila);
        System.out.println(filaBanco);
        String mostraProximaSenhaSemRetirarDaFila = filaBanco.peek();
        System.out.println(mostraProximaSenhaSemRetirarDaFila);
        System.out.println(filaBanco);

       // filaBanco.clear();
        String mostraProximaSenhaNaoRetiraDaFila = filaBanco.element();
        System.out.println(mostraProximaSenhaNaoRetiraDaFila);
        System.out.println(filaBanco);

        for (String senha : filaBanco) {
            System.out.println(senha);
        }

        Iterator<String> senhas = filaBanco.iterator();
        while (senhas.hasNext()){
            System.out.print(senhas.next());
        }
    }

}

