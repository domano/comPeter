package de.comPeter.data.dto.builder;

import de.comPeter.data.dto.GameDTO;

/**
 * Created by domano on 31.01.16.
 */
public interface GameDTOBuilder {
    GameDTOBuilder setId(long id);

    GameDTOBuilder setName(String name);

    GameDTO createGameDTO();
}
