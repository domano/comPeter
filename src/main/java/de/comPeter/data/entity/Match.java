package de.comPeter.data.entity;


import lombok.*;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by domano on 30.01.16.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Match extends AbstractEntity {

    @OneToOne
    @NonNull
    private Game game;

    @OneToOne
    @NonNull
    private Platform platform;

    @OneToOne
    @NonNull
    private Location location;

    @Tolerate
    protected Match() {
    }

}
