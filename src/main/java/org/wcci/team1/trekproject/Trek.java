package org.wcci.team1.trekproject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Trek {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String image;
    @ManyToOne
    private Continent continent;
    @ManyToOne
    private Region region;
    @ManyToOne
    private TrekType trekType;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }

    public Region getRegion() {
        return region;
    }

    public TrekType getTrekType() {
        return trekType;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    protected Trek() {
    }

    public Trek(String name, String description, String image, Continent continent, Region region, TrekType trekType) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.continent = continent;
        this.region = region;
        this.trekType = trekType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trek trek = (Trek) o;
        return Objects.equals(id, trek.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
