/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author teraparish
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "MovieShowing.findAll", query = "SELECT m FROM MovieShowing m"),
    @NamedQuery(name = "MovieShowing.findByNameForLocation", query = "SELECT m FROM MovieShowing m WHERE m.movieShowingsPK.movieName = :movieName "
            + "AND m.movieShowingsPK.theaterLocation= :theaterLocation")})

public class MovieShowing implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected MovieShowingPK movieShowingsPK;

    public MovieShowing() {
    }

    public MovieShowingPK getMovieShowingPK() {
        return movieShowingsPK;
    }

    public void setMovieShowingPK(MovieShowingPK movieShowingsPK) {
        this.movieShowingsPK = movieShowingsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieShowingsPK != null ? movieShowingsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieShowing)) {
            return false;
        }
        MovieShowing other = (MovieShowing) object;
        if ((this.movieShowingsPK == null && other.movieShowingsPK != null) || (this.movieShowingsPK != null && !this.movieShowingsPK.equals(other.movieShowingsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieShowing[ movieShowingsPK=" + movieShowingsPK + " ]";
    }

}
