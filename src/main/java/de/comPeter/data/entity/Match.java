package de.comPeter.data.entity;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by domano on 30.01.16.
 */
@Entity

@RequiredArgsConstructor
public class Match extends AbstractEntity {

    @Getter
    @Setter
    @OneToOne
    @NonNull
    private Game game;

    @Getter
    @Setter
    @OneToOne
    @NonNull
    private Platform platform;

    @Getter
    @Setter
    @OneToOne
    @NonNull
    private Location location;

    protected Match() {
    }

}
