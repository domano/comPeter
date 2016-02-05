package de.comPeter.data.entity;


import lombok.*;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;


/**
 * Created by domano on 30.01.16.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class User extends AbstractEntity {

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @Tolerate
    protected User() {

    }

}
