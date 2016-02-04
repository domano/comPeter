package de.comPeter.data.dto;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

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


    public MatchDTO(Long id, Long game, Long platform, Long location) {
        this(game, platform, location);
        this.id=id;
    }

}
