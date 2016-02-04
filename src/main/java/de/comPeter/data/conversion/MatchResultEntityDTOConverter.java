package de.comPeter.data.conversion;

import de.comPeter.data.dto.MatchResultDTO;
import de.comPeter.data.entity.MatchResult;
import de.comPeter.repository.MatchRepository;
import de.comPeter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by domano on 02.02.16.
 */
@Component
public class MatchResultEntityDTOConverter extends EntityDTOConverter<MatchResult, MatchResultDTO> {

    private UserRepository userRepository;

    private MatchRepository matchRepository;

    @Autowired
    public MatchResultEntityDTOConverter(UserRepository userRepository, MatchRepository matchRepository) {
        this.userRepository = userRepository;
        this.matchRepository = matchRepository;
    }

    @Override
    public MatchResult dtoToEntity(final MatchResultDTO matchResultDTO) {
        MatchResult matchResult = new MatchResult(userRepository.findOne(matchResultDTO.getUser()), matchResultDTO.getWin(), matchRepository.findOne(matchResultDTO.getMatch()));
        transferIdFromDtoToEntity(matchResultDTO, matchResult);
        return matchResult;
    }

    @Override
    public MatchResultDTO entityToDto(final MatchResult entity) {
        MatchResultDTO matchResultDTO = new MatchResultDTO(entity.getId(), entity.getUser().getId(), entity.getWin(), entity.getMatch().getId());
        return matchResultDTO;
    }
}
