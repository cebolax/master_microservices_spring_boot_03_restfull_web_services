package com.minutes.rest.microservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping(path = "/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("Bob bob");
    }

    @GetMapping(path = "/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("boa", "bob"));
    }
}
