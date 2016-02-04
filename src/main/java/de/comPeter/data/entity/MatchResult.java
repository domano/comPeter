package de.comPeter.data.entity;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by domano on 30.01.16.
 */
@Entity

@RequiredArgsConstructor
public class MatchResult extends AbstractEntity {

    @Getter
    @Setter
    @NonNull
    @ManyToOne
    User user;

    @Getter
    @Setter
    @NonNull
    Boolean win;

    @Getter
    @Setter
    @NonNull
    @ManyToOne
    Match match;

    protected MatchResult() {
    }

}
