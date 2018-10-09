package sw.arcones.unit5;

import java.util.stream.Stream;

public class Exercise1a {

    public static void main(String[] args) {
        Stream<String> words = Stream.of("caca","culo","pedo","pis");

        words.map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
