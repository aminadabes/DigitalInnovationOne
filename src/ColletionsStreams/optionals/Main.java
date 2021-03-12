package ColletionsStreams.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Valor optional");
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.isEmpty());

        stringOptional.ifPresent(System.out::println);

        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("vlaor não está presente"));

        if(stringOptional.isPresent()){
            String valor = stringOptional.get();
            System.out.println(valor);
        }

        stringOptional.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

        stringOptional.orElseThrow(IllegalStateException::new);

    }
}
