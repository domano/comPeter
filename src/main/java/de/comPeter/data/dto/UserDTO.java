package de.comPeter.data.dto;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


/**
 * Created by domano on 30.01.16.
 */

@RequiredArgsConstructor
public class UserDTO extends AbstractDTO {

    @Getter
    @NonNull
    private final String firstName;

    @Getter
    @NonNull
    private final String lastName;

    public UserDTO(final Long id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
