package de.comPeter.data.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by domano on 30.01.16.
 */

@RequiredArgsConstructor
public class MatchDTO extends AbstractDTO {

    @Getter
    @NonNull
    private final Long game;

    @Getter
    @NonNull
    private final Long platform;

    @Getter
    @NonNull
    private final Long location;

    @Getter
    @NonNull
    private final Set<Long> matchResults;

    public MatchDTO(Long id, Long game, Long platform, Long location, Set<Long> matchResults) {
        this(game, platform, location, matchResults);
        this.id=id;
    }

}
