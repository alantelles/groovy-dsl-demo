package dsldemo.dsl

import dsldemo.domain.Playlist

class PlaylistDsl {

    static Playlist playlist(
            final String name,
            @DelegatesTo(value = EntryDsl, strategy = Closure.DELEGATE_ONLY) final Closure closure
    ) {
        final EntryDsl entryDsl = new EntryDsl()
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure.delegate = entryDsl
        closure()
        return new Playlist(
                name: name,
                tracks: entryDsl.entries
        )
    }

}
