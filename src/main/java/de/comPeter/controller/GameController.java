package de.comPeter.controller;

import de.comPeter.data.conversion.GameEntityDTOConverter;
import de.comPeter.data.dto.GameDTO;
import de.comPeter.data.entity.Game;
import de.comPeter.repository.GameRepository;
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
public class GameController {

    private final GameRepository GameRepository;

    private final GameEntityDTOConverter converter;

    @Autowired
    public GameController(final GameRepository GameRepository, final GameEntityDTOConverter converter) {
        this.GameRepository = GameRepository;
        this.converter = converter;
    }

    @RequestMapping(path = "/Game/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createGame(@RequestParam final GameDTO GameDTO) {
        GameRepository.save(converter.dtoToEntity(GameDTO));
    }

    @RequestMapping(path = "/Game/{id}", method = RequestMethod.GET)
    public Game getGame(@PathParam("id") final Long id) {
        return GameRepository.findOne(id);
    }

    @RequestMapping(path = "/Game/", method = RequestMethod.GET)
    public Iterable<Game> getAllGames() {
        return GameRepository.findAll();
    }

}
