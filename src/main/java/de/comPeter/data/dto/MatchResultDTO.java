package de.comPeter.data.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by domano on 30.01.16.
 */

@RequiredArgsConstructor
public class MatchResultDTO extends AbstractDTO {

    @Getter
    @NonNull
    private final Long user;

    @Getter
    @NonNull
    private final Boolean win;

    public MatchResultDTO(final Long id, final Long user, final Boolean win) {
        this(user, win);
        this.id = id;
    }
}
