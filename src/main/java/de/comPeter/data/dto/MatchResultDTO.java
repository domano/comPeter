package de.comPeter.data.dto;


import lombok.Getter;

/**
 * Created by domano on 30.01.16.
 */
public class MatchResultDTO {

    @Getter
    private long id;

    Long user;

    Long match;

    private Boolean win;

    protected MatchResultDTO() {
    }

    public MatchResultDTO(final Long user, final Long match, final Boolean win) {
        this.user = user;
        this.match= match;
        this.win = win;
    }
}
