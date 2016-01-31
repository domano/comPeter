package de.comPeter.data.dto.builder;

import de.comPeter.data.dto.MatchDTO;

/**
 * Created by domano on 31.01.16.
 */
public interface MatchDTOBuilder {
    MatchDTOBuilder setId(Long id);

    MatchDTOBuilder setGameDTO(Long gameDTO);

    MatchDTOBuilder setConsoleDTO(Long consoleDTO);

    MatchDTOBuilder setLocationDTO(Long locationDTO);

    MatchDTO createMatchDTO();
}
