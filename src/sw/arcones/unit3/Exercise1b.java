package sw.arcones.unit3;

import sw.arcones.model.Artist;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1b {

    private static final Function<List<Artist>, List<String>> namesAndOrigins = artists ->
            artists.stream()
            .flatMap(artist -> Stream.of(artist.getName(), artist.getNationality()))
            .collect(Collectors.toList());


    public static void main(String[] args) {
        List<Artist> artists = List.of(
                new Artist("Julio Iglesias", "Spanish"),
                new Artist("Rosendo", "Carabanchelero")
        );

        artists.forEach(System.out::println);

        List<String> result = namesAndOrigins.apply(artists);

        result.forEach(System.out::println);
    }
}