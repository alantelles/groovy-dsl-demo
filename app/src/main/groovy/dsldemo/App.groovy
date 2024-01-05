/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package dsldemo

import dsldemo.data.DummyData

import static dsldemo.PlayerService.carregaPlaylist

class App {

    static void main(String[] args) {
        List<String> argsList = args.toList()
        DummyData.setArtists()
        if (argsList.size() < 1) {
            throw new IllegalArgumentException("Playlist não informada!")
        }
        String playlistName = argsList[0]
        String root = argsList[1] ?: '.'
        PlayerService service = carregaPlaylist(playlistName, root)
        service.analyzeGenres()
        service.play()
    }

}
