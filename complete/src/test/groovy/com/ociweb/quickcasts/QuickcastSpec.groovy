package com.ociweb.quickcasts

import spock.lang.Specification
import grails.testing.gorm.DomainUnitTest

class QuickcastSpec extends Specification implements DomainUnitTest<Quickcast> {

    void "test description is optional"() {
        expect:
            new Quickcast(description: null).validate(['description'])
    }
}
