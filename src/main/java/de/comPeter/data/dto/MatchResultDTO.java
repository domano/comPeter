package de.comPeter.data.dto;


import lombok.Getter;

/**
 * Created by domano on 30.01.16.
 */
public class MatchResultDTO extends AbstractDTO {

    @Getter
    private final Long user;

    @Getter
    private final Boolean win;

    public MatchResultDTO(final Long id, final Long user, final Boolean win) {
        this.id = id;
        this.user = user;
        this.win = win;
    }
}
