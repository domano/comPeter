package de.comPeter.data.dto;


import lombok.*;
import lombok.experimental.Tolerate;

/**
 * Created by domano on 30.01.16.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
public class GameDTO extends AbstractDTO {

    @NonNull
    private final String name;

    public GameDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
