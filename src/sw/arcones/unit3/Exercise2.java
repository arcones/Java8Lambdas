package sw.arcones.unit3;

import sw.arcones.model.Artist;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Exercise2 {

    private static Function<Stream<Artist>, Integer> count = artistStream -> ((Long) artistStream.flatMap(artist -> artist.getMembers()).count()).intValue();


    private static int count2(Stream<Artist> artists) {
        return (int) artists.flatMap(Artist::getMembers).count();
    }

    public static final Artist johnLennon = new Artist("John Lennon", "UK");
    public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
    public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
    public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");

    public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);

    public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");


    public static void main(String[] args) {
        System.out.println(count.apply(Stream.of(theBeatles)));

        System.out.println(count2(Stream.of(theBeatles)));
    }

}
