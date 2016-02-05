package de.comPeter.data.dto;


import lombok.*;
import lombok.experimental.Tolerate;

import java.util.List;

/**
 * Created by domano on 30.01.16.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
public class MatchDTO extends AbstractDTO {

    @NonNull
    private final Long game;

    @NonNull
    private final Long platform;

    @NonNull
    private final Long location;


    public MatchDTO(Long id, Long game, Long platform, Long location) {
        this(game, platform, location);
        this.id=id;
    }

}
