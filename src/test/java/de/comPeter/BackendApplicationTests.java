package de.comPeter;

import de.comPeter.controller.MatchController;
import de.comPeter.data.entity.*;
import de.comPeter.data.entity.builder.GameBuilderImpl;
import de.comPeter.data.entity.builder.MatchBuilderImpl;
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
		matchController.createMatch(new MatchBuilderImpl().setGame(new GameBuilderImpl().createGame()).setPlatform(new Platform("ps4")).setLocation(new Location("dinos")).createMatch());
		Iterable<Match> matches = matchController.getAllMatches();
		String s = "pups";
	}

}
