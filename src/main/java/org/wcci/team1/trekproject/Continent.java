package org.wcci.team1.trekproject;


import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String image;
    @OneToMany(mappedBy = "continent")
    private Collection<Trek> treks;
    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Collection<Trek> getTreks() {
        return treks;
    }

    public Collection<Region> getRegions() {
        return regions;
    }

    protected Continent(){

    }

    public Continent(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}