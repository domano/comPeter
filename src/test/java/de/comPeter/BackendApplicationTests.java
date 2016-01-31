package de.comPeter;

import de.comPeter.controller.MatchController;
import de.comPeter.data.entity.Console;
import de.comPeter.data.entity.Game;
import de.comPeter.data.entity.Location;
import de.comPeter.data.entity.Match;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BackendApplication.class)
@WebAppConfiguration
public class BackendApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Autowired
	MatchController matchController;

	@Test
	public void testCreateMatch() {
		matchController.createMatch(new Match(new Game(),new Console("ps4"),new Location("dinos")));
		Iterable<Match> matches = matchController.getAllMatches();
		String s = "pups";
	}

}
