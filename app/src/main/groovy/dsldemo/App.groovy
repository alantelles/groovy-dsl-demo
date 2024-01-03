/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package dsldemo

import static dsldemo.dsl.ArtistDsl.artist
import static dsldemo.enums.Genre.*

class App {

    static void main(String[] args) {
        setArtists()
        PlayerService service = new PlayerService('programa_da_noite')
        service.analyzeGenres()
        service.play()
    }

    static void setArtists() {
        artist(
                name: 'Pages',
                genre: AOR
        )
        artist(
                name: 'Natalie Imbruglia',
                genre: POP
        )
        artist(
                name: 'The Weeknd',
                genre: RNB
        )
    }

}