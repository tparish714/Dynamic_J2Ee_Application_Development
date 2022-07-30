/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import entity.Movie;
import entity.MovieShowing;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author teraparish
 */
@Named(value = "showMoviesBean")
@SessionScoped
public class showMoviesBean implements Serializable {

    @EJB
    private theaterEJB theaterEJB;
    private String theaterLoc;
    private List<MovieShowing> showings;
    private List<MovieShowing> showtimes;
    private List<String> moviesNoDup;
    private String movie1, movie2, movie3, moviePicked;

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }

    public String getTheaterLoc() {
        return theaterLoc;
    }

    public void setTheaterLoc(String theaterLoc) {
        this.theaterLoc = theaterLoc;
    }

    public List<MovieShowing> getShowings() {
        return showings;
    }

    public void setShowings(List<MovieShowing> showings) {
        this.showings = showings;
    }

    public List<String> getMovies() {
        return moviesNoDup;
    }

    public void setMovies(List<String> moviesNoDup) {
        this.moviesNoDup = moviesNoDup;
    }

    public String getMovie1() {
        return movie1;
    }

    public void setMovie1(String movie1) {
        this.movie1 = movie1;
    }

    public String getMovie2() {
        return movie2;
    }

    public void setMovie2(String movie2) {
        this.movie2 = movie2;
    }

    public String getMovie3() {
        return movie3;
    }

    public void setMovie3(String movie3) {
        this.movie3 = movie3;
    }

    public String getMoviePicked() {
        return moviePicked;
    }

    public void setMoviePicked(String moviePicked) {
        this.moviePicked = moviePicked;
    }

    public List<MovieShowing> getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(List<MovieShowing> showtimes) {
        this.showtimes = showtimes;
    }

    public showMoviesBean() {
    }

    public List<Movie> getAllMovies() {
        return theaterEJB.findAllMovies();
    }

    // get the movie list for the location picked
    public String showMovieList(String location) {
        // pass in the location picked
        this.theaterLoc = location;
        // pass the location to the query to get a list
        this.showings = theaterEJB.getMoviesForLocation(location);
        // get a movie name list without duplicate values
        this.moviesNoDup = theaterEJB.noDuplicate(showings);
        // redirecting page
        return "MoviesByLocation.xhtml?faces-redirect=true";
    }

    public String showMovie1() {
        return moviesNoDup.get(0);
    }

    public String showMovie2() {
        return moviesNoDup.get(1);
    }

    public String showMovie3() {
        return moviesNoDup.get(2);
    }

    // get the showtime list for the movie picked
    public String showShowtimes() {
        // retrieve the parameter passed in
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        String name = params.get("name");
        this.moviePicked = name;
        // pass the movie name and theater location to get a list
        this.showtimes = theaterEJB.getShowtimesForMovie(name, this.theaterLoc);
        // redirecting page
        return "Showtimes.xhtml?faces-redirect=true";
    }

}
