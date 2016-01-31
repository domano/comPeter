package de.comPeter.data.dto;


import lombok.Getter;

import javax.persistence.*;

/**
 * Created by domano on 30.01.16.
 */
public class MatchDTO {

    @Getter
    private Long id;

    @Getter
    private Long gameDTO;

    @Getter
    private Long consoleDTO;

    @Getter
    private Long locationDTO;

    public MatchDTO(final Long id, final Long gameDTO, final Long consoleDTO, final Long locationDTO) {
        this.id=id;
        this.gameDTO = gameDTO;
        this.consoleDTO = consoleDTO;
        this.locationDTO = locationDTO;
    }
}
