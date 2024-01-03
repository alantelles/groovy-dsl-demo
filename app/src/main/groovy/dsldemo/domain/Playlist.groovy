package dsldemo.domain

import dsldemo.enums.Genre

class Playlist {

    String name
    List<PlaylistEntry> tracks = []

    void play() {
        tracks.each { println "now playing: ${it.logPlay()}"}
    }

    void analyzeGenres() {
        List<Genre> genres = tracks.findAll { it instanceof Track }
                .collect { (Track) it }
                .collect {it.genre }
        println(genres.countBy { it }.sort {-it.value })
    }

}
