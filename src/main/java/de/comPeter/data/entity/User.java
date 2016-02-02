package de.comPeter.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


/**
 * Created by domano on 30.01.16.
 */
@Entity
public class User extends AbstractEntity {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    protected User() {

    }

    public User(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
