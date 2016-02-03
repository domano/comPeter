package de.comPeter.controller;

import de.comPeter.data.conversion.LocationEntityDTOConverter;
import de.comPeter.data.dto.LocationDTO;
import de.comPeter.data.entity.Location;
import de.comPeter.repository.LocationRepository;
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
public class LocationController {

    private final LocationRepository locationRepository;

    private final LocationEntityDTOConverter converter;

    @Autowired
    public LocationController(final LocationRepository LocationRepository, final LocationEntityDTOConverter converter) {
        this.locationRepository = LocationRepository;
        this.converter = converter;
    }

    @RequestMapping(path = "/Location/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createLocation(@RequestParam final LocationDTO LocationDTO) {
        locationRepository.save(converter.dtoToEntity(LocationDTO));
    }

    @RequestMapping(path = "/Location/{id}", method = RequestMethod.GET)
    public Location getLocation(@PathParam("id") final Long id) {
        return locationRepository.findOne(id);
    }

    @RequestMapping(path = "/Location/", method = RequestMethod.GET)
    public Iterable<Location> getAllLocations() {
        return locationRepository.findAll();
    }

}
