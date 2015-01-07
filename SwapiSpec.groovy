@Grab(group='org.spockframework', module='spock-core', version='0.7-groovy-2.0')
// This next grab is a hack to use both files code and tests.
// It's not elegant. Do not make this at home, kids.
@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')
import spock.lang.*

class SwapiSpec extends Specification {

    void 'get films'() {
        given:
        Swapi swapi = new Swapi()
        def films = swapi.films.data
        String totalFilms = films.count

        expect:
        totalFilms == '6'
    }

    void 'get luke'() {
        given:
        Swapi swapi = new Swapi()
        def luke = swapi.luke.data
        String name = luke.name

        expect:
        name == 'Luke Skywalker'
    }

    void 'get people'() {
        given:
        Swapi swapi = new Swapi()
        def people = swapi.people.data
        String totalPeople = people.count

        expect:
        totalPeople == '82'
    }

}
