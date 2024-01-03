package dsldemo.extensions

class DemoDslExtension {

    static String getPassos(Integer self) {
        return "$self passos"
    }

    static String getGraus(Integer self) {
        return "$self graus"
    }

    static String getMinutos(Integer self) {
        return "$self minutos"
    }

    static String getMinuto(Integer self) {
        return getMinutos(self)
    }

    static String getMetros(Integer self) {
        return "$self metros"
    }

    static String getMeiaVolta(Integer self) {
        return "${self > 1 ? self + ' ' : ''}meia volta"
    }

    static String getHoras(Integer self) {
        return "$self horas"
    }

}
