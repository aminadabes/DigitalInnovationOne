package desafiosIntermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class ComprasSupermercados {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tamanho = Integer.parseInt(br.readLine());

        List<String> listaDeCompras = new Vector<>();

        for (int i = 0; i < tamanho; i++) {
            listaDeCompras.add(br.readLine());
        }

        listaDeCompras.forEach(valor -> {
            System.out.println(Arrays.stream(valor.split(" "))
                    .collect(Collectors.toSet())
                    .stream()
                    .sorted()
                    .collect(Collectors.joining(" ")));
        });
    }
}
