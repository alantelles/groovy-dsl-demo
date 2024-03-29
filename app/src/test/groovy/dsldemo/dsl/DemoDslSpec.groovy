package dsldemo.dsl

import spock.lang.Specification

import static dsldemo.dsl.CaminhadaDsl.caminhadas


class DemoDslSpec extends Specification {

    def "classe funciona"() {

        given:
        DemoDsl demoDsl = new DemoDsl()

        when:
        demoDsl.caminhe(3.passos).vire(90.graus).pare(5.minutos).termine()
        demoDsl.descreva()

        then:
        noExceptionThrown()

    }

    def "dsl funciona"() {

        given:
        DemoDsl demoDsl = new DemoDsl()

        when:
        demoDsl.caminhe 3.passos vire 90.graus pare 5.minutos termine
        demoDsl.descreva

        then:
        noExceptionThrown()

    }

    def "prop adicionada"() {
        given:
        Integer i = 3

        when:
        i.passos
        i.graus
        i.minutos

        then:
        noExceptionThrown()
    }

    def "caminhada dsl funciona"() {

        when:
        caminhadas {
            caminhe 4.metros vire 1.meiaVolta pare 2.horas caminhe 6.metros termine
            descreva
            novaCaminhada
            caminhe 2.passos vire 90.graus pare 1.minuto termine
            descreva
            novaCaminhada
        }

        then:
        noExceptionThrown()

    }

}
