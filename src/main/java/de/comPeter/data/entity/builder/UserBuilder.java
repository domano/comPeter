package de.comPeter.data.entity.builder;

import de.comPeter.data.entity.User;

/**
 * Created by domano on 31.01.16.
 */
public interface UserBuilder {
    UserBuilder setFirstName(String firstName);

    UserBuilder setLastName(String lastName);

    User createUser();
}
