package de.comPeter.data.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class MatchResult {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    User user;

    @OneToOne
    Match match;

    private Boolean win;

    protected MatchResult() {
    }

    public MatchResult(final User user, final Match match, final Boolean win) {
        this.user = user;
        this.match = match;
        this.win = win;
    }
}
