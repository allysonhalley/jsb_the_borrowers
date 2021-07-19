package com.hefti.the_borrowers.service;

import com.hefti.the_borrowers.model.Thing;
import com.hefti.the_borrowers.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingService {

    private final ThingRepository thingRepository;

    @Autowired
    public ThingService(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    public List<Thing> getThings(){
        return thingRepository.findAll();
    }
}
