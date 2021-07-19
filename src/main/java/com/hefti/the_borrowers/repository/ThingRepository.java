package com.hefti.the_borrowers.repository;

import com.hefti.the_borrowers.model.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends JpaRepository<Thing, Long> {

}
