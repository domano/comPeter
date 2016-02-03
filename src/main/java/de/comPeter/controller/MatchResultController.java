package de.comPeter.controller;

import de.comPeter.data.conversion.MatchResultEntityDTOConverter;
import de.comPeter.data.dto.MatchResultDTO;
import de.comPeter.data.entity.MatchResult;
import de.comPeter.repository.MatchResultRepository;
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
public class MatchResultController {

    private final MatchResultRepository MatchResultRepository;

    private final MatchResultEntityDTOConverter converter;

    @Autowired
    public MatchResultController(final MatchResultRepository MatchResultRepository, final MatchResultEntityDTOConverter converter) {
        this.MatchResultRepository = MatchResultRepository;
        this.converter = converter;
    }

    @RequestMapping(path = "/MatchResult/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createMatchResult(@RequestParam final MatchResultDTO matchResultDTO) {
        MatchResultRepository.save(converter.dtoToEntity(matchResultDTO));
    }

    @RequestMapping(path = "/MatchResult/{id}", method = RequestMethod.GET)
    public MatchResult getMatchResult(@PathParam("id") final Long id) {
        return MatchResultRepository.findOne(id);
    }

    @RequestMapping(path = "/MatchResult/", method = RequestMethod.GET)
    public Iterable<MatchResult> getAllMatchResults() {
        return MatchResultRepository.findAll();
    }

}
