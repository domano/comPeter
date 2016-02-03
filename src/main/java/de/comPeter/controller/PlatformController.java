package de.comPeter.controller;

import de.comPeter.data.conversion.PlatformEntityDTOConverter;
import de.comPeter.data.dto.PlatformDTO;
import de.comPeter.data.entity.Platform;
import de.comPeter.repository.PlatformRepository;
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
public class PlatformController {

    private final PlatformRepository PlatformRepository;

    private final PlatformEntityDTOConverter converter;

    @Autowired
    public PlatformController(final PlatformRepository PlatformRepository, final PlatformEntityDTOConverter converter) {
        this.PlatformRepository = PlatformRepository;
        this.converter = converter;
    }

    @RequestMapping(path = "/Platform/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createPlatform(@RequestParam final PlatformDTO platformDTO) {
        PlatformRepository.save(converter.dtoToEntity(platformDTO));
    }

    @RequestMapping(path = "/Platform/{id}", method = RequestMethod.GET)
    public Platform getPlatform(@PathParam("id") final Long id) {
        return PlatformRepository.findOne(id);
    }

    @RequestMapping(path = "/Platform/", method = RequestMethod.GET)
    public Iterable<Platform> getAllPlatforms() {
        return PlatformRepository.findAll();
    }

}
