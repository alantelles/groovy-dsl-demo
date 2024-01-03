package dsldemo

import dsldemo.domain.Playlist

class PlayerService {

    Playlist evaluatedPlaylist

    PlayerService(String playlistName) {
        evaluatedPlaylist = loadPlaylist(playlistName)
    }

    void play() {
        evaluatedPlaylist.play()
    }

    void analyzeGenres() {
        evaluatedPlaylist.analyzeGenres()
    }

    static Playlist loadPlaylist(String playlistName) {
        try {
            File file = new File(getPlaylistPath(playlistName))
            String script = "import static dsldemo.dsl.PlaylistDsl.playlist\n\n" + file.text
            return (Playlist) Eval.me(script)
        } catch(Exception e) {
            throw new IllegalArgumentException("Could not load playlist $playlistName: $e.message", e)
        }
    }

    private static String getPlaylistPath(String playlistName) {
        return "playlists/${playlistName}.groovy"
    }

}
