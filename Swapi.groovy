@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7')
import groovyx.net.http.RESTClient

class Swapi {

    String baseURL = 'http://swapi.co/api/'
    def http = new RESTClient(baseURL)

    def getFilms() {
        def response = http.get(path: 'films')
        return response
    }

    def getLuke() {

        def response = http.get(path: 'people/1')
        return response

    }

    def getPeople() {

        def response = http.get(path: 'people')
        return response

    }
}
