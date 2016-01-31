package de.comPeter.data.entity.builder;

import de.comPeter.data.entity.Game;

/**
 * Created by domano on 31.01.16.
 */
public interface GameBuilder {
    GameBuilder setName(String name);

    Game createGame();
}
