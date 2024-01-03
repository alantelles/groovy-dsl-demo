package dsldemo.dsl

import dsldemo.domain.Artist
import dsldemo.enums.Genre

class ArtistDsl {

    static void artist(Map args) {
        Artist.include((String) args.name, (Genre) args.genre)
    }

}
