package sw.arcones.unit3;

import sw.arcones.model.Album;
import sw.arcones.model.Artist;
import sw.arcones.model.Track;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Exercise1c {

    private static final Function<List<Album>, List<Album>> getAlbumsWithAtMostThreeTracks =
            albums -> albums.stream()
            .filter(album -> album.getTrackList().size()<=3)
            .collect(Collectors.toList());

    public static void main(String[] args) {

        Artist johnColtrane = new Artist("John Coltrane", "US");

        List<Album> albums = List.of(
            new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), Collections.singletonList(johnColtrane)),
            new Album("sample Short Album", asList(new Track("short track", 30)), Collections.singletonList(johnColtrane)),
            new Album("sample long Album", asList(new Track("short track", 30), new Track("short track 2", 30), new Track("short track 3", 30), new Track("short track 4", 30), new Track("short track 5", 30)), Collections.singletonList(johnColtrane))
        );

        albums.forEach(System.out::println);

        System.out.println("Result: ");

        getAlbumsWithAtMostThreeTracks.apply(albums).forEach(System.out::println);
    }


}
