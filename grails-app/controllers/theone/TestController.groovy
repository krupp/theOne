package theone

import grails.converters.JSON

class TestController {

    def index() {
        render 'hello worldS' as JSON
    }
}
