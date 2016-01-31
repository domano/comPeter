package de.comPeter.data.dto;


import javax.persistence.*;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class MatchDTO {

    private Long id;

    private Long gameDTO;

    private Long consoleDTO;

    private Long locationDTO;

    public MatchDTO(final Long id, final Long gameDTO, final Long consoleDTO, final Long locationDTO) {
        this.id=id;
        this.gameDTO = gameDTO;
        this.consoleDTO = consoleDTO;
        this.locationDTO = locationDTO;
    }
}
