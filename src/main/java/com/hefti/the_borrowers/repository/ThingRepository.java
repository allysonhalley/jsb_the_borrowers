package com.hefti.the_borrowers.repository;

import com.hefti.the_borrowers.model.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThingRepository extends JpaRepository<Thing, Long> {

    @Query("SELECT t FROM Thing t WHERE t.name = ?1")
    Optional<Thing> findByName(String name);

//    @Query("SELECT t FROM Thing t where t.id = ?1")
//    Optional<Thing> findById(Long id);
}
