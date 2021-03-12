package ColletionsStreams.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploListaComparators {
    public static void main(String[] args) {
        List<Evangelhos> evangelhos = new ArrayList<>();
        evangelhos.add(new Evangelhos("Mateus", 1));
        evangelhos.add(new Evangelhos("Marcos", 2));
        evangelhos.add(new Evangelhos("Lucas", 3));
        evangelhos.add(new Evangelhos("João", 4));

        System.out.println(" Ordem de inserção \n" + evangelhos);
        //Ordem natural dos nros
        evangelhos.sort((first, second) -> first.getCodigo() - second.getCodigo());
        System.out.println("Ordem natural dos nros \n" +evangelhos);
        //Ordem reversa dos nros
        evangelhos.sort((a, b) -> b.getCodigo() - a.getCodigo());
        System.out.println("Ordem reversa dos nros \n"+evangelhos);

        evangelhos.sort(Comparator.comparingInt(Evangelhos::getCodigo));
        System.out.println("Ordem natural metodo de referencia \n" + evangelhos);

        evangelhos.sort(Comparator.comparingInt(Evangelhos::getCodigo).reversed());
        System.out.println("Ordem reversa metodo de referencia \n" + evangelhos);

        Collections.sort(evangelhos);
        System.out.println("Ordem natural interface Comparable \n" + evangelhos);

        Collections.sort(evangelhos, new EvangelhosOrdemReversaComparator());
        System.out.println("Ordem reversa interface Comparator \n" + evangelhos);

    }
}
