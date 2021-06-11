package org.wcci.team1.trekproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class TrekType {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String image;
    @OneToMany(mappedBy = "trekType")
    private Collection<Trek> treks;

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getImage(){
        return image;
    }
    public Collection<Trek> getTreks() {
        return treks;
    }

    protected TrekType(){
    }

    public TrekType(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrekType trekType = (TrekType) o;
        return Objects.equals(id, trekType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


