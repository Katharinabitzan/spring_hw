package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.models.Ship;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import com.codeclan.example.pirateservice.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceApplicationTests {

	//make me a pirate repository. Dependency injection.. make this mythical thing and store it in pirateRepository
	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	//check that the app loads / runs without crashing
	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate will = new Pirate("will", "smith", 40, ship);
		Raid raid1 = new Raid("Edinburgh", 12);

		will.addRaid(raid1);
		pirateRepository.save(will);

		raidRepository.save(raid1);


	}


}
