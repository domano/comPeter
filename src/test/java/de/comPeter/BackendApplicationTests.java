package de.comPeter;

import com.google.common.collect.Lists;
import de.comPeter.controller.*;
import de.comPeter.data.dto.*;
import de.comPeter.data.entity.*;
import org.hibernate.metamodel.relational.Tuple;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BackendApplication.class)
@WebAppConfiguration
public class BackendApplicationTests {

    @Autowired
    MatchController matchController;

    @Autowired
    GameController gameController;

    @Autowired
    PlatformController platformController;

    @Autowired
    LocationController locationController;

    @Autowired
    UserController userController;

    @Autowired
    MatchResultController matchResultController;

    @Test
    public void testMatchSaveAPI() {

        Game game = testGameSaveAPI();
        Platform platform = testPlatformSaveAPI();
        Location location = testLocationSaveAPI();
        MatchResult matchResult = testMatchResultSaveAPI();

        Set<Long> matchResultSet = new HashSet<>();
        matchResultSet.add(matchResult.getId());

        MatchDTO matchDTO = new MatchDTO(game.getId(), platform.getId(), location.getId(), matchResultSet);
        matchController.createMatch(matchDTO);
        List<Match> results = Lists.newArrayList(matchController.getAllMatches());
        assert results.size()==1;

        Match match = results.get(0);
        System.out.println("Game: "+match.getGame().getName());
        System.out.println("Location: "+match.getLocation().getName());
        System.out.println("Platform: "+match.getPlatform().getName());
        System.out.println("User: "+match.getMatchResults().toArray(new MatchResult[10])[0].getUser().getFirstName());
        System.out.println("Result: "+match.getMatchResults().toArray(new MatchResult[10])[0].getWin());
    }

    public Game testGameSaveAPI() {
        GameDTO gameDTO = new GameDTO("Tekken 3");
        gameController.createGame(gameDTO);
        List<Game> result = Lists.newArrayList(gameController.getAllGames());
        assert result.size() == 1;
        return result.get(0);
    }

    public Platform testPlatformSaveAPI() {
        PlatformDTO platformDTO = new PlatformDTO("PS1");
        platformController.createPlatform(platformDTO);
        List<Platform> result = Lists.newArrayList(platformController.getAllPlatforms());
        assert result.size() == 1;
        return result.get(0);
    }

    public Location testLocationSaveAPI() {
        LocationDTO locationDTO = new LocationDTO("Zuhause");
        locationController.createLocation(locationDTO);
        List<Location> result = Lists.newArrayList(locationController.getAllLocations());
        assert result.size()==1;
        return result.get(0);
    }

    public User testUserSaveAPI() {
        UserDTO userDTO = new UserDTO("Horst","Adler");
        userController.createUser(userDTO);
        List<User> result = Lists.newArrayList(userController.getAllUsers());
        assert result.size()==1;
        return result.get(0);
    }

    public MatchResult testMatchResultSaveAPI() {
        User user = testUserSaveAPI();
        MatchResultDTO matchResultDTO = new MatchResultDTO(user.getId(), true);
        matchResultController.createMatchResult(matchResultDTO);
        List<MatchResult> result = Lists.newArrayList(matchResultController.getAllMatchResults());
        assert  result.size()==1;
        return result.get(0);
    }
}
