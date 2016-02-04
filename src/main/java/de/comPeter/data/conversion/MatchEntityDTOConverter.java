package de.comPeter.data.conversion;

import de.comPeter.data.dto.MatchDTO;
import de.comPeter.data.entity.*;
import de.comPeter.repository.GameRepository;
import de.comPeter.repository.LocationRepository;
import de.comPeter.repository.MatchResultRepository;
import de.comPeter.repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class MatchEntityDTOConverter extends EntityDTOConverter<Match, MatchDTO> {

    private final GameRepository gameRepository;
    private final PlatformRepository platformRepository;
    private final LocationRepository locationRepository;
    private final MatchResultRepository matchResultRepository;

    @Autowired
    public MatchEntityDTOConverter(final GameRepository gameRepository, final PlatformRepository platformRepository, final LocationRepository locationRepository, final MatchResultRepository matchResultRepository) {
        this.gameRepository = gameRepository;
        this.platformRepository = platformRepository;
        this.locationRepository = locationRepository;
        this.matchResultRepository = matchResultRepository;
    }

    @Override
    public Match dtoToEntity(final MatchDTO matchDTO) {
        final Game game = gameRepository.findOne(matchDTO.getGame());
        final Platform platform = platformRepository.findOne(matchDTO.getPlatform());
        final Location location = locationRepository.findOne(matchDTO.getLocation());
        final List<MatchResult> matchResults = new ArrayList<>();
        matchDTO.getMatchResults().forEach(id -> {
            matchResults.add(matchResultRepository.findById(id));
        });
        final Match match = new Match(game, platform, location, matchResults);
        transferIdFromDtoToEntity(matchDTO, match);
        return match;
    }

    @Override
    public MatchDTO entityToDto(final Match entity) {
        List<Long> matchResults = new ArrayList<>();
        entity.getMatchResults().forEach(e -> {
            matchResults.add(e.getId());
        });
        return new MatchDTO(entity.getId(), entity.getGame().getId(), entity.getPlatform().getId(), entity.getLocation().getId(), matchResults);
    }
}
