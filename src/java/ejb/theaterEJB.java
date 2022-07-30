/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Location;
import entity.Movie;
import entity.MovieShowing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author teraparish
 */
@Stateless
public class theaterEJB {

    @PersistenceContext(unitName = "TheaterProjectPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    // LOCATION- get all the locations
    public List<Location> findAllLocations() {
        return em.createNamedQuery("Location.findAll", Location.class).getResultList();
    }

    //LOCATION- get locations by zipcode picked
    public List<Location> getLocationsForZipcode(String zipcode) {
        return em.createNamedQuery("Location.findByZipcode", Location.class)
                .setParameter("zipcode", zipcode)
                .getResultList();
    }

    // MOVIE- get all the movies
    public List<Movie> findAllMovies() {
        return em.createNamedQuery("Movie.findAll", Movie.class).getResultList();
    }

    // MOVIE- get a movie showing list by location picked
    public List<MovieShowing> getMoviesForLocation(String theaterlocation) {

        return em.createNamedQuery("Movie.findByLocation", MovieShowing.class)
                .setParameter("theaterLocation", theaterlocation)
                .getResultList();
    }

    // MOVIE- get a movie name list without duplicate values
    public List<String> noDuplicate(List<MovieShowing> showing) {
        List<String> names = new ArrayList<>();

        for (MovieShowing ms : showing) {
            names.add(ms.getMovieShowingPK().getMovieName());
        }
        names = new ArrayList<>(new HashSet<>(names));
        return names;
    }

    // SHOWING- get all the showings 
    public List<MovieShowing> findAllShowings() {
        return em.createNamedQuery("MovieShowing.findAll", MovieShowing.class).getResultList();
    }

    // SHOWING- get showtimes by movie name and theater location
    public List<MovieShowing> getShowtimesForMovie(String movieName, String theaterLocation) {
        return em.createNamedQuery("MovieShowing.findByNameForLocation", MovieShowing.class)
                .setParameter("movieName", movieName)
                .setParameter("theaterLocation", theaterLocation)
                .getResultList();
    }

}
