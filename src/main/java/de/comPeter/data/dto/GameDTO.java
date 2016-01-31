package de.comPeter.data.dto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by domano on 30.01.16.
 */
public class GameDTO {

    private long id;

    private String name;

    public GameDTO(long id, String name) {
        this.name=name;
        this.id=id;
    }

}
