package de.comPeter.data.conversion;

import de.comPeter.data.dto.UserDTO;
import de.comPeter.data.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class UserEntityDTOConverter extends EntityDTOConverter<User, UserDTO> {

    @Override
    public User dtoToEntity(final UserDTO userDTO) {
        final User user = new User(userDTO.getFirstName(), userDTO.getLastName());
        transferIdFromDtoToEntity(userDTO, user);
        return user;
    }

    @Override
    public UserDTO entityToDto(final User entity) {
        return new UserDTO(entity.getId(), entity.getFirstName(), entity.getLastName());
    }
}
