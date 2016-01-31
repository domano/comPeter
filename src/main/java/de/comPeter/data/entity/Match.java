package de.comPeter.data.entity;


import lombok.Getter;

import javax.persistence.*;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class Match {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @OneToOne
    private Game game;

    @Getter
    @OneToOne
    private Platform platform;

    @Getter
    @OneToOne
    private Location location;

    protected Match() {
    }

    public Match(final Game game, final Platform platform, final Location location) {
        this.game = game;
        this.platform = platform;
        this.location = location;
    }
}
