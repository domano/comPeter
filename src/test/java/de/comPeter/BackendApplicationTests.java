package de.comPeter;

import com.google.common.collect.Lists;
import de.comPeter.controller.*;
import de.comPeter.data.conversion.MatchEntityDTOConverter;
import de.comPeter.data.dto.*;
import de.comPeter.data.entity.*;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    MatchEntityDTOConverter matchEntityDTOConverter;


    @Test
    public void testMatchSaveAPI() {

        Game game = testGameSaveAPI();
        Platform platform = testPlatformSaveAPI();
        Location location = testLocationSaveAPI();


        MatchDTO matchDTO = new MatchDTO(game.getId(), platform.getId(), location.getId());
        Match match = matchController.createMatch(matchDTO);
        matchDTO = matchEntityDTOConverter.entityToDto(match);
        MatchResult matchResult = testMatchResultSaveAPI(matchDTO);
        List<Match> results = Lists.newArrayList(matchController.getAllMatches());
        List<MatchResult> matchResults = Lists.newArrayList(matchResultController.getMatchResultsByMatch(matchDTO));
        assert results.size()==1;

        System.out.println("Game: "+match.getGame().getName());
        System.out.println("Location: "+match.getLocation().getName());
        System.out.println("Platform: "+match.getPlatform().getName());
        System.out.println("User: "+matchResults.toArray(new MatchResult[10])[0].getUser().getFirstName());
        System.out.println("Result: "+matchResults.toArray(new MatchResult[10])[0].getWin());
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

    public MatchResult testMatchResultSaveAPI(MatchDTO matchDTO) {
        User user = testUserSaveAPI();
        MatchResultDTO matchResultDTO = new MatchResultDTO(user.getId(), true, matchDTO.getId());
        matchResultController.createMatchResult(matchResultDTO);
        List<MatchResult> result = Lists.newArrayList(matchResultController.getAllMatchResults());
        assert  result.size()==1;
        return result.get(0);
    }
}
