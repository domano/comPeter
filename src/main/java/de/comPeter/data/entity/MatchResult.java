package de.comPeter.data.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class MatchResult extends AbstractEntity {

    @Getter
    @Setter
    @ManyToOne
    User user;

    @Getter
    @Setter
    Boolean win;

    protected MatchResult() {
    }

    public MatchResult(final User user, final Boolean win) {
        this.user = user;
        this.win= win;
    }
}
