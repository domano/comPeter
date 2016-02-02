package de.comPeter.data.dto;


import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by domano on 30.01.16.
 */
public class MatchDTO extends AbstractDTO {

    @Getter
    private final Long game;

    @Getter
    private final Long platform;

    @Getter
    private final Long location;

    @Getter
    private final Set<Long> matchResults;


    public MatchDTO(final Long id, final Long game, final Long platform, final Long location) {
        this.id = id;
        this.game = game;
        this.platform = platform;
        this.location = location;
        this.matchResults = new HashSet<>();
    }
}
