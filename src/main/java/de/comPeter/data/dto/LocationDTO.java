package de.comPeter.data.dto;


import lombok.Getter;

/**
 * Created by domano on 30.01.16.
 */
public class LocationDTO extends AbstractDTO {

    @Getter
    private final String name;

    public LocationDTO(final Long id, final String name) {
        this.name = name;
        this.id = id;
    }
}
