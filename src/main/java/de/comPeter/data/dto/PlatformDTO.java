package de.comPeter.data.dto;


import lombok.Getter;

/**
 * Created by domano on 30.01.16.
 */
public class PlatformDTO extends AbstractDTO {

    @Getter
    private final String name;

    public PlatformDTO(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }
}
