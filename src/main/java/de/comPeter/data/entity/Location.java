package de.comPeter.data.entity;


import lombok.*;

import javax.persistence.Entity;

/**
 * Created by domano on 30.01.16.
 */
@Entity

@RequiredArgsConstructor
public class Location extends AbstractEntity {

    @Getter
    @Setter
    @NonNull
    private String name;

    protected Location() {

    }
}
