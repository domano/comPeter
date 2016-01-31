package de.comPeter.data.entity;


import javax.persistence.*;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Game game;

    @OneToOne
    private Console console;

    @OneToOne
    private Location location;

    protected Match() {
    }

    public Match(final Game game, final Console console, final Location location) {
        this.game = game;
        this.console = console;
        this.location = location;
    }
}
