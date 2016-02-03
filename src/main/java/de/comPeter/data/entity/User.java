package de.comPeter.data.entity;


import lombok.*;

import javax.persistence.Entity;


/**
 * Created by domano on 30.01.16.
 */
@Entity

@RequiredArgsConstructor
public class User extends AbstractEntity {

    @Getter
    @Setter
    @NonNull
    private String firstName;

    @Getter
    @Setter
    @NonNull
    private String lastName;

    protected User() {

    }

}
