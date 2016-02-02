package de.comPeter.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class Game extends AbstractEntity {

    @Getter
    @Setter
    private String name;

    protected Game() {

    }

    public Game(final String name) {
        this.name = name;
    }

}
