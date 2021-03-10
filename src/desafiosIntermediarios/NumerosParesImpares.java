package desafiosIntermediarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosParesImpares {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  tamanho = Integer.parseInt(br.readLine());
        List<Integer> valores = new ArrayList<>();
        for (int i = 1; i <= tamanho; i++) {
            int  numeros = Integer.parseInt(br.readLine());
            valores.add(numeros);
        }

        valores.stream()
                .filter((valor)-> valor.intValue()%2==0).collect(Collectors.toList())
                .stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                .forEach(System.out::println);

        valores.stream()
                .filter((valor)-> valor.intValue()%2!=0).collect(Collectors.toList()) ;

        valores.stream()
                .filter((valor)-> valor.intValue()%2!=0).collect(Collectors.toList())
                .stream().sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }

}
