package de.comPeter.data.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by domano on 30.01.16.
 */
@Entity
public class MatchResultDTO {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    UserDTO userDTO;

    @OneToOne
    MatchDTO matchDTO;

    private Boolean win;

    protected MatchResultDTO() {
    }

    public MatchResultDTO(final UserDTO userDTO, final MatchDTO matchDTO, final Boolean win) {
        this.userDTO = userDTO;
        this.matchDTO = matchDTO;
        this.win = win;
    }
}
