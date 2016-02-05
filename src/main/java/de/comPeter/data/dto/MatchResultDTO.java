package de.comPeter.data.dto;


import lombok.*;
import lombok.experimental.Tolerate;

/**
 * Created by domano on 30.01.16.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
public class MatchResultDTO extends AbstractDTO {

    @NonNull
    private final Long user;

    @NonNull
    private final Boolean win;

    @NonNull
    private final Long match;

    public MatchResultDTO(final Long id, final Long user, final Boolean win, final Long match) {
        this(user, win, match);
        this.id = id;
    }

}
