package sw.arcones.unit5;

import sw.arcones.model.Artist;

import java.util.function.Function;
import java.util.stream.Stream;

public class Exercise1b {

    private static Function<Stream<Artist>, Integer> count = artistStream -> ((Long) artistStream.flatMap(Artist::getMembers).count()).intValue();

}
