package ColletionsStreams.comparators;

import java.util.ArrayList;
import java.util.List;

public class Evangelhos implements Comparable<Evangelhos> {
    /*
    Interfaces:
    java.util.Comparator - Interface para definir classe com regra de ordenação
    java.util.Comparable - Interface para definir regra de ordenação em uma classe de domínio
    Algoritmos de ordenação
    Utilizado primariamente em java.util.List
    Permite a ordenação de objetos complexos (criados pelo usuário)
     */

    private String descricao;
    private int codigo;

    public Evangelhos(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Evangelhos{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public int compareTo(Evangelhos valorDeComparacao) {
        return this.getCodigo() - valorDeComparacao.getCodigo();
    }
}
