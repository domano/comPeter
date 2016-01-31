package de.comPeter.data.dto.builder;

import de.comPeter.data.dto.MatchDTO;

public class MatchDTOBuilderImpl implements MatchDTOBuilder {
    private Long id;
    private Long gameDTO;
    private Long consoleDTO;
    private Long locationDTO;

    @Override
    public MatchDTOBuilder setId(final Long id) {
        this.id = id;
        return this;
    }

    @Override
    public MatchDTOBuilder setGameDTO(final Long gameDTO) {
        this.gameDTO = gameDTO;
        return this;
    }

    @Override
    public MatchDTOBuilder setConsoleDTO(final Long consoleDTO) {
        this.consoleDTO = consoleDTO;
        return this;
    }

    @Override
    public MatchDTOBuilder setLocationDTO(final Long locationDTO) {
        this.locationDTO = locationDTO;
        return this;
    }

    @Override
    public MatchDTO createMatchDTO() {
        return new MatchDTO(id, gameDTO, consoleDTO, locationDTO);
    }
}