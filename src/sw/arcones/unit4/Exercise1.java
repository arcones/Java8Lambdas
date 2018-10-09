package sw.arcones.unit4;

import sw.arcones.model.Artist;
import sw.arcones.model.Performance;

import java.util.stream.Stream;

public class Exercise1 implements Performance {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Stream<Artist> getMusicians() {
        return null;
    }

    @Override
    public Stream<Artist> getAllMusicians() {
        return getMusicians()
                .flatMap( artist -> Stream.concat(Stream.of(artist), artist.getMembers()));
    }
}
