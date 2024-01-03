package dsldemo.dsl

import spock.lang.Specification


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

}
