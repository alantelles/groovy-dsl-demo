package dsldemo.dsl

import dsldemo.data.DummyData
import dsldemo.domain.Announce
import dsldemo.domain.PlaylistEntry
import dsldemo.domain.Track
import dsldemo.enums.Genre

class EntryDsl {

    List<PlaylistEntry> entries = []

    EntryDsl music(String name) {
        entries << new Track(name: name)
        return this
    }

    EntryDsl announce(String sponsor) {
        entries << new Announce(name: sponsor)
        return this
    }

    void saying (String text) {
        ((Announce) entries.last()).text = text
    }

    void from(String artistName, Genre genre = null) {
        Track lastTrack = (Track) entries.last()
        lastTrack.artist = DummyData.getArtist(artistName)
        lastTrack.genre = genre ?: lastTrack.artist.genre ?: Genre.UNKNOWN
    }

}
