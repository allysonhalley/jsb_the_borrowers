package com.hefti.the_borrowers.model;


import javax.persistence.*;

@Entity
@Table
public class Thing {

    @Id
    @SequenceGenerator(
            name = "thing_sequence",
            sequenceName = "thing_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "thing_sequence"
    )
    private Long id;
    private String name;
    private String type;
    private String description;

    public Thing(){

    }

    public Thing(Long id, String name, String type, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
