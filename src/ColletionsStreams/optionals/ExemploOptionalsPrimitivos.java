package ColletionsStreams.optionals;

import java.io.OptionalDataException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalsPrimitivos {
    public static void main(String[] args) {
        System.out.println("Valor inteiro optional");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor decimal optional");
        OptionalDouble.of(12.5).ifPresent(System.out::println);

        System.out.println("Valor long optional");
        OptionalLong.of(12L).ifPresent(System.out::println);

    }
}
