package de.comPeter.data.dto.builder;

import de.comPeter.data.dto.UserDTO;

/**
 * Created by domano on 31.01.16.
 */
public interface UserDTOBuilder {
    UserDTOBuilder setFirstName(String firstName);

    UserDTOBuilder setLastName(String lastName);

    UserDTO createUserDTO();
}
