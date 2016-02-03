package de.comPeter.data.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by domano on 30.01.16.
 */

@RequiredArgsConstructor
public class PlatformDTO extends AbstractDTO {

    @Getter
    @NonNull
    private final String name;

    public PlatformDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
