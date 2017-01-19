package com.ociweb.quickcasts

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quickcast)
class QuickcastSpec extends Specification {

    void "test description is optional"() {
        expect:
            new Quickcast(description: null).validate(['description'])
    }
}
