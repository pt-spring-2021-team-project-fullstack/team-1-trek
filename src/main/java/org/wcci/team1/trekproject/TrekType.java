package org.wcci.team1.trekproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class TrekType {
    @Id
    @GeneratedValue
    private Long id;

    private String trekType;

    private Collection<TrekList> trekList;

    public String getTrekType() {
        return trekType;
    }

    public TrekType(String trekType) {
        this.trekType = trekType;
    }

    public Collection<TrekList> getTrekList() {

        return trekList;
    }
}


