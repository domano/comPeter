package de.comPeter.data.entity;


import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

/**
 * Created by domano on 30.01.16.
 */
@Entity

@RequiredArgsConstructor
public class Match extends AbstractEntity {

    @Getter
    @Setter
    @OneToOne
    @NonNull
    private Game game;

    @Getter
    @Setter
    @OneToOne
    @NonNull
    private Platform platform;

    @Getter
    @Setter
    @OneToOne
    @NonNull
    private Location location;

    @Getter
    @Setter
    @OneToMany
    @NonNull
    private Set<MatchResult> matchResults;

    protected Match() {
    }

}
