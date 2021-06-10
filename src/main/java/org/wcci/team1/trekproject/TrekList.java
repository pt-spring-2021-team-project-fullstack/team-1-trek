package org.wcci.team1.trekproject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TrekList {

    @Id
    @GeneratedValue
    private Long id;
    private String nameOfTrek;
    private String continentOfTrek;
    private String regionOfTrek;
    private String trekDescription;
    private String trekImage;


    @ManyToOne
    private String typeOfTrek;

    public Long getId() {
        return id;
    }

    public String getNameOfTrek() {
        return nameOfTrek;
    }

    public String getContinentOfTrek() {
        return continentOfTrek;
    }

    public String getRegionOfTrek() {
        return regionOfTrek;
    }

    public String getTypeOfTrek() {
        return typeOfTrek;
    }

    public TrekList(String nameOfTrek, String continentOfTrek, String regionOfTrek, String typeOfTrek) {
        this.nameOfTrek = nameOfTrek;
        this.continentOfTrek = continentOfTrek;
        this.regionOfTrek = regionOfTrek;
        this.typeOfTrek = typeOfTrek;
    }
}
