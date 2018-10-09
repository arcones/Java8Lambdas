package sw.arcones.model;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public interface Performance {

    String getName();

    Stream<Artist> getMusicians();

    Stream<Artist> getAllMusicians();
}
