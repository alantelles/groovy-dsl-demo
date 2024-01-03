package dsldemo.dsl

class DemoDsl {

    List<String> percurso = []

    DemoDsl caminhe(String distancia) {
        percurso.add("caminhou $distancia")
        return this
    }

    DemoDsl vire(String curva) {
        percurso.add("virou $curva")
        return this
    }

    DemoDsl pare(String tempo) {
        percurso.add("parou por $tempo")
        return this
    }

    DemoDsl termine() {
        percurso.add("Terminou a caminhada")
        return this
    }

    DemoDsl getTermine() {
        return termine()
    }

    DemoDsl descreva() {
        println(percurso.join('\n'))
        return this
    }

    DemoDsl getDescreva() {
        return descreva()
    }

}
