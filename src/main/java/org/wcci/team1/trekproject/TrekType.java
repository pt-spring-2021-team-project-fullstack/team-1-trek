package org.wcci.team1.trekproject;

import javax.persistence.Entity;
import java.util.Collection;

@Entity
public class TrekType {

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
