package de.comPeter.data.conversion;

import de.comPeter.data.dto.GameDTO;
import de.comPeter.data.entity.Game;
import org.springframework.stereotype.Component;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class GameEntityDTOConverter extends EntityDTOConverter<Game, GameDTO> {
    @Override
    public Game dtoToEntity(final GameDTO dto) {
        final Game game = new Game(dto.getName());
        transferIdFromDtoToEntity(dto, game);
        return game;
    }

    @Override
    public GameDTO entityToDto(final Game entity) {
        return new GameDTO(entity.getId(), entity.getName());
    }
}
