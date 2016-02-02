package de.comPeter.data.dto;


import lombok.Getter;

/**
 * Created by domano on 30.01.16.
 */
public class GameDTO extends AbstractDTO {

    @Getter
    private final String name;

    public GameDTO(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

}
