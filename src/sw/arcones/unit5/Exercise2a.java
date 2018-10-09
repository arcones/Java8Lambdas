package sw.arcones.unit5;

import sw.arcones.model.Artist;

import java.util.Comparator;
import java.util.List;

public class Exercise2a {

    private static Comparator<Artist> byNameLength = Comparator.comparing(artist -> artist.getName().length());

    private static Artist getArtistWithLongestName(List<Artist> artists) {
        return artists.stream().max(byNameLength).orElseThrow(RuntimeException::new);
    }

    private static Artist getArtistWithLongestName2(List<Artist> artists) {
        return artists.stream()
                .reduce((accumulator, artist) -> byNameLength.compare(accumulator, artist) >= 0 ? accumulator : artist)
                .orElseThrow(RuntimeException::new);
    }

}
