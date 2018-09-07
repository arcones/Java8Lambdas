package sw.arcones.unit1;

import java.util.function.Function;

public class Exercise1b {
    static Function<Integer, Integer> signChange = x -> -x;

    public static void main(String[] args) {
        Integer i = 3;
        System.out.print(signChange.apply(3));
    }

}