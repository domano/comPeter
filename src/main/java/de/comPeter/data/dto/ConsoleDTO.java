package de.comPeter.data.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by domano on 30.01.16.
 */
public class ConsoleDTO {

    private long id;

    private String name;

    protected ConsoleDTO() {
    }

    public ConsoleDTO(long id, final String name) {
        this.id=id;
        this.name = name;
    }
}
