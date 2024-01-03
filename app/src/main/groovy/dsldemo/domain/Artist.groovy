package dsldemo.domain

import dsldemo.data.DummyData
import dsldemo.enums.Genre

class Artist {

    String name
    Genre genre

    Artist(String name, Genre genre) {
        this.name = name
        this.genre = genre
    }

    static void include(String name, Genre genre = null) {
        DummyData.setArtist(new Artist(name, genre))
    }

}
