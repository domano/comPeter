package de.comPeter.data.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

    protected MatchResult() {
    }

}
