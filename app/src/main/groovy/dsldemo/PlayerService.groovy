package dsldemo

import dsldemo.domain.Playlist

class PlayerService {

    Playlist evaluatedPlaylist

    PlayerService(String playlistName, String root) {
        evaluatedPlaylist = loadPlaylist(playlistName, root)
    }

    void play() {
        evaluatedPlaylist.play()
    }

    void analyzeGenres() {
        evaluatedPlaylist.analyzeGenres()
    }

    static Playlist loadPlaylist(String playlistName, String root) {
        try {
            File file = new File(getPlaylistPath(playlistName, root))
            String script = "import static dsldemo.dsl.PlaylistDsl.playlist\n\n" + file.text
            return (Playlist) Eval.me(script)
        } catch(Exception e) {
            throw new IllegalArgumentException("Could not load playlist $playlistName: $e.message", e)
        }
    }

    private static String getPlaylistPath(String playlistName, String root) {
        return "${root ?: '.'}/playlists/${playlistName}.groovy"
    }

}
