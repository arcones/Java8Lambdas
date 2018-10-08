package sw.arcones.unit2;

import java.util.function.Function;
import java.util.stream.Stream;

public class Exercise1b {

    private static Function<Integer, Integer> signChange = x -> -x;
    private static Function<Stream<Integer>, Integer> addUp = integers -> integers.reduce((int1, int2) -> int1 + int2).orElse(0);
    private static Function<Stream<Integer>, Integer> multiply = integers -> integers.reduce((int1, int2) -> int1 * int2).orElse(0);

    public static void main(String[] args) {
        System.out.println("Sign changed -> " + signChange.apply(3));

        System.out.println("Added -> " + addUp.apply(Stream.of(3, 5, 0, -1)));

        System.out.println("Multiplied -> " + multiply.apply(Stream.of(3, 8, 9)));
    }

}