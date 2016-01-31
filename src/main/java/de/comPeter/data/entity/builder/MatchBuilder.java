package de.comPeter.data.entity.builder;

import de.comPeter.data.entity.Game;
import de.comPeter.data.entity.Location;
import de.comPeter.data.entity.Match;
import de.comPeter.data.entity.Platform;

/**
 * Created by domano on 31.01.16.
 */
public interface MatchBuilder {
    MatchBuilder setGame(Game game);

    MatchBuilder setPlatform(Platform platform);

    MatchBuilder setLocation(Location location);

    Match createMatch();
}
