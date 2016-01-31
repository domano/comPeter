package de.comPeter.data.entity.builder;

import de.comPeter.data.entity.Game;

public class GameBuilderImpl implements GameBuilder {
    private String name;

    @Override
    public GameBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public Game createGame() {
        return new Game(name);
    }
}