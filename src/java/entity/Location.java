/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author teraparish
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l"),
    @NamedQuery(name = "Location.findByZipcode", query = "SELECT l FROM Location l WHERE l.zipcode= :zipcode")})
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String theaterLocation;
    private String zipcode;

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (theaterLocation != null ? theaterLocation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.theaterLocation == null && other.theaterLocation != null) || (this.theaterLocation != null && !this.theaterLocation.equals(other.theaterLocation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Location[ theater Location=" + theaterLocation + " ]";
    }

}
