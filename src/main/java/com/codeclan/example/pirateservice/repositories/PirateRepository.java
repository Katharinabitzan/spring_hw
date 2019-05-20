package com.codeclan.example.pirateservice.repositories;

import com.codeclan.example.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

}

//pirate repository has the ability to saavae, delete etc. CRUD actions for pirates

// you tell it that it takes a Pirate object and uses the Long id type.
