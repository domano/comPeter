package de.comPeter.data.dto;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by domano on 30.01.16.
 */
@RequiredArgsConstructor
public class GameDTO extends AbstractDTO {

    @Getter
    @NonNull
    private final String name;

    public GameDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
