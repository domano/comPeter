package de.comPeter.data.entity;


import lombok.*;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by domano on 30.01.16.
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class MatchResult extends AbstractEntity {

    @NonNull
    @ManyToOne
    User user;

    @NonNull
    Boolean win;

    @NonNull
    @ManyToOne
    Match match;

    @Tolerate
    protected MatchResult() {
    }

}
