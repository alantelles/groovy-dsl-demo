package dsldemo.data

import dsldemo.domain.Artist
import static dsldemo.domain.Artist.include
import static dsldemo.enums.Genre.*

class DummyData {

    private static List<Artist> ARTISTS = []

    static Artist getArtist(String name) {
        if (!name) {
            throw new IllegalArgumentException("Artist name not valid")
        }
        Artist found = ARTISTS.find { it.name == name }
        if (!found) {
            throw new IllegalArgumentException("Artist not found")
        }
        return found
    }

    static setArtist(Artist artist) {
        ARTISTS.add(artist)
    }

}
