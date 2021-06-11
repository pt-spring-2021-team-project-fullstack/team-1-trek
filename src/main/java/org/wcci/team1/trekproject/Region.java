package org.wcci.team1.trekproject;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String image;
    @ManyToOne
    private Continent continent;

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

    public Continent getContinent() {
        return continent;
    }

    protected Region() {
    }

    public Region(String name, String description, String image, Continent continent) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.continent = continent;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}