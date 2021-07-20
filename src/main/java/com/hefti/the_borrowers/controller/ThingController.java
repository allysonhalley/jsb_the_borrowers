package com.hefti.the_borrowers.controller;

import com.hefti.the_borrowers.model.Thing;
import com.hefti.the_borrowers.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/thing")
public class ThingController {

    private final ThingService thingService;

    @Autowired
    public ThingController(ThingService thingService) {
        this.thingService = thingService;
    }

    @PostMapping
    public void registerNewThing(@RequestBody Thing thing) throws IllegalAccessException {
        thingService.addNewThing(thing);
    }

    @GetMapping
    public List<Thing> getThings(){
        return thingService.getThings();
    }

//    @GetMapping(path = "{show/thingId}")
//    public Thing getThing(@PathVariable("thingId") Long thingId) { return thingService.getThing(thingId); }

    @DeleteMapping(path = "{thingId}")
    public void deleteThing( @PathVariable("thingId") Long thingId) {
        thingService.deleteThing(thingId);
    }

}
