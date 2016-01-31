package de.comPeter.data.dto;


import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by domano on 30.01.16.
 */
@Entity
public class UserDTO {

    @Getter
    private long id;

    private String firstName;
    private String lastName;

    public UserDTO(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
