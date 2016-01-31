package de.comPeter.data.entity.builder;

import de.comPeter.data.entity.User;

public class UserBuilderImpl implements UserBuilder {
    private String firstName;
    private String lastName;

    @Override
    public UserBuilder setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserBuilder setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public User createUser() {
        return new User(firstName, lastName);
    }
}