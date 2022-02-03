package org.objectstyle.springboot;

import org.objectstyle.di.service.Meter;
import org.objectstyle.di.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Api {

    @Autowired
    Service service;

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String get() {
        Meter.runMetrics();
        return service.doIt();
    }
}
