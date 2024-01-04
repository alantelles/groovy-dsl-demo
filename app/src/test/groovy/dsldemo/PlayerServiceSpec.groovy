package dsldemo

import dsldemo.data.DummyData
import dsldemo.domain.Announce
import dsldemo.domain.Playlist
import dsldemo.domain.Track
import spock.lang.Specification

class PlayerServiceSpec extends Specification {

    void setup() {
        DummyData.setArtists()
    }

    def "carrega playlist corretamente"() {
        when:
        PlayerService player = PlayerService.carregaPlaylist('programa_da_noite', '../')
        Playlist playlist = player.evaluatedPlaylist

        then:
        noExceptionThrown()
        playlist.tracks.size() == 7
        (playlist.tracks[0] as Track).artist.name == 'Tom Jobim'
        (playlist.tracks[3] as Announce).name == 'Banco Itaú'
        (playlist.tracks[5] as Track).name == 'Best Part'
    }

}
