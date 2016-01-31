package de.comPeter.controller;

import de.comPeter.data.entity.Match;
import de.comPeter.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by domano on 30.01.16.
 */
@RestController
public class MatchController {

    private MatchRepository matchRepository;

    @Autowired
    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @RequestMapping(path = "/match", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createMatch(@RequestParam Match match) {
        matchRepository.save(match);
    }

    @RequestMapping(path = "/match/{id}", method = RequestMethod.GET)
    public Match getMatch(@PathParam("id") Long id) {
        return matchRepository.findOne(id);
    }

    @RequestMapping(path = "/match/", method = RequestMethod.GET)
    public Iterable<Match> getAllMatches() {
        return matchRepository.findAll();
    }

}
