package dsldemo.data

import dsldemo.domain.Artist

import static dsldemo.dsl.ArtistDsl.artist
import static dsldemo.enums.Genre.*

class DummyData {

    private static List<Artist> ARTISTS = []

    static void setArtists() {
        artist(
                name: 'Pages',
                genre: AOR
        )
        artist(
                name: 'Tom Jobim',
                genre: BOSSA_NOVA
        )
        artist(
                name: 'The Weeknd',
                genre: RNB
        )
        artist(
                name: 'H.E.R',
                genre: RNB
        )
    }

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
