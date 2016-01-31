package de.comPeter.controller

import de.comPeter.data.entity.Platform
import de.comPeter.data.entity.Game
import de.comPeter.data.entity.Location
import de.comPeter.data.entity.Match
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration

/**
 * Created by domano on 30.01.16.
 */
@ContextConfiguration
class MatchControllerTest {

    @Autowired
    MatchController matchController;

    void testCreateMatch() {
        matchController.createMatch(new Match(new Game(),new Platform("ps4"),new Location("dinos")));
        Iterable<Match> matches = matchController.getAllMatches();
        print(matches);

    }
}
