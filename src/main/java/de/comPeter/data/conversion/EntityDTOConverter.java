package de.comPeter.data.conversion;

import de.comPeter.data.dto.GameDTO;
import de.comPeter.data.dto.LocationDTO;
import de.comPeter.data.dto.builder.GameDTOBuilder;
import de.comPeter.data.dto.builder.GameDTOBuilderImpl;
import de.comPeter.data.entity.Game;
import de.comPeter.data.entity.Location;
import de.comPeter.data.entity.builder.GameBuilder;
import de.comPeter.data.entity.builder.GameBuilderImpl;

/**
 * Created by domano on 31.01.16.
 */
public class EntityDTOConverter {

    public static Game convertGameDTO(GameDTO gameDTO) {
        GameBuilder builder = new GameBuilderImpl();
        builder.setName(gameDTO.getName());
        return builder.createGame();
    }

    public static GameDTO convertGame(Game game) {
        GameDTOBuilder builder = new GameDTOBuilderImpl();
        builder.setName(game.getName());
        return builder.createGameDTO();
    }

}
