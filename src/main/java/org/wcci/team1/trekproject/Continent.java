package org.wcci.team1.trekproject;

import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Continent {
    @Id
    @GeneratedValue
    private Long id;
    private String image;

    private String name;

    @OneToMany(mappedBy = "continent")
    private List<Region> regions;

    public String getName() {
        return name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    @PersistenceConstructor
    public Continent(String name) {
        this.name = name;
    }
}


