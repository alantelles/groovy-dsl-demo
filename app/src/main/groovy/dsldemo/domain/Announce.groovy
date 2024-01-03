package dsldemo.domain

class Announce extends PlaylistEntry {

    String text

    @Override
    String logPlay() {
        return "ANNOUNCE: $name. Text: $text"
    }

}
