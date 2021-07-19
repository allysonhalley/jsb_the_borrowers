package com.hefti.the_borrowers.controller;

import com.hefti.the_borrowers.model.Thing;
import com.hefti.the_borrowers.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/thing")
public class ThingController {

    private final ThingService thingService;

    @Autowired
    public ThingController(ThingService thingService) {
        this.thingService = thingService;
    }

    @GetMapping
    public List<Thing> getThings(){
        return thingService.getThings();
    }

}
