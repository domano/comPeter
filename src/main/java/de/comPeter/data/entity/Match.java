package de.comPeter.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class Match extends AbstractEntity {

    @Getter
    @Setter
    @OneToOne
    private Game game;

    @Getter
    @Setter
    @OneToOne
    private Platform platform;

    @Getter
    @Setter
    @OneToOne
    private Location location;

    @Getter
    @Setter
    @OneToMany
    private Set<MatchResult> matchResults;

    protected Match() {
    }

    public Match(final Game game, final Platform platform, final Location location) {
        this.game = game;
        this.platform = platform;
        this.location = location;
    }
}
