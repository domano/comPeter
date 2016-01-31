package de.comPeter.data.entity.builder;

import de.comPeter.data.entity.Game;
import de.comPeter.data.entity.Location;
import de.comPeter.data.entity.Match;
import de.comPeter.data.entity.Platform;

public class MatchBuilderImpl implements MatchBuilder {
    private Game game;
    private Platform platform;
    private Location location;

    @Override
    public MatchBuilder setGame(final Game game) {
        this.game = game;
        return this;
    }

    @Override
    public MatchBuilder setPlatform(final Platform platform) {
        this.platform = platform;
        return this;
    }

    @Override
    public MatchBuilder setLocation(final Location location) {
        this.location = location;
        return this;
    }

    @Override
    public Match createMatch() {
        return new Match(game, platform, location);
    }
}