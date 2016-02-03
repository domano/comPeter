package de.comPeter.controller;

import de.comPeter.data.conversion.UserEntityDTOConverter;
import de.comPeter.data.dto.UserDTO;
import de.comPeter.data.entity.User;
import de.comPeter.repository.UserRepository;
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
public class UserController {

    private final UserRepository userRepository;

    private final UserEntityDTOConverter converter;

    @Autowired
    public UserController(final UserRepository UserRepository, final UserEntityDTOConverter converter) {
        this.userRepository = UserRepository;
        this.converter = converter;
    }

    @RequestMapping(path = "/User/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createUser(@RequestParam final UserDTO UserDTO) {
        userRepository.save(converter.dtoToEntity(UserDTO));
    }

    @RequestMapping(path = "/User/{id}", method = RequestMethod.GET)
    public User getUser(@PathParam("id") final Long id) {
        return userRepository.findOne(id);
    }

    @RequestMapping(path = "/User/", method = RequestMethod.GET)
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
