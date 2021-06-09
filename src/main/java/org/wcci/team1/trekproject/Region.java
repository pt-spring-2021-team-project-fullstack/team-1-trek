package org.wcci.team1.trekproject;

import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.*;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String image;

    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;

    public String getName() {
        return name;
    }

    @PersistenceConstructor
    public Region(String name, Continent continent) {
        this.name = name;
        this.continent = continent;
    }
}


