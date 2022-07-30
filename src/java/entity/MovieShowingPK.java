/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author teraparish
 */
@Embeddable
public class MovieShowingPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    private String theaterLocation;

    @Basic(optional = false)
    @NotNull
    private String showtime;

    @Basic(optional = false)
    @NotNull
    private String movieName;

    public MovieShowingPK() {
    }

    public MovieShowingPK(String movieName, String theaterLocation) {
        this.movieName = movieName;
        this.theaterLocation = theaterLocation;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieName != null ? movieName.hashCode() : 0);
        hash += (theaterLocation != null ? theaterLocation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieShowingPK)) {
            return false;
        }
        MovieShowingPK other = (MovieShowingPK) object;
        if ((this.movieName == null && other.movieName != null) || (this.movieName != null && !this.movieName.equals(other.movieName))) {
            return false;
        }

        if ((this.theaterLocation == null && other.theaterLocation != null) || (this.theaterLocation != null && !this.theaterLocation.equals(other.theaterLocation))) {
            return false;
        }

        if ((this.showtime == null && other.showtime != null) || (this.showtime != null && !this.showtime.equals(other.showtime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieShowingPK[ movie name=" + movieName + ", theater location=" + theaterLocation + ", showtime=" + showtime + " ]";
    }

}
