package de.comPeter.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class Location extends AbstractEntity {

    @Getter
    @Setter
    private String name;

    protected Location() {

    }

    public Location(final String name) {
        this.name = name;
    }
}
