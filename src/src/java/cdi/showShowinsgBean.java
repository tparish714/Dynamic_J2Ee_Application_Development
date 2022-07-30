/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdi;

import ejb.theaterEJB;
import entity.MovieShowing;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author teraparish
 */
@Named(value = "showShowinsgBean")
@SessionScoped
public class showShowinsgBean implements Serializable {

    @EJB
    private theaterEJB theaterEJB;

    public showShowinsgBean() {
    }

    public theaterEJB getTheaterEJB() {
        return theaterEJB;
    }

    public void setTheaterEJB(theaterEJB theaterEJB) {
        this.theaterEJB = theaterEJB;
    }
    
    // get showings
    public List<MovieShowing> showAllMovieShowings() {
        return theaterEJB.findAllShowings();
    }
}
