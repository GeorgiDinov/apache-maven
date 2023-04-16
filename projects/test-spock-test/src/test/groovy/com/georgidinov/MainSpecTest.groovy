package com.georgidinov

import spock.lang.Specification

//TODO: If the test definition is empty ti will not pick and execute the test class
class MainSpecTest extends Specification {


    def "GetHw"() {
        when:
        def foo = "123"

        then:
        true
    }

}
