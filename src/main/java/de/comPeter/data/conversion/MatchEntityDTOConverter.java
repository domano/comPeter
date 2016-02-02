package de.comPeter.data.conversion;

import de.comPeter.data.dto.MatchDTO;
import de.comPeter.data.entity.Game;
import de.comPeter.data.entity.Location;
import de.comPeter.data.entity.Match;
import de.comPeter.data.entity.Platform;
import de.comPeter.repository.GameRepository;
import de.comPeter.repository.LocationRepository;
import de.comPeter.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class MatchEntityDTOConverter extends EntityDTOConverter<Match, MatchDTO> {

    private final GameRepository gameRepository;
    private final PlatformRepository platformRepository;
    private final LocationRepository locationRepository;

    @Autowired
    public MatchEntityDTOConverter(final GameRepository gameRepository, final PlatformRepository platformRepository, final LocationRepository locationRepository) {
        this.gameRepository = gameRepository;
        this.platformRepository = platformRepository;
        this.locationRepository = locationRepository;
    }

    @Override
    public Match dtoToEntity(final MatchDTO matchDTO) {
        final Game game = gameRepository.findOne(matchDTO.getGame());
        final Platform platform = platformRepository.findOne(matchDTO.getPlatform());
        final Location location = locationRepository.findOne(matchDTO.getLocation());
        final Match match = new Match(game, platform, location);
        transferIdFromDtoToEntity(matchDTO, match);
        return match;
    }

    @Override
    public MatchDTO entityToDto(final Match entity) {
        return new MatchDTO(entity.getId(), entity.getGame().getId(), entity.getPlatform().getId(), entity.getLocation().getId());
    }
}
