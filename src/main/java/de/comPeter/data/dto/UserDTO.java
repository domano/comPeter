package de.comPeter.data.dto;


import lombok.*;
import lombok.experimental.Tolerate;


/**
 * Created by domano on 30.01.16.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
public class UserDTO extends AbstractDTO {

    @NonNull
    private final String firstName;

    @NonNull
    private final String lastName;

    @Tolerate
    public UserDTO(final Long id, final String firstName, final String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
