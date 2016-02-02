package de.comPeter.data.dto;


import lombok.Getter;

import javax.persistence.Entity;


/**
 * Created by domano on 30.01.16.
 */
@Entity
public class UserDTO extends AbstractDTO {

    @Getter
    private final String firstName;

    @Getter
    private final String lastName;

    public UserDTO(final Long id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
