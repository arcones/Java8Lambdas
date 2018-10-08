package sw.arcones.unit3;

import java.util.stream.Stream;

public class Exercise1a {

    private static int addUp(Stream<Integer> numbers) {
        return numbers.reduce((x,y)-> x+y).orElse(0);
    }

    public static void main(String[] args) {
        Integer added2 = addUp(Stream.of(3,4,5,6));
        System.out.println(added2);
    }
}
