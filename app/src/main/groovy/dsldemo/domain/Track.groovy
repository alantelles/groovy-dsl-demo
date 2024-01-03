package dsldemo.domain

import dsldemo.enums.Genre
import groovy.transform.ToString

@ToString
class Track extends PlaylistEntry {

    Artist artist
    Genre genre

    @Override
    String logPlay() {
        return "$name, by $artist.name. Genre: $genre"
    }
}
