package de.comPeter.data.dto.builder;

import de.comPeter.data.dto.GameDTO;

public class GameDTOBuilderImpl implements GameDTOBuilder {
    private long id;
    private String name;

    @Override
    public GameDTOBuilder setId(final long id) {
        this.id = id;
        return this;
    }

    @Override
    public GameDTOBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public GameDTO createGameDTO() {
        return new GameDTO(id, name);
    }
}