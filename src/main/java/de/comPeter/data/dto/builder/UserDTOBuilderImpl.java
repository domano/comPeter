package de.comPeter.data.dto.builder;

import de.comPeter.data.dto.UserDTO;

public class UserDTOBuilderImpl implements UserDTOBuilder {
    private String firstName;
    private String lastName;

    @Override
    public UserDTOBuilder setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTO createUserDTO() {
        return new UserDTO(firstName, lastName);
    }
}