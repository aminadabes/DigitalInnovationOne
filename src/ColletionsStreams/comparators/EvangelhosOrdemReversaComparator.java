package ColletionsStreams.comparators;

import java.util.Comparator;

public class EvangelhosOrdemReversaComparator implements Comparator<Evangelhos>{
    @Override
    public int compare(Evangelhos o1, Evangelhos o2) {
        return o2.getCodigo() - o1.getCodigo();
    }
}
