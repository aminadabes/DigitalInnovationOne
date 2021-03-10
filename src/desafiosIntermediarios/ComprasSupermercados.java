package desafiosIntermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComprasSupermercados {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  tamanho = Integer.parseInt(br.readLine());

        List<String> shoppingList = new ArrayList<>(Arrays.asList("tamanho",
                "steak orange juice biscuit orange juice orange biscuit", "aplle orange soap orange soap"));

        List<List<String>> compras = shoppingList.stream().map(t -> Arrays.asList(t.split(" ")))
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.toList());

        int size =  Integer.valueOf(compras.get(0).get(0));


        for( int i = 1;i<=size; i++){
            compras.get(i).stream()
                    .distinct()
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList()).forEach(nb -> System.out.print(nb + " "));
            System.out.println();
        }
    }
}
