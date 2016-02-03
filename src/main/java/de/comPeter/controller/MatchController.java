package de.comPeter.controller;

import de.comPeter.data.conversion.MatchEntityDTOConverter;
import de.comPeter.data.dto.MatchDTO;
import de.comPeter.data.entity.Match;
import de.comPeter.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by domano on 30.01.16.
 */
@RestController
public class MatchController {

    private final MatchRepository matchRepository;

    private final MatchEntityDTOConverter converter;

    @Autowired
    public MatchController(final MatchRepository matchRepository, final MatchEntityDTOConverter converter) {
        this.matchRepository = matchRepository;
        this.converter = converter;
    }

    @RequestMapping(path = "/match/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createMatch(@RequestParam final MatchDTO matchDTO) {
        matchRepository.save(converter.dtoToEntity(matchDTO));
    }

    @RequestMapping(path = "/match/{id}", method = RequestMethod.GET)
    public Match getMatch(@PathParam("id") final Long id) {
        return matchRepository.findOne(id);
    }

    @RequestMapping(path = "/match/", method = RequestMethod.GET)
    public Iterable<Match> getAllMatches() {
        return matchRepository.findAll();
    }

}
