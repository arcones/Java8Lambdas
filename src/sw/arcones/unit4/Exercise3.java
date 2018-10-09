package sw.arcones.unit4;

import sw.arcones.model.Artist;

import java.util.List;
import java.util.Optional;

public class Exercise3 {

    private List<Artist> artists;

    public Exercise3(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        return Optional.of(artists.get(index));
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.map(Artist::getName).orElse("unknown");
    }

}
