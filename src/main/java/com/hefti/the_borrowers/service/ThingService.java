package com.hefti.the_borrowers.service;

import com.hefti.the_borrowers.model.Thing;
import com.hefti.the_borrowers.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

//    public Thing getThing(Long id){
//        Optional<Thing> thingOptional = thingRepository.findById(id);
//        if (thingOptional.isPresent()) {
//            throw new IllegalArgumentException("ID not found!");
//        };
//        return thingRepository.findById(id);
//    }

    public void addNewThing(Thing thing){
        Optional<Thing> thingOptional = thingRepository.findByName(thing.getName());
        if (thingOptional.isPresent()){
            throw new IllegalArgumentException("Name already!");
        }
        thingRepository.save(thing);
    }

    public void deleteThing(Long thingId){
        boolean exists = thingRepository.existsById(thingId);
        if (!exists) {
            throw new IllegalStateException( "thing with id " + thingId + "does not exists!");
        }
        thingRepository.deleteById(thingId);
    }
}
