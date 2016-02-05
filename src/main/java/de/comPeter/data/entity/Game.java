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
public class Game extends AbstractEntity {

    @NonNull
    private String name;

    @Tolerate
    protected Game() {

    }

}
